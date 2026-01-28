package com.kodewala.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapItr {

	public static void main(String[] args) {
		HashMap<String, String> gcAndModel = new HashMap<String, String>();

		gcAndModel.put("NVIDEA", "RTX5080");
		gcAndModel.put("AMD", "90XT");

		Set<Entry<String, String>> gcSet = gcAndModel.entrySet();
		Iterator<Entry<String, String>> gcSetItr = gcSet.iterator();

		while (gcSetItr.hasNext()) {
			System.out.println(gcSetItr.next());
		}
		System.out.println("finished");

		Set<Entry<String, String>> setOfgc = gcAndModel.entrySet();
		Iterator<Entry<String, String>> itr = setOfgc.iterator();

		Iterator<Entry<String, String>> itrOneLine = gcAndModel.entrySet().iterator();
		while (itrOneLine.hasNext()) {
			System.out.println(itrOneLine.next());
		}

		gcAndModel.forEach((k, v) -> {
			System.out.println(k + " " + v);
		});

		Set<Entry<String, String>> set = gcAndModel.entrySet();
		Iterator<Entry<String, String>> itr2 = set.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		for (Entry<String, String> ent : gcAndModel.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
		}

		// Set<Entry<String,String>> setOfGc2

	}

}
