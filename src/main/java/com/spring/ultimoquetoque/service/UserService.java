package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.User;
import com.spring.ultimoquetoque.model.UserModel;



public interface UserService {

	public abstract User addUser(User user);
	//listar usuarios
	public abstract List<UserModel> listUsers();
	
	public abstract UserModel updateUser(UserModel userModel);
	
	public abstract int deleteUser(int id);
			
	//transformar entidad a modelo
	public abstract User transform(UserModel userModel);
						
	//transformar modelo a entidad
	public abstract UserModel transform(User user);
		
}
