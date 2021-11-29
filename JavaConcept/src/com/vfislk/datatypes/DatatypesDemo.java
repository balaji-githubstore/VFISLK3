package com.vfislk.datatypes;

public class DatatypesDemo {
	
	public static void main(String[] args) {
		
		byte a=55; // a is reserved for byte 
		
		short b=55;
		
		int c =55; 
		
		//1000*8 = 8000 bits 
		//1000*32 = 32000 bits of memory 
		
		long mobile=78899889899L;
		
		float e=1.123456789f;
		
		double z=1.123456789;
		
		System.out.println(e);
		System.out.println(z);
		
		char letter='$';
		System.out.println(letter);
		
		boolean check=true;
		System.out.println(check);
		
		String name="Balaji";   //6* 16 bits of memory used
		System.out.println(name);
		
		int radius=10;
		
		//areaOfCircle 
	    double result= 3.14*radius*radius;
	    System.out.println(result);
	    
	    double result1=(22.0/7)*radius*radius;
	    System.out.println(result1);
	    System.out.println(22/7.0f);
	    
	    
	}
}



