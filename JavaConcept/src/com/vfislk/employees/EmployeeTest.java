package com.vfislk.employees;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="VFISLK Pvt";
		
		
//		Employee e=new Employee((double)10,10);
		
		Employee emp1=new Employee();  //1st object //empid = 101
		Employee emp2=new Employee(); //2nd object //empid =102
		Employee emp3=new Employee(); //3rd object //empid=103
		
		emp1.empName="John";
		emp1.empSalary=2000;
		
		emp2.empName="Peter";
		emp2.empSalary=8000;
		
		emp1.printEmployeeDetail();
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();

		
		
	}

}
