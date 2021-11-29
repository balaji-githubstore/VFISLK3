package com.vfislk.logics;

public class DecisionMakingDemo {

	public static void main(String[] args) {
		
		int num=0;
		
		if(num>0)
		{
			System.out.println("Positive number: "+num);
		}
		else if(num==0)
		{
			System.out.println("It's zero!!");
		}
		else
		{
			System.out.println("Negative number "+num);
		}
		
		
		System.out.println("---end---");
		
		String browser="CH";
		
		if(browser=="ch" || browser=="CH" )
		{
			System.out.println("Launch Chrome!!");
		}
		else if(browser=="ie")
		{
			System.out.println("IE launch");
		}
		else
		{
			System.out.println("Firefox!!!");
		}
		
		int pageNumber=250;
		
		if(pageNumber>=100)
		{
			if(pageNumber<=200)
			{
				System.out.println("Falls btwn 100 and 200");
			}
		}
		
		if(pageNumber>=100 && pageNumber<=200)
		{
			System.out.println("Falls btwn 100 and 200");
		}
		
		int mark=55;
	}

}



