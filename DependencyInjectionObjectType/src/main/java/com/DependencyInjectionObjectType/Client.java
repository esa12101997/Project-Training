package com.DependencyInjectionObjectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*
		 * Student st = new Student(); MathCheat mc = new MathCheat();
		 * st.setMathCheat(mc); st.chating();
		 */

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("class is loaded");
		Student st = ac.getBean("stu", Student.class);

		st.chating();

		AnotherStudent ast = ac.getBean("anotehrStu", AnotherStudent.class);
		ast.chating();
	}

}
