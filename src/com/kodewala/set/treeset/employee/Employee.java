package com.kodewala.set.treeset.employee;

public class Employee implements Comparable {

	String name;
	String empId;

	@Override
	public int compareTo(Object obj) { // -ve(small) zero(same) +ve(big)
		Employee e = (Employee) obj;
		// return this.empId.compareTo(e.empId);
		// return 0; // 0 means every obj is equal
		// return 1; // positive means add to right
		return -1; // negative means add to left (opposite of insertion order)
	}

	public Employee(String name, String empId) {
		this.name = name;
		this.empId = empId;
	}

}
