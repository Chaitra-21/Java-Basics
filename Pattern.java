package com.example.For;

public class Pattern{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
		for(int i=7;i>=1;i--) {
			for(int j=1;j<i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
