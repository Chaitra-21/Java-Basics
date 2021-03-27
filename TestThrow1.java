package com.example;

public class TestThrow1 {

	public static  void validate(int age) {
		if(age<18) 
			throw new ArithmeticException("Can't vote!");
		else
			System.out.println("Can vote!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(52);
		System.out.println("DONE!!!");
		validate(10);
		
	}

}
