package com.kodewala.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.*;
import java.util.Set;

public class PracticeHMItr {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("hello", "hi");
		hm.put("I'm", "Nayandeep");
		hm.put("Nice", "to meet you");

		Set<Entry<String, String>> setOfHm = hm.entrySet();
		Iterator<Entry<String, String>> itrOfSetOfHm = setOfHm.iterator();

		while (itrOfSetOfHm.hasNext()) {
			System.out.println(itrOfSetOfHm.next());
		}

		// in one line - iterator
		Iterator<Entry<String, String>> itrOneLine = hm.entrySet().iterator();

		System.out.println("-------------------------------------------------");

		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("hello", "hi");
		lhm.put("I'm", "Nayandeep");
		lhm.put("Nice", "to meet you");

		Set<Entry<String, String>> setlhm = lhm.entrySet();
		Iterator<Entry<String, String>> itrlhm = setlhm.iterator();

		while (itrlhm.hasNext()) {
			System.out.println(itrlhm.next());
		}

	}

}
