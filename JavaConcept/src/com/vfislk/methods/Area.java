package com.vfislk.methods;

public class Area {

	public static double areaOfCircle(int r)
	{
		double area=3.14*r*r;
		return area;
	}
	
	public static int areaOfRectangle(int length,int width)
	{
		return length*width;
	}
	
	public double areaOfTriangle(double base,double height)
	{
		return (base*height)/2;
	}
	
	public static String getAuthorName() {
		String name="Balaji";
		return name;
	}
	
	public static void description()
	{
		System.out.println("Contains area formulae!!!");
	}
	
	public void quit()
	{
		
	}
	
}







