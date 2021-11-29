package com.vfislk.datatypes;

public class DatatypesDemo3 {
	
	public static void main(String[] args) {
		
		
		int a=10;
		
		double b=a; //int  to double //implicit conversion // no data loss
		
		System.out.println(a);
		System.out.println(b);
		
		double v=10.2;
		
		int u=(int) v; //double to int //explicit conversion // data loss
		System.out.println(u);
		
		double n=10.2; //64 bit 
		System.out.println(n);
		float m=(float) n; // 64 to 32 bit
		System.out.println(m);
	}

}
