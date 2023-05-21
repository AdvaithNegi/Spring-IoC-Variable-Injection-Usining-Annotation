package com.jsp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value = "101")
	int id;
	@Value(value = "Advaith")
	String name;
	@Value(value = "advaith@mail.com")
	String email;

	public void print() {

		System.out.println("ID is    : " + id);
		System.out.println("Name is  : " + name);
		System.out.println("Email is : " + email);

	}

}
