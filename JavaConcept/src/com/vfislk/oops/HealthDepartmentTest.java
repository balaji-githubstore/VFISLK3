package com.vfislk.oops;

abstract class Doctor {
	public int docId;
	public String hospitalName = "Global";
	public String docName;

	public void printDoctorDetail() {
		System.out.println(docId);
		System.out.println(docName);
		System.out.println(hospitalName);
		System.out.println("*****************");
	}

	public abstract void treatPatient(); //for sure you need to override

}

class Dentist extends Doctor {

	public void dentistDetail()
	{
		
	}
	
	public void treatPatient() {
		System.out.println("Oral health includes teeth, tongue and gums");
	}
}

class Veterinarian extends Doctor {

	public void treatPatient() {
		System.out.println("Treatment and diagnosis of issues in animals is done ");
	}
}

class Audiologist extends Doctor {
	public void treatPatient() {
		System.out.println("ear!! ");
	}
}

class Cardiologist extends Doctor
{

	public void treatPatient() {
		// TODO Auto-generated method stub
		System.out.println("cardio!!");
	}
	
}

public class HealthDepartmentTest {
	public static void main(String[] args) {
		
		

		Doctor d = new Dentist();
		d.docId = 101;
		d.docName = "John";
		d.printDoctorDetail();
		d.treatPatient();
		

		Doctor v = new Veterinarian();
		v.docId = 102;
		v.docName = "Mark";
		v.printDoctorDetail();
		v.treatPatient();
		

		Doctor a = new Audiologist();
		a.printDoctorDetail();
		a.treatPatient();
		
		Doctor c =new Cardiologist();
		c.treatPatient();
		
	}
}
