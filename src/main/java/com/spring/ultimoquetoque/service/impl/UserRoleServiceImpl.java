package com.spring.ultimoquetoque.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.User_Role;
import com.spring.ultimoquetoque.repository.User_RoleRepository;
import com.spring.ultimoquetoque.service.User_RoleService;

@Service
public class UserRoleServiceImpl implements User_RoleService {
    
    @Autowired
    @Qualifier("userRoleRepository")
    private User_RoleRepository userRoleRepository;
    
    @Override
	public User_Role addUser(User_Role user_Role) {
		return userRoleRepository.save(user_Role);
	}


}