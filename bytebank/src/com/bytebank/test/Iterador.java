package com.bytebank.test;

import java.util.*;

public class Iterador {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<>();
		nombres.add("Super Mario");
		nombres.add("Yoshi"); 
		nombres.add("Donkey Kong"); 

		Iterator<String> it = nombres.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
		
		Set<String> nombrex = new HashSet<>();
		nombrex.add("Super Mario");
		nombrex.add("Yoshi"); 
		nombrex.add("Donkey Kong"); 

		Iterator<String> its = nombrex.iterator();

		while(its.hasNext()) {
		  System.out.println(its.next());
		}
	}
	
}
