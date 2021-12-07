package com.vfislk.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
	
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");	
		colors.add("yellow");
		colors.add("blue");
		colors.add("red");
		
		String c1=colors.get(0);
		System.out.println(c1);
		
		System.out.println(colors.get(3));
		
		int size=colors.size();
		System.out.println(size);
		
		colors.add("pink");
		
		size=colors.size();
		System.out.println(size);
		
		for(String col : colors)
		{
			System.out.println(col);
		}
		
		colors.remove(1);
		
		for(String col : colors)
		{
			System.out.println(col);
		}
		
		colors.remove("red");
		
		for(String col : colors)
		{
			System.out.println(col);
		}
		
		colors.add(1, "green");
		colors.add(0,"red");
		
		for(String col : colors)
		{
			System.out.println(col);
		}
		
	}

}
