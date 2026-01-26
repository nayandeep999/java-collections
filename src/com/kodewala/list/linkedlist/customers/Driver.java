package com.kodewala.list.linkedlist.customers;

import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		CustomerDetails c = new CustomerDetails();

		LinkedList<String> custDetails = c.cusDetails();

		for (String cus : custDetails) {
			if (cus.endsWith("ra")) {
				System.out.println(cus);
			}
		}
	}

}
