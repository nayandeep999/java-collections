package com.kodewala.hashset.hashcollison;

import java.util.HashSet;

public class Treefy {
	private String name;

	public Treefy(String name) {
		this.name = name;
	}

	public int hashCode() {
		return 1;
	}

	public static void main(String[] args) {
		Treefy t1 = new Treefy("Obj 1");
		Treefy t2 = new Treefy("Obj 2");
		Treefy t3 = new Treefy("Obj 3");
		Treefy t4 = new Treefy("Obj 4");
		Treefy t5 = new Treefy("Obj 5");
		Treefy t6 = new Treefy("Obj 6");
		Treefy t7 = new Treefy("Obj 7");
		Treefy t8 = new Treefy("Obj 8");
		Treefy t9 = new Treefy("Obj 9");

		// To trigger treefy feature you must set the
		// hashset capacity to 64 or more
		// then treefy will work

		HashSet<Treefy> h = new HashSet<Treefy>(64);
		h.add(t1);
		h.add(t2);
		h.add(t3);
		h.add(t4);
		h.add(t5);
		h.add(t6);
		h.add(t7);
		h.add(t8);
		h.add(t9);

		for (Treefy t : h) {
			System.out.println(t.name);
		}

		h.remove(t9);
		h.remove(t8);
		h.remove(t7);
		h.remove(t6);
		h.remove(t5);

		for (Treefy t : h) {
			System.out.println(t.name);
		}
	}
}
