package com.vfislk.methodsdemo;

import com.vfislk.methods.Area;

public class Demo {

	public static void main(String[] args) {
		
		double area= Area.areaOfCircle(10);
		System.out.println(area);
		
		double power=Math.pow(2, 3);
		System.out.println(power);
		
		double random=Math.random();
		
		System.out.println(random);
		
		int max=Math.max(10, 20);
		System.out.println(max);
		
		String name=Area.getAuthorName();
		System.out.println(name);
		
		Area.description();
	}
}
