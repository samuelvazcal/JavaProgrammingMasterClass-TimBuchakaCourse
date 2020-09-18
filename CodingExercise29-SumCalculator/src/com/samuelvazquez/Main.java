package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(0.0);
		calculator.setSecondNumber(1.25);
		System.out.println("Add = " + calculator.getAdditionResult());
		System.out.println("Subtract = " + calculator.getSubtractionResult());
		System.out.println("Multiply = " + calculator.getMultiplicationResult());
		System.out.println("Divide = " + calculator.getDivisionResult());
	}
}


