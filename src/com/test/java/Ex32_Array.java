/*
	▶ 정렬 순서
		
		▷ 오름차순
		
			◆ 작은 숫자에서 큰 숫자로 정렬
			◆ 문자 코드 값이 작은 문자에서 큰 문자로 정렬
			◆ 과거에서 미래로 정렬
				
		▷ 내림차순
			
			◆ 큰 숫자에서 작은 숫자로 정렬
			◆ 문자 코드 값이 큰 문자에서 작은 문자로 정렬
			◆ 미래에서 과거로 정렬
			
	----------------------------------------------------------------------

	▶ 덤프(Dump) : 메모리에 저장된 내용을 특정 형식의 문자열로 표현하는 것
*/

package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		// m9();
		// m10();
		// m11();
		// m12();
		// m13();
		
	}

	// 예제13
	private static void m13() {
		
		// Q. 퀵 정렬 알고리즘을 사용한 결과를 출력하시오.

		int[] nums = {5, 3, 1, 4, 2};
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
	}

	// 예제12
	private static void m12() {
		
		// Q. 버블 정렬 알고리즘을 사용한 결과를 출력하시오.
		
		int[] nums = {5, 3, 1, 4, 2};
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println();
		
		int temp = 0;
		
		for (int i = 0; i < (nums.length - 1); i++) {
			
			for (int j = 0; j < ((nums.length - 1) - i); j++) {
				
				if (nums[j] > nums[j + 1]) {
					
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

	// 예제11
	private static void m11() {

		// Q. 배열을 초기화한 결과를 출력하시오.
		
		int[] nums1 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		System.out.println(Arrays.toString(nums1));
		
		int[] nums2 = new int[] {100, 200, 300};
		
		System.out.println(Arrays.toString(nums2));
		
		int[] nums3 = {100, 200, 300};
		
		System.out.println(Arrays.toString(nums3));
		
		System.out.println();
		
		String[] names1 = new String[3];
		
		names1[0] = "홍길동";
		names1[1] = "아무개";
		names1[2] = "하하하";
		
		System.out.println(Arrays.toString(names1));
		
		String[] names2 = new String[] {"홍길동", "아무개", "하하하"};
		
		System.out.println(Arrays.toString(names2));
		
		String[] names3 = {"홍길동", "아무개", "하하하"};
		
		System.out.println(Arrays.toString(names3));
		
	}

	// 예제10
	private static void m10() {
		
		/*
			▶ 배열은 생성되는 순간에 기본값으로 자동 초기화된다.
			
				▷ 정수형 : 0
				▷ 실수형 : 0.0
				▷ 문자형 : \0
				▷ 논리형 : false
				▷ 참조형 : null
		*/

		int[] nums1 = new int[3];
		
		System.out.println(Arrays.toString(nums1));
		
		System.out.println();
		
		double[] nums2 = new double[3];
		
		System.out.println(Arrays.toString(nums2));
		
		System.out.println();
		
		char[] list1 = new char[3];
		
		System.out.println(Arrays.toString(list1));
		
		System.out.println();
		
		boolean[] list2 = new boolean[3];
		
		System.out.println(Arrays.toString(list2));
		
		System.out.println();
		
		String[] list3 = new String[3];
		
		System.out.println(Arrays.toString(list3));
		
	}

	// 예제9
	private static void m9() {
		
		// Q. 배열의 모든 요소를 출력하시오.
		
		int[] nums = new int[3];
		
		nums[0] = 111;
		nums[1] = 222;
		nums[2] = 333;
		
		System.out.println(nums);
		
		printArray(nums);

		System.out.println(Arrays.toString(nums));
		
		System.out.println();
		
		int[] copy = Arrays.copyOfRange(nums, 0, nums.length);
		
		nums[0] = 1000;
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(copy));
		
	}

	private static void printArray(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]);
			
		}
		
	}

	// 예제8
	private static void m8() {
		
		/*
			▶ 얕은 복사(Shallow Copy)
			
				▷ 메모리 주소를 복사한다.
				▷ Side Effect가 발생한다.
			
			▶ 깊은 복사(Deep Copy)
			
				▷ 요소를 복사한다.
				▷ Side Effect가 발생하지 않는다.
		*/

		int[] nums = new int[3];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = new int[3];
		
		for (int i = 0; i < nums.length; i++) {
			
			copy[i] = nums[i];
			
		}
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
		
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
		
	}

	// 예제7
	private static void m7() {

		int a = 10;
		int b = a;
		
		a = 20;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		System.out.println();

		int[] nums = new int[3];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = nums;
		
		nums[0] = 1000;
		
		System.out.println("nums[0]: " + nums[0]);
		System.out.println("copy[0]: " + copy[0]);
		
		/*
			▶ 배열 생성 과정
				
				▷ 배열에 메모리 공간이 할당된다. 이때 할당된 메모리 공간은 Heap 영역에 위치한다.
				▷ 지역 변수에 메모리 공간이 할당된다. 이때 할당된 메모리 공간은 Stack 영역에 위치한다.
				▷ 지역 변수에 배열의 메모리 주소가 저장된다.
				▷ 인덱스를 사용하여 배열의 각 요소에 접근할 수 있다.
		*/
		
	}

	// 예제6
	private static void m6() {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요: ");
		int count = scan.nextInt();

		int[] kors = new int[count];
		
		System.out.println(kors.length);
		
		scan.close();
		
	}

	// 예제5
	private static void m5() {

		int[] nums = new int[3];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
	}

	// 예제4
	private static void m4() {
		
		// Q. 자료형이 long인 값을 저장할 수 있는 배열의, 첫 번째 요소를 출력하시오.

		long[] list1 = new long[5];
		
		list1[0] = 100;
		
		System.out.println(list1[0]);
		
		System.out.println();
		
		// Q. 자료형이 double인 값을 저장할 수 있는 배열의, 첫 번째 요소를 출력하시오.
		
		double[] list2 = new double[5];
		
		list2[0] = 3.14;
		
		System.out.println(list2[0]);
		
		System.out.println();
		
		// Q. 자료형이 char인 값을 저장할 수 있는 배열의, 첫 번째 요소를 출력하시오.
		
		char[] list3 = new char[5];
		
		list3[0] = 'A';
		
		System.out.println(list3[0]);
		
		System.out.println();
		
		// Q. 자료형이 boolean인 값을 저장할 수 있는 배열의, 첫 번째 요소를 출력하시오.
		
		boolean[] list4 = new boolean[5];
		
		list4[0] = true;
		
		System.out.println(list4[0]);
		
		System.out.println();
		
		// Q. 자료형이 String인 값을 저장할 수 있는 배열의, 첫 번째 요소를 출력하시오.
		
		String[] list5 = new String[5];
		
		list5[0] = "홍길동";
		
		System.out.println(list5[0]);
		
		System.out.println();
		
		// Q. 시각을 저장할 수 있는 배열의, 첫 번째 요소를 출력하시오.
		
		Calendar[] list6 = new Calendar[5];
		
		list6[0] = Calendar.getInstance();
		
		System.out.printf("%tF\n", list6[0]);
		
	}

	// 예제3
	private static void m3() {

		int[] nums = new int[3];
		
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = i;
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
			
		}
		
	}

	// 예제2
	private static void m2() {
		
		// Q. 학생 3명의 국어 점수 총점과 평균을 출력하시오.
		
		int[] kors = new int[3];
				
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		int total = 0;
		
		for (int i = 0; i < kors.length; i++) {
			
			total += kors[i];
			
		}

		double avg = (double)total / kors.length;
				
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
	}

	// 예제1
	private static void m1() {

		// Q. 학생 3명의 국어 점수 총점과 평균을 출력하시오.
		
		int kor1 = 100, kor2 = 90, kor3 = 80;
		
		int total = kor1 + kor2 + kor3;
		double avg = total / 3.0;
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
		
	}

}
