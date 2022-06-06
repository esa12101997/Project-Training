package com.ValueRequiredAnnotation7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Student st = ac.getBean("student", Student.class);
		st.displayStudentInfo();

	}
}
