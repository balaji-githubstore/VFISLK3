package com.vfislk.datatypes;

public class StringMethods {

	public static void main(String[] args) {
		
		String name="sCience";  //String name=new String("")
		
		char letter= name.charAt(0);
		System.out.println(letter);
		
		String uName= name.toUpperCase();
		System.out.println(uName);
		
		if(name.equals("science"))
		{
			System.out.println("Matching!!");
		}

		if(name.equalsIgnoreCase("science"))
		{
			System.out.println("Matching2!!");
		}
		
		String s1=new String("hello");
		String s2=new String("hello");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}







