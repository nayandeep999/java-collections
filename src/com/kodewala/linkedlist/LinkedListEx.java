package com.kodewala.linkedlist;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> city = new LinkedList();

		city.add("Bang");
		city.add("Dell");
		city.add("chen");
		city.add("patn");

		System.out.println(city);

		city.add(1, "kol");

		System.out.println(city);

	}
}
