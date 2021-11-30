package com.vfislk.loops;

public class Loop1Demo {

	public static void main(String[] args) {

		int a = -5;

		if (a > 0) {
			System.out.println("positive" + a);
		}

		// print 1 to 10

//		for (int i = 1; i <= 10; i++) // i++ or ++i is nothing but i=i+1
//		{
//			System.out.println(i);
//		}

		int[] values = { 45, 98, 38, 98, 79, 25, 54, 23, 31,36 };
		

		int size = values.length;
		System.out.println(size);

		// print values only less than or equal to 50
		for (int i = 0; i < values.length; i++) 
		{
			if (values[i] <= 50)

			{
				System.out.println(values[i]);
			}
		}

	}

}
