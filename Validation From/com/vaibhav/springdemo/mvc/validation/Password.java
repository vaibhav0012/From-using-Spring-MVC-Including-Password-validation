package com.vaibhav.springdemo.mvc.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
	
	public String message() default "Password should contain atleaset one uppercase letter, one number and one special character";
	Class<?>[] groups() default {};
	 
    Class<? extends Payload>[] payload() default {};

}
