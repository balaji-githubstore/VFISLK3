package com.vfislk.datatypes;

public class DatatypesDemo2 {

	public static void main(String[] args) {
		
		int[] numbers=new int[5]; //5*32 bits of memory will be used

		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		//numbers[4]=50;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[4]);
		//System.out.println(numbers[5]);
		
		
		//red,green,yellow
		String[] colors=new String[4];
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		System.out.println(colors.length);
		
		System.out.println(colors);
		System.out.println(colors[2]);
//		System.out.println(colors[4]);
		
		numbers=new int[7];
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		int[] values= {45,98,38,98,79,25,54}; 
		
		System.out.println(values[0]);
	}

}

