package collections;
import java.util.*;
import basicjava.*;

public class UseArrayListInEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a = new ArrayList<Employee>();
		Employee e1 = new Employee(1, 45000, "Tarun", 12);
		Employee e2 = new Employee(2, 55000, "Varun", 11);
		a.add(e2);
		a.add(e1);
		System.out.println(a);
		Employee e3 = new Employee(1, 45000, "Tarun", 12);
		System.out.println(a.contains(e3));
	}

}
