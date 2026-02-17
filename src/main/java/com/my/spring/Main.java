package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.my.spring.model.Address;
import com.my.spring.model.employee;

public class Main {

	public static void main(String[] args) {

		
		ApplicationContext ioc=new AnnotationConfigApplicationContext("com.my.spring");
employee bean=	ioc.getBean(employee.class);

Address bean1=ioc.getBean(Address.class);

bean1.setCity("Badaun");
bean1.setState("UP");

System.out.println(bean1);

bean.setName("Arpit Kumar");
bean.setId(101);
bean.setGender("male");
System.out.println(bean);

	}

}
