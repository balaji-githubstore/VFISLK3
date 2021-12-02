package com.vfislk.oops;

class Father
{
	public int fAge;
	
	public Father(int fAge)
	{
		this.fAge=fAge;
		System.out.println("Father!!!");
	}
	
	public void fatherStyle()
	{
		System.out.println("father style!!!");
	}
}

class Son extends Father 
{
	public int sAge;
	
	public Son(int fatherAge,int sonAge)
	{
		super(fatherAge);
		this.sAge=sonAge;
		System.out.println("Son!!!");
	}
	
	public void sonStyle()
	{
		System.out.println("Son style!!!");
	}
}

public class InheritanceTest {

	public static void main(String[] args) {

		Son son=new Son(60, 30);
		System.out.println(son.fAge);
		System.out.println(son.sAge);
		son.fatherStyle();
		son.sonStyle();
		
	}

}
