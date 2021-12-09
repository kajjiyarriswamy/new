package com.technoelevate.implementation_of_array;

import java.util.Iterator;

public class ArrayMadeByMee implements Iterable{
	private Object[] array;
	private int position = 0;

	public ArrayMadeByMee() {
        int size=1;
		this.array = new Object[size];

	}

	public void addElements(Object obj) {
		if (this.position >= this.size()) {
			grow();
		}
		this.array[position] = obj;
		position++;
	}

	public Object[] grow() {

		Object[] obj = this.array;
		this.array = new Object[size() * 2];
		for (int i = 0; i < obj.length; i++) {
			this.array[i] = obj[i];
		}
		return null;

	}

	public int size() {
		return this.array.length;
	}

	public void  getElements() {
		 for(Object obj:array) {
			  System.out.println(obj+" ");
		 }
	}

		
	 public Object getElement(int index) {
		 return this.array[index];
	 }
	 
	  public Iterator iterator() {
		  return null; //new MyIterator();
	  }
	 
	 private class MyIterator implements Iterator {
        int tempVar;
		@Override
		public boolean hasNext() {
			return(tempVar<position)?true:false;
		}

		@Override
		public Object next() {
			
			return array[tempVar++];
		}
	 }
}
