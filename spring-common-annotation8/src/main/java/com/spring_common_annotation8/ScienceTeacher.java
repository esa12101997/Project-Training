package com.spring_common_annotation8;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher  {

	public void teach() {
	System.out.println("I'm youor science teacher");
	System.out.println("my name is sai");
		
	}

}
