package com.test.java.data;

import java.util.Scanner;

public class View {
	
	public static void mainMenu() {
		
		System.out.println("=====================");
		System.out.println("     [학생 관리]");
		System.out.println("=====================");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 목록");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 종료");
		System.out.println("----------------------");
		System.out.print("번호를 입력하세요: ");
		
	}
	
	public static void subTitle(String title) {
		
		System.out.println("=====================");
		System.out.println("    " + title);
		System.out.println("----------------------");
		
	}
	
	public static void pause() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter 키를 누르면, 메뉴가 출력됩니다.");
		scan.nextLine();
		
	}

}
