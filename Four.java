package com.example;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			String s=null;
//			System.out.println(s.length());
			try {
				@SuppressWarnings("unused")
				int a=100/0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int [] a= new int[10];
				a[15]=10;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
//		catch(StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
		catch(Exception e) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("In finally");
		}
	}

}
