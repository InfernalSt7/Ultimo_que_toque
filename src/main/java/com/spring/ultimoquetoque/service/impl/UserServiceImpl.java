package com.spring.ultimoquetoque.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.Equipo;
import com.spring.ultimoquetoque.entity.User_Role;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.UserModel;
import com.spring.ultimoquetoque.repository.UserRepository;
import com.spring.ultimoquetoque.service.UserService;


@Service("userServiceImpl")
public class UserServiceImpl implements UserDetailsService, UserService{
	
	private User buildUser(com.spring.ultimoquetoque.entity.User user,
		List<GrantedAuthority> authorities) {
	return new User(user.getUsername(),user.getPassword(),user.isEnabled(),true,true,true,authorities);
	}
	
	private List<GrantedAuthority> buildAuthorities(Set<User_Role> userRoles){
		Set<GrantedAuthority> auths = new HashSet<GrantedAuthority>();
		
		for(User_Role user_Role: userRoles) {
			auths.add(new SimpleGrantedAuthority(user_Role.getRole()));
		}
		
		return new ArrayList<GrantedAuthority>(auths);
	}

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.spring.ultimoquetoque.entity.User user = userRepository.findByUsername(username);
		List<GrantedAuthority> authorities = buildAuthorities(user.getUser_Role());	
		return buildUser(user, authorities);
	}
	
	@Override
	public com.spring.ultimoquetoque.entity.User addUser(com.spring.ultimoquetoque.entity.User user) {
		user.setEnabled(true);
		return userRepository.save(user);
		
        
	}

	@Override
	public List<UserModel> listUsers() {
		List<com.spring.ultimoquetoque.entity.User> listaU=userRepository.findAll();
        List<UserModel> listaUM=new ArrayList<>();
        listaU.forEach(a->{
        	UserModel userModel=transform(a);
            listaUM.add(userModel);
        });

        Collections.sort(listaUM, (UserModel u1, UserModel u2) -> u1.getNombre().compareTo(u2.getNombre()));

        return listaUM;
	}

	@Override
	public UserModel updateUser(UserModel userModel) {
		com.spring.ultimoquetoque.entity.User user=transform(userModel);
	    return transform(userRepository.save(user));
	}

	@Override
	public int deleteUser(int id) {
		userRepository.deleteById(id);
		return 0;
	}

	@Override
	public com.spring.ultimoquetoque.entity.User transform(UserModel userModel) {
		return dozer.map(userModel, com.spring.ultimoquetoque.entity.User.class);
	}

	@Override
	public UserModel transform(com.spring.ultimoquetoque.entity.User user) {
		return dozer.map(user, UserModel.class);
	}
}
