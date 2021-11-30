package com.vfislk.variable;

public class VariableDemo {
	
	public static int aS=10; //static variable or class variable
	public static int bS=20;
	public int aNS=10; //non-static variable or instance variable 
	public int bNS=20;
	
	public static void main(String[] args) {
		
		VariableDemo.aS=100;
		
		System.out.println(VariableDemo.aS);
		System.out.println(VariableDemo.bS);
		
		VariableDemo obj1=new VariableDemo();
		
		VariableDemo obj2=new VariableDemo();
		
		VariableDemo obj3=new VariableDemo();
		
		obj1.bNS=5000;
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
	}
}
