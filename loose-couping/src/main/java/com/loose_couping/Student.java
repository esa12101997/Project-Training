package com.loose_couping;

public class Student {

//	private MathCheating mathCheating;
//
//	public void setMathCheating(MathCheating mathCheating) {
//		this.mathCheating = mathCheating;
//	}================

//	private ScienceCheating scienceCheat;
//	
//	
//
//	public void setScienceCheat(ScienceCheating scienceCheat) {
//		this.scienceCheat = scienceCheat;
//	}
//==================

	private Cheat cheating;

	public void setCheating(Cheat cheating) {
		this.cheating = cheating;
	}

	public void cheating() {
//		mathCheating.mathCheating();
//		scienceCheat.ScienceCheating();
		cheating.cheat();
	}
}
