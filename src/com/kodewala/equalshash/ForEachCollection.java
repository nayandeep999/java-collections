package com.kodewala.equalshash;

import java.util.HashSet;

class Users {
	private String name;
	private String userId;

	public Users(String name, String userId) {
		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public String getUserId() {
		return userId;
	}

	@Override
	public boolean equals(Object obj) {
		Users u = (Users) obj;
		return this.userId.equals(u.userId);
	}

	@Override
	public int hashCode() {
		return this.userId.hashCode();
	}
}

public class ForEachCollection {

	public static void main(String[] args) {
		HashSet<Users> hs = new HashSet<Users>();
		hs.add(new Users("Nayandeep", "001"));
		hs.add(new Users("Nayandeep", "001"));
		hs.add(new Users("Seema", "002"));

		for (Users u : hs) {
			System.out.println(u.getName() + " " + u.getUserId());
		}

	}

}
