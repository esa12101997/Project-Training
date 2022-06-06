package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");
		
		//---------------------------

//		Airtel air = (Airtel) ac.getBean("airtel");
//
//		air.calling();
//		air.data();
		//===================
//		VodaPhone voda = ac.getBean("vodaphone",VodaPhone.class);
//		
//		voda.calling();
//		voda.data();
		//-===============
		Sim sim= ac.getBean("sim",Sim.class);
		
		sim.calling();
		sim.data();

//		Airtel air= new Airtel();
//		
//		air.calling();
//		air.data();
//		
//		System.out.println("----------");
//		
//		VodaPhone vp =new VodaPhone();
//		
//		vp.calling();
//		vp.data();

//		Sim sim= new Airtel();
		// --------------------
//		Sim sim =new VodaPhone();
//		sim.calling();
//		sim.data();
	}

}
