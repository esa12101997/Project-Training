package com.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {


	@Autowired
	@Qualifier("humanheart")
	private Heart heart;

//	public Human() {
//		System.out.println("Constuctor getting called");
//	}
//
////	@Autowired
//	public Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("one parameter Constuctor getting called");
//	}
//
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		System.out.println("setter method getting called");
//	}
//-------@Autowire first looking bytype then it is looking byname
	public void humanHeart() {
		if (heart != null) {
			heart.pumping();
			System.out.println("name of animla" + heart.getAnimal() + " number of heart is " + heart.getNoOfHeart());
		} else {
			System.out.println("You are dead ");
		}
	}

}
