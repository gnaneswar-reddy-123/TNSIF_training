package org.tnsif.acce.c2tc.java;

public class variableDemo {
	int price = 10;
	void print() {
		String msg = "cambridge";
		System.out.print(msg);
	}
	static int price2 = 22;
	public static void main(String []args) {
		variableDemo vr = new variableDemo();
		vr.print();
		System.out.print(price2);
		
	}
}
