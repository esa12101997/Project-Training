package com.spring_common_annotation8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Collage {

//	@Value("${collage.name}")
	private String collageName;
	@Required
	@Value("${collage.name}")
	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	@Autowired
	private Principle princliple;

	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

//	public Collage(Principle princliple) {
//		this.princliple = princliple;
//	}

	public void test() {
		teacher.teach();
		princliple.principleInfo();
		System.out.println("testing this Collage class method");
		System.out.println("My collage name is " + collageName);
	}

	public Teacher getTeacher() {
		return teacher;
	}

//	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

//	@Autowired
	public void setPrincliple(Principle princliple) {
		this.princliple = princliple;
		System.out.println("principle setter injection method");
	}

}
