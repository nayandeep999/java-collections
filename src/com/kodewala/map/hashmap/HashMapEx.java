package com.kodewala.map.hashmap;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> statesAndCapital = new HashMap<String, String>();
		statesAndCapital.put("KN", "BLR");
		statesAndCapital.put("BR", "PTN");
		statesAndCapital.put("MH", "MUM");
		statesAndCapital.put("KN", "COORG"); // if you put same key with different values it overrides your value

		System.out.println(statesAndCapital);

		// accessing values
		System.out.println(statesAndCapital.get("OD")); // null, key does not exist on the hash set
		System.out.println(statesAndCapital.get("KN")); // COORG

		// looping hash set using forEach
		statesAndCapital.forEach((k, v) -> {
			System.out.printf("Key: %s, Value: %s\n", k, v);
		});

	}
}
