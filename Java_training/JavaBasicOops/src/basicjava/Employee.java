package basicjava;

public class Employee implements Comparable<Employee> {
	private int id;
	int salary;
	String name;
	int deptid;
	protected int p;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, int salary, String name, int deptid) {
		super();
		this.id = id;
		this.salary =salary;
		this.name = name;
		this.deptid = deptid;
	}
	
	public Employee(Employee e) {
		this.deptid = e.deptid;
		this.salary= e.salary;
		this.id= e.id;
		this.name= e.name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getsalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 0) {
			salary = salary;
		}
		this.salary= salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptid() {
		return deptid;
	}

	
	
	@Override
	public boolean equals(Object ob) {
	return this.id==((Employee)ob).id;
		
	}
	
	@Override
	public int hashCode() {
		System.out.println("this is hashcdoe function");
		return this.deptid;
	}

	
	public int anualSalary() {
		System.out.println("employee wala anual salary ");
		return this.salary*12;
	}
	public int anualSalary(int n) {
		return this.salary*12+ n;
	}
	public long anualSalary(long n) {
		return this.salary*12 + n;
	}
	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.id - o.id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Salary=" + salary + ", name=" + name + ", deptid=" + deptid + "]";
	}

}
