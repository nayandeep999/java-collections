package com.kodewala.list.arraylist.customers;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		CustomerDetails c = new CustomerDetails();

		ArrayList<String> custDetails = c.cusDetails();

		for (String cus : custDetails) {
			if (cus.endsWith("ra")) {
				System.out.println(cus);
			}
		}
	}

}
