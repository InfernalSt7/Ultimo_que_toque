package com.spring.ultimoquetoque.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.ultimoquetoque.model.EquipoModel;

@Component
public class EquipoValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return EquipoModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		EquipoModel em=(EquipoModel)target;
		

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre","El campo nombre del equipo es obligatorio");
		
		if(em.getNombre().length()>100) {
			errors.rejectValue("nombre", "nombre.incorrect", "El nombre del equipo debe tener un tamaño menor que 100 caracteres");
		}
		
		if(em.getEstadio().length()>100) {
			errors.rejectValue("estadio", "estadio.incorrect", "El nombre del estadio debe tener un tamaño menor que 100 caracteres");
		}
		
		if(em.getPresidente().length()>100) {
			errors.rejectValue("presidente", "presidente.incorrect", "El nombre del presidente debe tener un tamaño menor que 100 caracteres");
		}
		
		
		
	}


}
