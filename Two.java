package com.example;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n[]=new int[8];
			System.out.println(n[10]);
			n[10]=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Catch specific exception");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch specific exception");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Catch general exception");
			System.out.println(e);
		}
	}

}
