package collections;
import java.util.*;
import basicjava.*;

public class HashSetEmpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> a = new HashSet<Employee>();
		Employee e1 = new Employee(1, 45000, "Tarun", 10);
		Employee e2 = new Employee(2, 55000, "Varun", 20);
		Employee e3 = new Employee(1, 45000, "barun", 10);
		Employee e4 = new Employee(2, 55000, "karun", 20);
		
		a.add(e2);
		a.add(e1);
		a.add(e4);
		a.add(e3);
		System.out.println(a);
		System.out.println(a.contains(new Employee(2, 55000, "karun", 20)));

	}

}
