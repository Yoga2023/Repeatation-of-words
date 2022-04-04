package com.task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		String st="Welcome to to greens to greens java class";
		
		String[] str=st.split(" ");
		Map<String,Integer> m=new HashMap<>();
		for (String sr : str) {
			
			if(m.containsKey(sr))
			{
		Integer it =m.get(sr);
		m.put(sr, it+1);
			
			}else {
				m.put(sr, 1);
			}
			
		}System.out.println(m);
		
/*Set<Entry<String,Integer>> ent=m.entrySet();

for (Entry<String,Integer> entry:ent) {
	if(entry.getValue()>1) {
	String key=entry.getKey();
	int value=entry.getValue();
	System.out.println(key+value);*/
}

	

}
