package com.kodewala.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListItrEx {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("A");
		arr1.add("B");
		arr1.add("C");
		arr1.add("D");

		ListIterator<String> listItrArr = arr1.listIterator(arr1.size());

		while (listItrArr.hasPrevious()) {
			String e = listItrArr.previous();
			System.out.println(e);
		}

	}

}
