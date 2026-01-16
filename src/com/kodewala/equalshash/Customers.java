package com.kodewala.equalshash;

import java.util.HashSet;

public class Customers {

	String name;
	String customerCode;

	public Customers(String name, String customerCode) {
		this.name = name;
		this.customerCode = customerCode;
	}

	@Override
	public boolean equals(Object obj) {
		Customers e = (Customers) obj;
		return this.customerCode.equals(e.customerCode);
	}

	@Override
	public int hashCode() {
		return this.customerCode.hashCode();
	}

	public static void main(String[] args) {

		HashSet<Customers> h = new HashSet<Customers>();
		h.add(new Customers("Nayandeep", "001"));
		h.add(new Customers("Nayandeep Sen", "001"));
		h.add(new Customers("Nayandeep Sen", "002"));

		for (Customers cus : h) {
			System.out.println(cus.customerCode);
		}

		System.out.println(h);

	}

}
