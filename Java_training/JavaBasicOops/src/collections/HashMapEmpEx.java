package collections;
import java.util.*;
import basicjava.*;

public class HashMapEmpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, 45000, "Tarun", 10);
		Employee e2 = new Employee(2, 55000, "Varun", 20);
		Employee e3 = new Employee(3, 45000, "barun", 10);
		Employee e4 = new Employee(4, 55000, "karun", 20);
		
		Manager m = new Manager(10,100000,"Shivangi",2,10000,10,20000);
		Manager m1 = new Manager(11,100000,"Nishu",2,10000,10,20000);
		Manager m2 = new Manager(11,100000,"Prakhar",2,10000,10,20000);
		
		
		Map<Employee, Manager> mp = new HashMap<Employee, Manager>();
		mp.put(e1, m2);
		mp.put(e2, m);
		mp.put(e3, m1);
		mp.put(e4, m2);
		//Manager mg1;
		
//		System.out.println(mp);
//		
//		for(Employee e: mp.keySet()) {
//			mg1 = mp.get(e);
//			System.out.println("manager of Employee: "+e.getName()+" is "+ mg1.getName());
//		}
		
		//checking for employee
		System.out.println("checking for employee:" + (mp.containsKey(new Employee(2, 55000, "karun", 20))));
		
		mp.forEach((Employee ee, Manager mm)->{
			System.out.println(ee.getName()+" "+ mm.getName());
		});
		
		Set<Employee> se = mp.keySet();
		System.out.println(se);
		
		Collection<Manager> lst = mp.values();
		System.out.println("collection****** "+lst);
		

	}

}
