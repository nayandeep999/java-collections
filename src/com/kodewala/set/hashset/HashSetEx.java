package com.kodewala.set.hashset;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Blr");
		h.add("Mum");
		h.add("Mum");
		h.add("Chn");
		h.add(null);
		h.add(null);

		String str = "Bdadasdsasd";
		h.add(str);
		System.out.println(h.contains("Blr"));

		System.out.println(h);
	}

}
