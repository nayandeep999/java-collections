package com.kodewala.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		// maintains order using linked list
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("hello");
		h.add("hi");
		h.add("how");
		h.add("are");
		h.add("you");
		h.add("hello");
		System.out.println(h);
	}
}
