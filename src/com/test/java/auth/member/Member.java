package com.test.java.auth.member;

import java.util.Scanner;

import com.test.java.auth.auth.Auth;

public class Member {

	public static void info() {
		
		if (Auth.auth == null) {
			
			System.out.println("\n회원만 접근 가능합니다.\n");
			
			return;
			
		}
		
		System.out.println("====================================");
		System.out.println("     	     회원 정보");
		System.out.println("====================================");
		
		System.out.println("아이디: " + Auth.auth.getId());
		System.out.println("이름: " + Auth.auth.getName());
		System.out.println("등급: " + (Auth.auth.getLv().equals("1") ? "일반 회원" : "관리자"));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter 키를 누르면, 메뉴가 출력됩니다.");
		scan.nextLine();
		
	}

	public static void something() {
		
		if (Auth.auth == null) {
			
			System.out.println("\n회원만 접근 가능합니다.\n");
			
			return;
			
		}

		System.out.println("\n회원 전용 기능입니다.");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter 키를 누르면, 메뉴가 출력됩니다.");
		scan.nextLine();
		
	}

}
