package com.task;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MarkDetails {
	public static void main(String[] args) {
		Map<Object, Object> marks = new TreeMap<Object, Object>();
		marks.put("Marks", 500);
		marks.put("Tamil", 85);
		marks.put("English", 76.5f);
		marks.put("Maths", 58);
		marks.put("Science", 98);
		marks.put("Social", 85);

		System.out.println(marks);//Printing marks

		int a = marks.size();//to find size of the map
		System.out.println(a);

		Object b = marks.get("Maths");//to get the value of particular key
		System.out.println(b);

		boolean c = marks.containsKey("science");//to check whether the key is present or not
		System.out.println(c);

		boolean d = marks.containsValue(76.5f);//to check whether the value is present or not
		System.out.println(d);

		Set<Entry<Object, Object>> e = marks.entrySet();//converting from map to set
		System.out.println(e);

		Object g = marks.values();//to get all values present in map
		System.out.println(g);

		Object h = marks.keySet();//to get all key present in map
		System.out.println(h);

	}

}
