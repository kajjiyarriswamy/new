package com.technoelevate.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class main2 {
	public static void main(String[] args) {
		Set s = new HashSet();
		HashSetP2 p1 =new HashSetP2(101,"Raja");
		HashSetP2 p2 =new HashSetP2(102,"Swamy");
		HashSetP2 p3 =new HashSetP2(103,"Satish");
		HashSetP2 p4 =new HashSetP2(104,"Navya");
		HashSetP2 p5 =new HashSetP2(105,"Krishna");
		HashSetP2 p6 =new HashSetP2(101,"Raja");
		
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		s.add(p5);
		s.add(p6);
		for(Object obj : s) {
			HashSetP2 p = (HashSetP2)obj;
		System.out.println( "This is the id "+p.getId()+" And name is "+p.getName());
		
	}

}
}