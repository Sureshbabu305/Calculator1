package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


	@Controller
	@RequestMapping("/calculator")
	public class CalculatorController {
		
		@GetMapping("/add")
		public int additionOfTwoNumbers(@RequestParam(value="num1") int num1,@RequestParam(value="num2") int num2) {
			 return num1+ num2;
		}
		@GetMapping("/sub")
		public int subtractionOfTwoNumbers(@RequestParam(value="num1") int num2,@RequestParam(value="num2") int num1) {
			
			 return num2-num1;
		}
		@GetMapping("/multipy")
		public int multiplicationOfTwoNumbers(@RequestParam(value="num1") int num1,@RequestParam(value="num2") int num2) {
	
			 return num1*num2;
		}

		@GetMapping("/division")
		public double divisionOfTwoNumbers(@RequestParam(value="num1") int num1,@RequestParam(value="num2") int num2)throws ArithmeticException {
		    if(num2==0) {
		    	throw new ArithmeticException("Attempted to divide by zero in denominator");
		    }
			
			 return num1/num2;
		}
	}


