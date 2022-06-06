package com.spring_common_annotation8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(CollageConfiguration.class);
		System.out.println("xml beans is loaded");
		Collage coll = ac.getBean("collage",Collage.class);
		System.out.println("Collage object is created"+coll);
		coll.test();
	}

}
