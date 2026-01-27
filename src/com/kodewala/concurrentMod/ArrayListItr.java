package com.kodewala.concurrentMod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListItr {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("BLR");
		cities.add("MY");
		cities.add("PTN");
		cities.add("BHO");

		Iterator<String> citiesItr = cities.iterator();
		while (citiesItr.hasNext()) {
			citiesItr.next();
			// cities.remove(0); // concurrent modification exception
			// cities.add("hello");
		}

		// to do concurrent operations we can use
		// CopyOnwriteArrayList
		CopyOnWriteArrayList<String> name = new CopyOnWriteArrayList<String>();
		name.add("Ram");
		name.add("Krishna");
		name.add("Nayandeep");

//		name.forEach((e) -> {
//			name.remove(0); // concurrent modification allowed
//		});

		// ListIterator allows you loop from backwards
		ListIterator<String> listItr = name.listIterator(name.size());
		while (listItr.hasPrevious()) {
			String str = listItr.previous();
			System.out.println(str);
		}

	}

}
