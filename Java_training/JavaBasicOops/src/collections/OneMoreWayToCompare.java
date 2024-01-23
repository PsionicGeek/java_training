package collections;

import java.util.*;

import basicjava.Employee;

public class OneMoreWayToCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getsalary()-o2.getsalary());
			}

}
