package com.vaibhav.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.vaibhav.springdemo.mvc.validation.CourseCode;
import com.vaibhav.springdemo.mvc.validation.Password;

public class Customer {
private String firstName;

@NotNull(message="is required")
@Size(min=1, message="is required")
private String lastName;

@NotNull(message="is required")
@Min(value=0, message="Value must be greater than equal to 0")
@Max(value=10, message="Value must be less than equal to 10")
private Integer freePasses;

@Pattern(regexp="^[a-zA-Z0-9]{5}",message="ovey 5 char or digits")
private String postalCode;

@Password
private String password;

@CourseCode
private String courseCode;

@Password
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public Integer getFreePasses() {
	return freePasses;
}
public void setFreePasses(Integer freePasses) {
	this.freePasses = freePasses;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
}
