package inheritance;


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


class LegalGuardian extends Patient {
	int lgid;
	String lname;
	String Phone;
	
	LegalGuardian(int lid,int pid,String ln,String pn,int age,String phone) {
		super(pid,pn,age); //constructor call to Patient
		lgid=lid;
		lname=ln;
		//this.lname=lname; //this : refers to current class object
		Phone=phone;
	}
	
	void display() {
		System.out.println("Legal Guardian details=");
		System.out.println("Legal Guardian id="+lgid);
		System.out.println("Legal Guardian name="+lname);
		System.out.println("Legal Guardian phone="+Phone);
		super.display();//call to display() Patient
	}
}

public class Main {
	public static void main(String[] args) {
//		Patient p1 = new Patient(1,"abc",25); // object for single level
//		p1.display();
		LegalGuardian lg1 = new LegalGuardian(1,1,"def","abc",25,"999-9999");
		lg1.display();
	}
}
