package streams;

import java.util.*;
import java.util.stream.*;

import basicjava.*;

public class StreamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		Stream<Integer> strm = l.stream();
		
		strm.map((Integer i)->i*2).forEach((Integer i)->System.out.print(i));
		
		System.out.println("***************************************************");

		
		List<Employee> st = new ArrayList<Employee>();
		Employee e1 = new Employee(1, 45000, "Tarun", 10);
		Employee e2 = new Employee(2, 55000, "Varun", 20);
		Employee e3 = new Employee(4, 65000, "barun", 10);
		Employee e4 = new Employee(3, 35000, "karun", 20);
		
		st.add(e1);
		st.add(e2);
		st.add(e3);
		st.add(e4);
		List<String> x = new ArrayList<String>();
		Iterator<Employee> itr = st.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			if(e.getsalary()>55000) {
				x.add(e.getName());
			}
		}
		
		//System.out.println(st);
		
		List<String> lst = st.stream()
				        .filter((Employee ex)->ex.getsalary() >55000)
						.map((Employee t)-> t.getName())
						.collect(Collectors.toList());
		
		System.out.println(lst);
		List<Account> acc = new ArrayList<Account>();
		
		Account ac1 = new Account("Tarun",545600,1);
		Account ac2 = new Account("Surbhi",545200,2);
		Account ac3 = new Account("Akarsh",545500,3);
		Account ac4 = new Account("Utkarsh",545600,4);
		acc.add(ac1);
		acc.add(ac2);
		acc.add(ac3);
		acc.add(ac4);
		System.out.println(acc);
		
		List<String> lst2 = acc.stream()
				.filter((Account a)->a.getBalance()>545300)
				.map((Account b)->b.getName())
				.collect(Collectors.toList());
		
		//List<String>lst3= acc.stream().filter((Employee e)->e.
		System.out.println(lst2);
		
		
		Stream<Employee> s = st.stream();
		Optional<Employee> opemp = s.distinct().filter((Employee e)->e.getsalary() ==45000).findFirst();
		if(opemp.isPresent()) {
			System.out.println(opemp);
		}
		
	
		
		Employee tt= st.stream().distinct().filter((Employee e)->e.getDeptid()==25).findFirst().orElse(new Employee(6,75000,"Saurabh",25));
		System.out.println(tt);
	}
	

}
