package com.java.generics;

public class GenericsTypeOld {
	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

    public static void main(String args[]){
		GenericsTypeOld type = new GenericsTypeOld();
		type.set(10); 
		Integer str = (Integer) type.get(); //type casting, error prone and can cause ClassCastException
		System.out.println(str);
	}
}
