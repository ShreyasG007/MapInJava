package com.tka.map.sortedMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "Shreyas");
		hashMap.put(2, "Shubham");
		hashMap.put(3, "Dhanashree");
		hashMap.put(4, "Saurabh");
		
		System.out.println(hashMap);
		
		String name = hashMap.get(1);
		System.out.println(name);
		
		String remove = hashMap.remove(4);
		System.out.println(remove);
		
		System.out.println(hashMap);
		
		boolean containsKey = hashMap.containsKey(4);
		System.out.println("contains key 4 : "+containsKey);
		
		boolean containsValue = hashMap.containsValue("Shreyas");
		System.out.println("contain value Shreyas : "+containsValue);
		
		Set<Integer> keySet = hashMap.keySet();
		System.out.println("KeySet : "+keySet);
		
		Collection<String> values = hashMap.values();
		System.out.println(values);
		
		int size = hashMap.size();
		System.out.println("Size of Map : "+size);
		
		Set<Integer> keys = hashMap.keySet();
		Iterator<Integer> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			System.out.println("Key : "+key+" values : "+hashMap.get(key));
			
		}
		hashMap.replace(2, "Shubham", "Sagar");
		
		System.out.println(hashMap);
	}

}
