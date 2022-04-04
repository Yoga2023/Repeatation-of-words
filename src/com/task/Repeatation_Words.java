package com.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeatation_Words {

	public static void main(String[] args) {

		String a = "By the people for the people of the people";

		String[] b = a.split(" ");

		Map<String, Integer> words = new HashMap<>();

		for (String c : b) {
			if (words.containsKey(c)) {
				Integer d = words.get(c);
				words.put(c, d + 1);
			} else {
				words.put(c, 1);
			}
		}
		

		Set<Entry<String, Integer>> ent = words.entrySet(); // System.out.println(ent);

		for (Entry<String, Integer> entry : ent) {
			if (entry.getValue() > 1) {

				String key = entry.getKey();
				int value = entry.getValue();

				System.out.println(key + value);
			}

		}

	}
}
