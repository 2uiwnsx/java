package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex69_TreeSet {
	
	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		
		System.out.println(set1);
		
		ArrayList<Integer> list = new ArrayList<Integer>(set1);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();

		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		set2.add(50);

		System.out.println(set2);
		
		System.out.println();
		
		for (int n : set2) {
			
			System.out.println(n);
			
		}
		
		System.out.println();
		
		Iterator<Integer> iter = set2.iterator();
		
		while (iter.hasNext()) {
			
			System.out.println(iter.next());
			
		}
		
		System.out.println();
		
		System.out.println(set2.first());
		System.out.println(set2.last());
		System.out.println(set2.headSet(30));
		System.out.println(set2.tailSet(30));
		System.out.println(set2.subSet(20, 40));
		
	}

}
