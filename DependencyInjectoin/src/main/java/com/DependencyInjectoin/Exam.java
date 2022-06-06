package com.DependencyInjectoin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
//		Student st = new Student();

//		st.studentName = "Esa ";

//		st.setStudentName("Esa Chatterjee");

		ApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
		// -------setter injection
//		Student stu = ap.getBean("student", Student.class);
//		Student stu1 = ap.getBean("student1",Student.class);
//
//		stu.displayName();
//		stu1.displayName();

		// -------constructor injection

		Student stu = ap.getBean("student", Student.class);

		Student stu1 = ap.getBean("student3", Student.class);

		stu.displayName();
		stu1.displayName();
	}

}
