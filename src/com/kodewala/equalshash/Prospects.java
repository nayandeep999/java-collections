package com.kodewala.equalshash;

import java.util.ArrayList;
import java.util.HashSet;

public class Prospects {

	private String name;
	private String email;

	public Prospects(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		Prospects p = (Prospects) obj;
		return this.email.equals(p.email);
	}

	@Override
	public int hashCode() {
		return this.email.hashCode();
	}

	public static void main(String[] args) {
		// Allowed duplicates
		ArrayList<Prospects> arr = new ArrayList<Prospects>();
		arr.add(new Prospects("Nayandeep", "nayandeepsen@gmail.com"));
		arr.add(new Prospects("Nayandeep", "nayandeepsen@gmail.com"));

		for (Prospects px : arr) {
			System.out.println(px.name + " " + px.email);
		}

		System.out.println("-----------------------------------------------------");

		// Duplicates not allowed
		HashSet<Prospects> hs = new HashSet<Prospects>();
		hs.add(new Prospects("Nayandeep", "nayandeepsen@gmail.com"));
		hs.add(new Prospects("Nayandeep", "nayandeepsen@gmail.com"));

		for (Prospects px1 : hs) {
			System.out.println(px1.name + " " + px1.email);
		}
	}

}
