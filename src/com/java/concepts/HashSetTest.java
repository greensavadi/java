package com.java.concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		Set<Integer> hs = new TreeSet<>();
		
		hs.add(78);
		hs.add(76);
		hs.add(73);
		hs.add(78);
		hs.add(79);
		hs.add(45);
		hs.add(34);
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		boolean contains = hs.contains(45);
		System.out.println(contains);
		
		boolean remove = hs.remove(73);
		System.out.println(remove);
		
		List<Integer> ls = new ArrayList<>();
		ls.add(3);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(5);
		ls.add(4);
		ls.add(2);
		
		hs.clear();
		
		hs.addAll(ls);
		
		System.out.println(hs);
		
		for(Integer i : hs) {
			System.out.println(i);
		}
		System.out.println("=====================");
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
	}

}
