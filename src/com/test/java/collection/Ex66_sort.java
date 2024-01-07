package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex66_sort {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		
	}

	private static void m5() {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			
			list.add((int)(Math.random() * 100));
			
		}
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return (o1 - o2);
				
			}

		});
		
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return (o2 - o1);
				
			}

		});

		System.out.println(list);
		
	}

	private static void m4() {

		Score[] list = new Score[5];
		
		list[0] = new Score("홍길동", 100, 90, 80);
		list[1] = new Score("아무개", 98, 78, 88);
		list[2] = new Score("이순신", 99, 67, 79);
		list[4] = new Score("유재석", 78, 95, 79);
		list[3] = new Score("박명수", 56, 78, 76);

		Arrays.sort(list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				
				return ((o2.getKor() + o2.getMath() + o2.getEng()) - (o1.getKor() + o1.getMath() + o1.getEng()));
				
			}

		});
		
		System.out.println(Arrays.toString(list));
		
	}

	private static void m3() {

		Calendar[] dates = new Calendar[5];
		
		for (int i = 0; i < dates.length; i++) {
			
			dates[i] = Calendar.getInstance();
			
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 3);
		dates[4].add(Calendar.DATE, 1);
		
		for (int i = 0; i < dates.length; i++) {
			
			System.out.printf("%tF\n", dates[i]);
			
		}
		
		System.out.println();
		
		Arrays.sort(dates);
		
		for (int i = 0; i < dates.length; i++) {
			
			System.out.printf("%tF\n", dates[i]);
			
		}
		
		System.out.println();
		
		Arrays.sort(dates, new Comparator<Calendar>() {

			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				return (o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK));
				
			}

		});
		
		for (int i = 0; i < dates.length; i++) {
			
			System.out.printf("%tF %tA\n", dates[i], dates[i]);
			
		}
		
	}

	private static void m2() {
		
		String[] names = {"홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철"};
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o2.compareTo(o1);
				
			}

		});
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if (o1.length() > o2.length()) {
					
					return 1;
					
				} else if (o1.length() < o2.length()) {
					
					return -1;
					
				} else {
					
					return o1.compareTo(o2);
					
				}
				
			}

		});
		
		System.out.println(Arrays.toString(names));
		
		System.out.println();
		
		String txt1 = "ABC";
		String txt2 = "abc";
		int n = 0;
		
		for (int i = 0; i < 3; i++) {
			
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if (c1 > c2) {
				
				n = 1;
				
				break;
				
			} else if (c1 < c2) {
				
				n = -1;
				
				break;
				
			}
			
		}
		
		System.out.println(n);
		System.out.println(txt1.compareTo(txt2));
		System.out.println(txt1.compareToIgnoreCase(txt2));
		
	}

	private static void m1() {
		
		Integer[] nums1 = {1, 5, 2, 4, 3};
		
		Arrays.sort(nums1);
		
		System.out.println(Arrays.toString(nums1));
		
		Integer[] nums2 = {1, 5, 2, 4, 3};
		
		Arrays.sort(nums2, new MyComparator());
		
		System.out.println(Arrays.toString(nums2));
		
		System.out.println();
		
		Double[] nums3 = {2.3, 7.1, 3.8, 9.2, 8.9};
		
		Arrays.sort(nums3, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {

				return (int)((o2 - o1) * 10);
				
			}

		});
		
		System.out.println(Arrays.toString(nums3));
		
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if (o1 > o2) {
			
			return -1;
			
		} else if (o1 < o2) {
			
			return 1;
			
		} else {
			
			return 0;
			
		}
		
	}

}

class Score {
	
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	public Score(String name, int kor, int math, int eng) {

		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}
	
	public int getEng() {
		return eng;
	}

	@Override
	public String toString() {
		
		return "[name=" + name + ", kor=" + kor + ", math=" + math  + ", eng=" + eng + "]\n";
		
	}
	
}
