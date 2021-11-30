package com.vfislk.employees;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
//		System.out.println(emp1);
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSalary=2000;
		emp1.companyName="VFI-SLK";
		
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.empSalary);
		System.out.println(emp1.companyName);
		System.out.println("**************************");
		
		Employee emp2=new Employee();
//		System.out.println(emp2);
		emp2.empId=102;
		
		System.out.println(emp2.empId);
		System.out.println(emp2.empName);
		System.out.println(emp2.empSalary);
		System.out.println(emp2.companyName);
		
		
	}

}
