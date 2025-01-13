package poly;

import java.util.Scanner;

//compile time polymorphism
class A { //method overloading
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}

}

//Run time polymorphism
class Shape { //method overriding
	public void area() {
		System.out.println("inside Shape class");
		System.out.println("Shape Area");
	}
}

class Circle extends Shape {
	int radius;
	Scanner sc=new Scanner(System.in);
	Circle(){
}
	@Override
	public void area() {
		System.out.println("inside Circle class");
		System.out.println("area of circle with "+radius+"is:"+(3.142*radius*radius));
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj_a = new A();
		System.out.println(obj_a.add(12, 12));
		System.out.println(obj_a.add(12, 12, 12));
		
		Shape s1=new Shape();
		Shape s2=new Circle();
		s1.area();
		s2.area();
	}

}
