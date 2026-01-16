package com.kodewala.equalshash;

public class Employee {

	String firstName;
	String lastName;

	public Employee(String firstName, String lastNAme) {
		this.firstName = firstName;
		this.lastName = lastNAme;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName);
	}

	@Override
	public int hashCode() {
		String str = this.firstName + this.lastName;
		return str.hashCode();
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Nayandeep", "Sen Gupta");
		Employee e2 = new Employee("Nayandeep", "Sen Gupta");
		Employee e3 = new Employee("Nayandeep", "Sen gupta");

		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.equals(e1));
		System.out.println(e3.hashCode());

	}
}
