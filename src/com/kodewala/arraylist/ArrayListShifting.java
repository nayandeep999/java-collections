package com.kodewala.arraylist;

import java.util.ArrayList;

public class ArrayListShifting {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList();
		arr.add("hello");
		arr.add("hi");
		arr.add("how");
		arr.add("are");
		arr.add("you");

		System.out.println(arr);

		arr.remove(0); // left shifting O(n)
		System.out.println(arr);

		arr.add(0, "first"); // right shifting O(n)
		System.out.println(arr); // since we reading every number its O(n)
	}

}
