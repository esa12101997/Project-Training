package com.Autowiring;

public class Heart {

	private String animal;
	private int noOfHeart;
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public String getAnimal() {
		return animal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void pumping() {
		System.out.println("Heart is pumping");
	}

}
