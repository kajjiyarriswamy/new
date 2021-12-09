package com.technoelevate.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
	private static Set hs = new HashSet();

	public static void main(String[] args) {
		// adda the elements to the set
		hs.add(1);
		hs.add("The Name of the King is ");
		hs.add("Bahubali");
		hs.add(" and his age is " + 23);
		// if we are trying to add the duplicate value it will replace with new but
		// Not contain the duplicate value.
		hs.add(1);
		hs.add("Theb End of the Battle");
		// used to remove the elements from the hashset
		// hs.remove(1);
		System.out.println(hs.contains(1));
		System.out.println(hs.size());
		// By using the for Each Loop for retriving the elements from the set
		for (Object obj : hs) {
			System.out.println(obj);
		}
//          using the iterator also we done
//         Iterator itr = hs.iterator();
//		while (itr.hasNext()) {
//			System.out.println("The set contains the elements are " + itr.next());
//		}
		

	}

	@Override
	public int hashCode() {
		
		return hashCode();
	}

}
