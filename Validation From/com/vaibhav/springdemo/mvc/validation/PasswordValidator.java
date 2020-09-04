package com.vaibhav.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<Password, String> {

	
	private Pattern pattern;
	private Matcher matcher;

	private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

	public void initialize(Password thePassword) {
		
	}

	@Override
	public boolean isValid(String password, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean flag = false;
		pattern = Pattern.compile(PASSWORD_PATTERN);
		matcher = pattern.matcher(password);
		if(password.length()>6&&password.length()<20)
		{
			flag=true;
		}
		return (matcher.matches()&&flag);
	}

}
