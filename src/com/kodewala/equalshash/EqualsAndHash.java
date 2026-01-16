package com.kodewala.equalshash;

class User {
	String name;

	User(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		User u = (User) obj;
		return this.name.equals(u.name);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}

public class EqualsAndHash {

	public static void main(String[] args) {
		User u1 = new User("nayandeep");
		User u2 = new User("nayandeep");
		User u3 = new User("nayandeep");
		User u4 = new User("nayandeep");

		String s1 = "nayandeep";

		System.out.println(u1.hashCode());
		// System.out.println(s1.hashCode());

		System.out.println(u1.equals(s1));
//		System.out.println(u2.hashCode());
//		System.out.println(u3.hashCode());
//		System.out.println(u4.hashCode());

		// a==b, a.hashcode() & b.hashcode();
		// a.hashcode()
	}

}
