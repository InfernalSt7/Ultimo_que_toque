package com.spring.ultimoquetoque.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.ultimoquetoque.model.UserModel;

@Component
public class RegistroValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return UserModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		UserModel user=(UserModel)target;
		

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required.nombre","El campo nombre es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password","El campo contraseña es obligatorio");
		
		if(user.getUsername().length()>50) {
			errors.rejectValue("username", "username.incorrect", "El nombre debe tener un tamaño menor que 50 caracteres");
		}
		
		
		if(user.getPassword().length()>500) {
			errors.rejectValue("password", "password.incorrect", "La contraseña debe tener un tamaño menor que 500 caracteres");
		}
		
		if(user.getPassword().length()<4) {
			errors.rejectValue("password", "password.incorrect", "La contraseña debe tener más de 4 caracteres");
		}
		
		
	}

}
