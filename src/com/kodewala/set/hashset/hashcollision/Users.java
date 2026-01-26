package com.kodewala.set.hashset.hashcollision;

import java.util.HashSet;

public class Users {

	private String name;

	public Users(String name) {
		this.name = name;
	}

	// By returning same hash for every object
	// we essentially telling them they belong to the same container
	// but when jvm calls the equals method, the equals method is
	// not overridden by Users class, so the equals inherited from
	// the Object class called that uses == which compares object references
	// This creates hash collision , same hash but not equal objects
	// It gets stores as next node of the existing linked list

	public int hashCode() {
		// return this.name.hashCode();
		return 1;
	}

	public static void main(String args[]) {

		Users u1 = new Users("Nayandeep");
		Users u2 = new Users("Ram");

		HashSet<Users> h = new HashSet<Users>();
		h.add(u1);
		h.add(u2);

		System.out.println(h);

	}

}
