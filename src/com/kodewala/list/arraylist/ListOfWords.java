package com.kodewala.list.arraylist;

import java.util.ArrayList;

public class ListOfWords {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("Apple");

		ArrayList<String> result = new ArrayList<String>();
		words.forEach((e) -> {
			if (e.startsWith("A")) {
				result.add(e);
			}
		});

		System.out.println(result);
	}

}
