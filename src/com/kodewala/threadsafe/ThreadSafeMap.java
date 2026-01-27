package com.kodewala.threadsafe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeMap {

	public static void main(String[] args) {
		HashMap<String, String> cityCap = new HashMap<String, String>();

		// thread safe map but locks entire map when writing
		Map<String, String> syncMap = Collections.synchronizedMap(cityCap);

		// thread safe concurrent hashmap uses segment locking
		ConcurrentHashMap<String, String> conMap = new ConcurrentHashMap<String, String>();

	}

}
