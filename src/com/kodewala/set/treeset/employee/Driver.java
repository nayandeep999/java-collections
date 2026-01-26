package com.kodewala.set.treeset.employee;

import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		TreeSet<Employee> t = new TreeSet<Employee>();

		Employee e1 = new Employee("Nayandeep", "EMP001");
		Employee e3 = new Employee("Agnish", "EMP002");
		Employee e2 = new Employee("Agnish", "EMP003");

		t.add(e1);
		t.add(e2);
		t.add(e3);

		for (Employee e : t) {
			System.out.println(e.name + " " + e.empId);

		}

		// class cast exception if you not implement comparable interface
	}

}
