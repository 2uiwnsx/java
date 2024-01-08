package com.test.java.collection;

import java.util.TreeMap;

public class Ex70_TreeMap {
	
	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("white", "하양");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");

		System.out.println(map);
		
		System.out.println();
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("g"));
		System.out.println(map.tailMap("o"));
		System.out.println(map.subMap("r", "y"));
		
	}

}
