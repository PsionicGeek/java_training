package basicjava;

public class ObjectEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 5;
		// System.out.println(a==b);

		Employee e1 = new Employee(1, 45000, "Tarun", 12);
		Employee e2 = new Employee(1, 45000, "Tarun", 12);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(" equals function " + e1.equals(e2));
		System.out.println(e1 == e2);

		e1 = e2;
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(" equals function " + e1.equals(e2));
		System.out.println(e1 == e2);
		e1.setSalary(50000);
		// System.out.println(e1);
		// System.out.println(e2);

		e1 = new Employee(e2.getId(), e2.getsalary(), e2.getName(), e2.deptid);
		// System.out.println(e1);
		// System.out.println(e2);
		// e1.setSalary(60000);
		// System.out.println("now i have change the e1 salary");
		// System.out.println(e1);
		// System.out.println(e2);
		// Employee e3 = new Employee(e1);
		// System.out.println(e3);
	}

}
