package com.example;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4563,9087,6754,1009,8678,3023,3098};
		String[] s= {"Java","Python","C","Cobol","Perl","Ruby","JavaScript"};
		System.out.println("Original number array: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted number array: "+Arrays.toString(arr));
		System.out.println("Original String array: "+ Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("Sorted String array: "+Arrays.toString(s));
	}

}
