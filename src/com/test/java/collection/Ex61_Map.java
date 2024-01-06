package com.test.java.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex61_Map {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("국어", 100);
		map1.put("수학", 90);
		map1.put("영어", 80);
		
		System.out.println(map1.size());
		
		System.out.println();
		
		System.out.println(map1.get("국어"));
		System.out.println(map1.get("수학"));
		System.out.println(map1.get("영어"));
		
		System.out.println();
		
		map1.put("국어", 95);
		
		System.out.println(map1.get("국어"));
		
		System.out.println();
		
		System.out.println(map1.containsKey("과학"));
		System.out.println(map1.containsValue(80));
		
		System.out.println();
		
		map1.remove("영어");
		
		System.out.println(map1.size());
		
		System.out.println();
		
		map1.clear();
		
		System.out.println(map1.size());
		
		System.out.println();
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map2.put("반장", "홍길동");
		map2.put("부반장", "아무개");
		map2.put("회장", "하하하");
		map2.put("부회장", "호호호");
		
		Set<String> set = map2.keySet();
		
		System.out.println(set);
		
		System.out.println();
		
		for (String key : set) {
			
			System.out.println(key + ": " + map2.get(key));
			
		}

	}

}
