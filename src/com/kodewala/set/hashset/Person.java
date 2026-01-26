package com.kodewala.set.hashset;

import java.util.HashSet;

public class Person {

	private String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { // If you override equals method & not hashcode then it will result in two
										// different objects in two different buckets
		Person p = (Person) obj;
		return this.name.equals(p.name);
	}

	@Override
	public int hashCode() { // If you override hash but not equals then it results in hash collision because
							// its returning same hash but objects are not equal
		return this.name.hashCode();
	}

	public static void main(String[] args) {

		Person p1 = new Person("Nayandeep");
		Person p2 = new Person("Nayandeep");
		HashSet<Person> h = new HashSet<Person>();
		h.add(p1);
		h.add(p2);

		System.out.println(h.size());
	}

}
