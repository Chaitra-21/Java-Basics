package com.example;

import java.io.IOException;

public class TestThrows1 {
	public void p() throws IOException {
		throw new IOException("Error");
	}
	public void m() throws IOException {
		p();
	}
	public void n() {
		try {
			m();
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrows1 t= new TestThrows1();
		t.n();
		System.out.println("DONE!!");
	}

}
