package com.spring_common_annotation8;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("I'm you math teacher");
		System.out.println("my name is lamba sir");
		
	}

}
