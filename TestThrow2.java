/*this is an example of exception propagation. here s1() has exception but it is propagated from test->s2()->s1(). */

package com.example;

public class TestThrow2 {
	@SuppressWarnings("null")
	static void s1() {
		String s=null;
		System.out.println("Length: "+s.length());
	}
	static void s2() {
		s1();
	}
	static void test() {
		try {
			s2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		System.out.println("DONE!!");
	}

}
