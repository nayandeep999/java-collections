package com.kodewala.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> statesAndCapitals = new HashMap<String, String>();
		statesAndCapitals.put("KA", "BLR");
		statesAndCapitals.put("MH", "MUM");
		statesAndCapitals.put("BH", "PT");

		statesAndCapitals.forEach((k, v) -> {
			System.out.println("Key: " + k + ", Value: " + v);
		});

		System.out.printf("\n" + statesAndCapitals);
	}

}
