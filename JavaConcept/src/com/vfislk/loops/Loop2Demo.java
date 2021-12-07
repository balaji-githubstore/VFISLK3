package com.vfislk.loops;

public class Loop2Demo {

	public static void main(String[] args) {
		
		int[] values = { 45, 98, 38, 98, 79, 25, 54, 23, 31,36 };
		
		for(int value : values)
		{
			if(value==98)
			{
				System.out.println(value);
				break;
			}
			
		}

		String[] colors= {"red","green","yellow","pink"};
		
		
		for(String color : colors)
		{
			System.out.println(color);
		}
		
	}

}
