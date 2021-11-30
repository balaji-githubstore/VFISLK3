package com.vfislk.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		int radius=10;
		
		double result=Area.areaOfCircle(radius);
		System.out.println(result);
		
		result=Area.areaOfCircle(20);
		System.out.println(result);
		
		System.out.println(Area.areaOfCircle(30));
		
		int len=45;
		int wid=25;
		
		int res=Area.areaOfRectangle(len, wid);
		System.out.println(res);
		
		result = Volume.volumeOfCuboid(10, 10, 10);
		System.out.println(result);
		
		
		Area obj= new Area(); //allocate memory
		
		double area=obj.areaOfTriangle(25, 1);
		System.out.println(area);
		
		obj.quit();
	}

}







