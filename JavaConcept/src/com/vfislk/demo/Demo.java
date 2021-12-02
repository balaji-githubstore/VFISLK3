package com.vfislk.demo;

import com.vfislk.methods.Area;
import com.vfislk.student.Student;

public class Demo {

	public static void main(String[] args) {
		
	   double area=Area.areaOfCircle(4);
	   System.out.println(area);

	   Student stu=new Student(1001);
	   
	   stu.printEmployeeDetail();
	}

}
