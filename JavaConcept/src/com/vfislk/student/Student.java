package com.vfislk.student;

public class Student {
	private int rollNumber;
	public String stuName;
	public String stuMailId;
	private double stuPercentage;
	public static String schoolName;
	
	public Student(int rollNumber)
	{
		this.rollNumber=rollNumber;
		System.out.println("Student object created!!!");
	}

	// printStudentDetail
	public void printEmployeeDetail() {
		System.out.println(rollNumber);
		System.out.println(stuName);
		System.out.println(stuMailId);
		System.out.println(getStuPercentage());
		System.out.println(Student.schoolName);
		System.out.println("********************************");
	}

	//write
	public void setStuPercentage(double stuPercentage) {
		if (stuPercentage >= 0 && stuPercentage <= 100) {
			this.stuPercentage=stuPercentage;
		} else {
			System.out.println("Provide percentage between 0 to 100!!! So setting up default value");
		}
	}

	//read
	public double getStuPercentage() {
		return stuPercentage;
	}


}
