package com.example;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unused")
public class ArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array to arraylist
	/*	String [] s= new String[] {"Java","PHP","Perl","C","Cpp"};
		ArrayList <String> a =new ArrayList<String>(Arrays.asList(s));
		System.out.println(a);
		*/
		//arraylist to array
		ArrayList <String> list= new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("HTML");
		list.add("Python");
		
		String [] arr=new String[list.size()];
		list.toArray(arr);
		for(String s: arr) {
			System.out.println(s);
		}
	}

}
