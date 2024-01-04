package com.test.java;

public class Ex33_Array {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		
	}

	// 예제4
	private static void m4() {

		String[] member = {"홍길동", "임꺽정", "성춘향", "강호동", "정형돈", "김국진", "노홍철", "하하", "유재석", "박명수"};
		
		// Q. 검색어가 배열에 저장되어 있는지 확인한 결과를 출력하시오.
		
		String name = "김연아";
		
		if (contains(member, name)) {
			
			System.out.println("저장되어 있습니다.");
			
		} else {
			
			System.out.println("저장되어 있지 않습니다.");
			
		}
		
		System.out.println();
		
		// Q. 검색어가 배열에 저장되어 있다면, 해당 인덱스를 출력하시오.
		
		int index = indexOf(member, name);
		
		System.out.println(index);
		
	}

	private static int indexOf(String[] member, String name) {

		for (int i = 0; i < member.length; i++) {
			
			if (member[i].equals(name)) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}

	private static boolean contains(String[] member, String name) {
		
		for (int i = 0; i < member.length; i++) {
			
			if (member[i].equals(name)) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

	// 예제3
	private static void m3() {

		int[] nums1 = {10, 20, 30};
		
		for (int i = 0; i < nums1.length; i++) {
			
			System.out.println(nums1[i]);
			
		}
		
		System.out.println();
		
		int[][] nums2 = {{10, 20, 30}, {40, 50, 60}};
		
		for (int i = 0; i < nums2.length; i++) {
			
			for (int j = 0; j < nums2[i].length; j++) {
			
				System.out.println(nums2[i][j]);
				
			}
			
		}
		
	}

	// 예제2
	private static void m2() {

		int[] nums1 = new int[3];
		int[] nums2 = new int[] {10, 20, 30};
		int[] nums3 = {10, 20, 30};
		
		int[][] nums4 = new int[2][3];
		int[][] nums5 = new int[][] {{10, 20, 30}, {40, 50, 60}};
		int[][] nums6 = {{10, 20, 30}, {40, 50, 60}};
		
		int[][][] nums7 = new int[2][2][3];
		int[][][] nums8 = new int[][][] {{{10, 20, 30}, {40, 50, 60}}, {{10, 20, 30}, {40, 50, 60}}};
		int[][][] nums9 = {{{10, 20, 30}, {40, 50, 60}}, {{10, 20, 30}, {40, 50, 60}}};
		
		int[][][] nums10 =
		{
			{
				{10, 20, 30},
				{40, 50, 60}
			},
			{
				{10, 20, 30},
				{40, 50, 60}
			}
		};
		
	}

	// 예제1
	private static void m1() {

		// Q. 1차원 배열의 모든 요소를 출력하시오.
		
		int[] nums1 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;		
		
		for (int i = 0; i < 3; i++) {
			
			System.out.printf("nums1[%d] = %d\n", i, nums1[i]);
			
		}
		
		System.out.println();

		// Q. 2차원 배열의 모든 요소를 출력하시오.
		
		int[][] nums2 = new int[2][3];
		
		nums2[0][0] = 100;
		nums2[0][1] = 200;
		nums2[0][2] = 300;
		
		nums2[1][0] = 400;
		nums2[1][1] = 500;
		nums2[1][2] = 600;
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.printf("nums2[%d][%d] = %d\n", i, j, nums2[i][j]);
				
			}
			
		}
		
		System.out.println();
		
		// Q. 3차원 배열의 모든 요소를 출력하시오.
		
		int[][][] nums3 = new int[2][2][3];
		
		nums3[0][0][0] = 100;
		nums3[0][0][1] = 200;
		nums3[0][0][2] = 300;
		
		nums3[0][1][0] = 400;
		nums3[0][1][1] = 500;
		nums3[0][1][2] = 600;
		
		nums3[1][0][0] = 700;
		nums3[1][0][1] = 800;
		nums3[1][0][2] = 900;
		
		nums3[1][1][0] = 1000;
		nums3[1][1][1] = 1100;
		nums3[1][1][2] = 1200;
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 2; j++) {
				
				for (int k = 0; k < 3; k++) {
					
					System.out.printf("nums3[%d][%d][%d] = %d\n", i, j, k, nums3[i][j][k]);
					
				}

			}
			
		}
		
	}

}
