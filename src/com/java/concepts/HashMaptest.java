package com.java.concepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMaptest {
	
	public static void main(String[] args) {
		
		Map<String,Integer> mark_map = new TreeMap<>();
		
		mark_map.put("cse001", 45);
		mark_map.put("cse003", 67);
		mark_map.put("cse002", 45);
		mark_map.put("cse001", 78);
		mark_map.put("cse003", 45);
		mark_map.put("", 49);
		
		System.out.println(mark_map);
		
		System.out.println(mark_map.size());
		
		System.out.println(mark_map.get("cse003"));
		
		System.out.println(mark_map.containsKey("cse005"));
		
		System.out.println(mark_map.containsValue(67));
		
		Set<String> keySet = mark_map.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = mark_map.values();
		System.out.println(values);
		
		Set<Entry<String, Integer>> entrySet = mark_map.entrySet();
		System.out.println(entrySet);
		
		
	}

}
