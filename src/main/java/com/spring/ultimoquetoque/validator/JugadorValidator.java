package com.spring.ultimoquetoque.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.ultimoquetoque.model.JugadorModel;

@Component
public class JugadorValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return JugadorModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		JugadorModel jm=(JugadorModel)target;
		

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre","El campo nombre es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "apellidos", "required.apellidos","El campo apellidos es obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pais", "required.pais","El campo pais es obligatorio");
		
		if(jm.getNombre().length()>100) {
			errors.rejectValue("nombre", "nombre.incorrect", "El nombre debe tener un tamaño menor que 100 caracteres");
		}
		
		if(jm.getApellidos().length()>100) {
			errors.rejectValue("apellidos", "apellidos.incorrect", "Los apellidos deben tener un tamaño menor que 100 caracteres");
		}
		
		if(jm.getDorsal()<=0) {
			errors.rejectValue("dorsal", "dorsal.incorrect", "El dorsal no puede ser menor o igual a 0");
		}
		
		if(jm.getPais().length()>100) {
			errors.rejectValue("pais", "pais.incorrect", "El pais debe tener un tamaño menor que 100 caracteres");
		}
		
		
	}


}
