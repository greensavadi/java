package com.java.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List<Integer> mark_list = new LinkedList<>();
		
		mark_list.add(67);
		mark_list.add(89);
		mark_list.add(56);
		mark_list.add(68);
		mark_list.add(0);
		mark_list.add(34);
		mark_list.add(34);
		
		
//		Collections.sort(mark_list);
//		
//		System.out.println(mark_list);
//		
//		Collections.sort(mark_list ,Collections.reverseOrder());
//		
//		System.out.println(mark_list);
//		
//		Collections.addAll(mark_list, 56,76,98,94,35);
//		
//		System.out.println(mark_list);
//		
//		System.out.println(Collections.max(mark_list));
//		System.out.println(Collections.min(mark_list));
//		
		
		
//		System.out.println(mark_list);
//		
//		int size = mark_list.size();
//		System.out.println(size);
//		
//		Integer integer = mark_list.get(3);
//		System.out.println(integer);
//		
//		Integer set = mark_list.set(4, 78);
//		System.out.println(set);
//		
//		Integer remove = mark_list.remove(5);
//		System.out.println(remove);
//		
//		
//		
//		boolean contains = mark_list.contains(98);
//		System.out.println(contains);
//		
////		mark_list.clear();
////		
////		System.out.println(mark_list);
//		
//		
////		List ll = new ArrayList<Integer>();
////		
////		Object[] aaa = new Integer[5];
////		
////		aaa[0] = 56;
////		aaa[1] = 34.45;
////		aaa[3] = "qwer";
////		System.out.println("$$$$$$$$$$$$$$$$$$");
////		System.out.println(Arrays.toString(aaa));
////		
////		
////		
////		
////		ll.add(56);
////		ll.add("qwer");
////		ll.add(234.345);
////		
////		System.out.println(ll);
////		
//////		ll.addAll(mark_list);
//////		
////		mark_list.addAll(ll);
////		System.out.println(mark_list);
////		System.out.println(ll);
////		
////		ll.add(34);
////		
////		System.out.println(ll);
////		
////	//	ll.removeAll(mark_list);
////		
//////		mark_list.removeAll(ll);
//////		System.out.println(mark_list);
////		
//////		mark_list.retainAll(ll);
//////		System.out.println(mark_list);
////		
////		for(int i=0;i<mark_list.size();i++) {
////			System.out.println(mark_list.get(i));
////		}
////		System.out.println("=====================");
////		for(Integer m : mark_list) {
////			System.out.println(m);
////		}
////		System.out.println("======================");
////		
////		Iterator<Integer> itr = mark_list.iterator();
////		while(itr.hasNext()) {
////			System.out.println(itr.next());
////		}
////		
////		System.out.println("================");
////		
////		ListIterator<Integer> it = mark_list.listIterator();
////		while(it.hasNext()) {
////			System.out.println(it.next());
////		}
////		System.out.println("*********************");
////		while(it.hasPrevious()) {
////			System.out.println(it.previous());
////		}
//		System.out.println("---------------------------------");
		Object[] array = mark_list.toArray();
		System.out.println(Arrays.toString(array));
		
		
		
		
	}

}
