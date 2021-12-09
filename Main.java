package com.technoelevate.implementation_of_array;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

//		ArrayMadeByMee aa = new ArrayMadeByMee();
		ArrayObjects a1 =new ArrayObjects("Raja",101);
		ArrayObjects a2 =new ArrayObjects("Rani",102);
		ArrayObjects a3 =new ArrayObjects("Raj",103);
		ArrayObjects a4 =new ArrayObjects("Rakumar",104);
//		aa.addElements(a1);
//		aa.addElements(a2);
//		aa.addElements(a3);
//		aa.addElements(a4);
//
//		
//		System.out.println();

		
		ArrayMadeByMee amm = new ArrayMadeByMee();
		amm.addElements(a1);
		amm.addElements(a2);
		amm.addElements(a3);
		amm.addElements(a4);
		
		Iterator itr = amm.iterator();
		
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		
	
	}
}