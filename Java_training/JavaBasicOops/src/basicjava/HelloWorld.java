package basicjava;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
//		Employee e = new Employee();
//		e.deptid = 123;
//		e.id = 1;
//		e.name = "tarun";
//		e.Salary = 35000;
//		System.out.println(e.id);
//		System.out.println(e.deptid);
//		System.out.println(e.name);
//		System.out.println(e.Salary);
//
//		Employee e1 = new Employee(1, 45000, "Tarun", 12);
//		System.out.println(e1.toString());
//		
//
//		Account a = new Account("Tarun", 440000, 12);
//		Account a1 = new Account();
//		a1.setAccId(5);
//		a1.setBalance(1010101);
//		a1.setName("Varun");
//		System.out.println(a1);
//
//		System.out.println(a.debit(10000000));
//		System.out.println(a.credit(1000000));
//        
//		Manager m = new Manager(10,100000,"Shivangi",2,10000,10,20000);
//		System.out.println(m);
//		System.out.println(m.anualSalary());
//		System.out.println("Tarun salary after long bonus "+e1.anualSalary(5000l));
		
		Employee e = new Manager(10,100000,"Shivangi",2,10000,10,20000);
		func(e);
		
		func(new Manager(10,100000,"Tarun",2,10000,10,20000));
		
		func(new Employee(1, 45000, "Tarun", 12));
	} 
	
	static void func(Employee e) {
		System.out.println("this is func function");
		System.out.println(e.anualSalary());
	}

}
