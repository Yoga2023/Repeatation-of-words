package com.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="By the people for The people OF the people";
		
		String b[]=a.split(" ");
		//Map<wrapper class,wrapper class> m=new type of map<wrpclas,wrp class>();
		Map<String,Integer> m= new HashMap<String,Integer>();
		for (String c : b) {
			

			if(m.containsKey(c)) {
				
			Integer	d=m.get(c);
			m.put(c, d+1);
				
			}else {
				m.put(c, 1);
			}
			
		}
		
		//System.out.println(m);
		Set<Entry<String,Integer>> e =m.entrySet();
		
		for (Entry<String,Integer> entry:e) {
			if(entry.getValue()>1) {
				
			String f=	entry.getKey();
			int g = entry.getValue();
			System.out.println(f+g);
			}
			
		}
	}

}
