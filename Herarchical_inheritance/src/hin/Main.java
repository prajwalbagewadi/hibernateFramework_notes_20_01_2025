package hin;

class Hospital {
	int hid;
	String hname;
	
	Hospital() {
		hid=1;
		hname="Gayatri devi Hospital";
	}
	void display() {
		System.out.println("Hospital details=");
		System.out.println("Hospital id="+hid);
		System.out.println("Hospital name="+hname);
	}
}

class Patient extends Hospital {
	//example for single level inheritance
	int pid;
	String pname;
	int age;
	
	Patient(int p,String n,int a) {
		super(); //constructor call to hospital
		pid=p;
		pname=n;
		age=a;
	}
	
	void display() {
		System.out.println("Patient details=");
		System.out.println("Patient id="+pid);
		System.out.println("Patient name="+pname);
		System.out.println("Patient age="+age);
		super.display();  //call to display() hospital
	}
}	

class Doctor extends Hospital {
	int did;
	String dname;
	int dage;
	String dspec;
	
	Doctor(int id,String n,int age,String d) {
		super(); //to call parent class constructor 
		did=id;
		dname=n;
		dage=age;
		dspec=d;
	}
	
	void display() {
		System.out.println("Doctor details=");
		System.out.println("Doctor id="+did);
		System.out.println("Doctor name="+dname);
		System.out.println("Doctor age="+dage);
		System.out.println("Doctor Specilization="+dspec);
		super.display();  //call to display() hospital
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1=new Patient(1,"abc",23);
		Doctor d1=new Doctor(101,"dr.doc",25,"Cardiology");
		d1.display();
		p1.display();
	}

}
