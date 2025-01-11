//classes and objects
package oopsClasses;
import java.util.Scanner;

//class
class Emp{
	//encapsulation:Encapsulation is one of the fundamentals of OOP (object-oriented programming). It refers to the bundling of data with the methods that operate on that data. 
		
	//data members
		Scanner sc=new Scanner(System.in);
		int empid;
		String empname;
		String empdept;
		
	//data methods
		public void accept() {
			System.out.println("Enter empid:");
			this.empid=sc.nextInt();
			System.out.println("Enter empname:");
			this.empname=sc.next();
			System.out.println("Enter empdept:");
			this.empdept=sc.next();
		}
		public void disp() {
			System.out.println("empid:"+this.empid);
			System.out.println("empname:"+this.empname);
			System.out.println("empdept:"+this.empdept);
		}
}

public class Main {
	public static void main(String[] args) {
//		Emp e1=new Emp();
//		e1.accept();
//		e1.disp();
		
		Emp e[]= new Emp[5];
		
		for(int i=0;i<e.length;i++) {
			e[i]= new Emp(); //single object in array
			e[i].accept();
		}
		for(int i=0;i<e.length;i++) {
			e[i].disp();
		}
	}
}
