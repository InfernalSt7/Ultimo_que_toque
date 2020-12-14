package com.spring.ultimoquetoque.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.ultimoquetoque.model.EntrenadorModel;

@Component
public class EntrenadorValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return EntrenadorModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		EntrenadorModel em=(EntrenadorModel)target;
		

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre","El campo nombre es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellidos", "required.apellidos","El campo apellidos es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pais", "required.pais","El campo pais es obligatorio");
		
		if(em.getNombre().length()>100) {
			errors.rejectValue("nombre", "nombre.incorrect", "El nombre debe tener un tamaño menor que 100 caracteres");
		}
		
		if(em.getApellidos().length()>100) {
			errors.rejectValue("apellidos", "apellidos.incorrect", "Los apellidos deben tener un tamaño menor que 100 caracteres");
		}
		
		if(em.getPais().length()>100) {
			errors.rejectValue("pais", "pais.incorrect", "El pais debe tener un tamaño menor que 100 caracteres");
		}
		
		
		
	}


}
