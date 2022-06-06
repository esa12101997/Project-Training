package com.ValueRequiredAnnotation7;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;

	@Value("${student.interestedCourse}")
	private String interestedCourse;

	@Value("${student.hobbys}")
	private String hobbys;
//
//	// @Required 
//	public void setName(String name) { this.name = name;
//	System.out.println("name");
//	}
//
//	// @Required 
//	public void setInterestedCourse(String interestedCourse) {
//	this.interestedCourse=interestedCourse;System.out.println("interestedCourse");
//
//	}
//
//	// @Required
//	public void setHobbys(String hobbys) { this.hobbys = hobbys;
//	System.out.println("hobbys");}

	public void displayStudentInfo() {
		System.out.println("student name is " + name + "interestedCouse" + interestedCourse + " bobbys" + hobbys);
	}

}
