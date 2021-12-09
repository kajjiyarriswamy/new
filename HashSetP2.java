package com.technoelevate.collection.set.hashset;

public class HashSetP2 {
	private int id;
	private String name;

	public HashSetP2(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
//	@Override
//	public boolean equals() {
//		// TODO Auto-generated method stub
//		return super.equals();
//	}

}
