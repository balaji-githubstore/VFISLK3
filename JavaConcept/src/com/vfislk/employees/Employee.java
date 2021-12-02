package com.vfislk.employees;

public class Employee {
	private int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	private static int counter=101;
	
	public Employee()
	{
		empId=counter;
		counter=counter+1;
		System.out.println("Object created!!!");
	}
	
	public Employee(int a,double b)
	{

	}
	
	public Employee(double a,int b)
	{

	}
	
	public Employee(String n)
	{

	}
	
	
	public void printEmployeeDetail()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("*******************************");
	}
	

//	public static void printEmployeeDetails(Employee emp)
//	{
//		System.out.println(emp.empId);
//		System.out.println(emp.empName);
//		System.out.println(emp.empSalary);
//		System.out.println(Employee.companyName);
//		System.out.println("*******************************");
//	}

	

}
