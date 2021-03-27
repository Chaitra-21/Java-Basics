package com.example;

public class Three {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Catch specific exception");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Catch general exception");
			System.out.println(e);
		}
	}

}
