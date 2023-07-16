package com.example.demo;

import com.example.demo.controller.CalculatorController;


public class TestCalculatorApp {

	public static void main(String[] args) {
		CalculatorController calc = new CalculatorController();
		
		int addResult=calc.additionOfTwoNumbers(10,20);
		System.out.println("Addition result="+addResult);
		
		int subResult=calc.subtractionOfTwoNumbers(20,10);
		System.out.println("Subtraction result="+ subResult);
		
		int multipyResult=calc.multiplicationOfTwoNumbers(10,20);
		System.out.println("Multiplication result="+ multipyResult);
		
		double divisionResult=calc.divisionOfTwoNumbers(10,20);
		System.out.println("Division result="+ divisionResult);
		
		

	}

}
