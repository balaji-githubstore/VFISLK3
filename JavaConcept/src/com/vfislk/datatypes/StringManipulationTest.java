package com.vfislk.datatypes;

public class StringManipulationTest {
	
	public static void main(String[] args) {
		String text="Showing 1 to 10 of 57 entries";
		
		String t1= text.substring(13,16).trim();
		System.out.println(t1);
		
		int index=text.indexOf("of");
		
		String t2=text.substring(index+3);
		t2=t2.replace(" entries", "");
		System.out.println(t2);
		
		double n1=Double.parseDouble(t1);
		double n2=Double.parseDouble(t2);
		
		double pageCount=Math.ceil(n2/n1);
		System.out.println(pageCount);
	}

}
