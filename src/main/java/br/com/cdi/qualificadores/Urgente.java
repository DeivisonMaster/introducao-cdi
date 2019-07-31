package br.com.cdi.qualificadores;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier	// define um qualificador
@Retention(RetentionPolicy.RUNTIME)		
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})	// Definindo o uso da anotação em: type: classe / method: método
public @interface Urgente {
	
}
