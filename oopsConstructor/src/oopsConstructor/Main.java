package oopsConstructor;
import oopsConstructor.Employee;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(); //constructor call
		e1.display();
		Employee e2 = new Employee(2,"abc",35000.00,"R&D"); //constructor call
		e2.display();
	}
}
