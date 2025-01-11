package oopsConstructor;

public class Employee {
	public int empid;
	public String name;
	private double sal;
	public String dept;
	//default constructor
	Employee(){
		empid=0;
		name="emp";
		sal=0.00;
		dept="none";
	}
	
	//parameterized constructor
	Employee(int id,String n,double s,String d){
		empid=id;
		name=n;
		sal=s;
		dept=d;
	}
	
	void display() {
		System.out.println("empid="+empid);
		System.out.println("name="+name);
		System.out.println("sal="+sal);
		System.out.println("dept="+dept);
	}
}
