package basicjava2;

import basicjava.Employee;

public class Interns extends Employee {
	int time;
	//Employee e = new Employee(1, 45000, "Tarun", 12);

	public Interns() {
		super();
		this.p= 5;//this p is protected so it is accessible in child class of different package
		// TODO Auto-generated constructor stub
	}
	
	
}
