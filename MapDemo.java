package com.technoelevate.collection.set.hashset;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map p = new HashMap<Integer, String>();
		p.put(1,"The Sachin");
		p.put(2,"The Jadeja");
		p.put(3,"The Sehwag");
		p.put(4,"The Dhoni");
		p.put(5,"The BhuvneshwarKumar");
		System.out.println(p.containsKey(3));
		System.out.println(p);
		
		
		
		
	}

}
