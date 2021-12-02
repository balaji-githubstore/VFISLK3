package com.vfislk.student;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		
		
		Student.schoolName="Global";
		
		Student stu1=new Student(1001);
		Student stu2=new Student(1002);
		Student stu3=new Student(1003);
		
		stu1.stuName="Jack";
		stu1.stuMailId="jack@gmail.com";
		stu1.setStuPercentage(99);
		
		stu2.setStuPercentage(65.3);
		
		stu1.printEmployeeDetail();
		stu2.printEmployeeDetail();
		
		System.out.println(stu1.getStuPercentage());
		

	}

}
