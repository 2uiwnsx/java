package com.test.java.auth.auth;

import java.util.Scanner;

import com.test.java.auth.data.Data;
import com.test.java.auth.data.Member;

public class Auth {
	
	public static Member auth;

	public static void login() {

		System.out.println("====================================");
		System.out.println("       	      로그인");
		System.out.println("====================================");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		System.out.print("비밀번호: ");
		String pw = scan.nextLine();
		
		for (Member m : Data.list) {
			
			if (m.getId().equals(id) && m.getPw().equals(pw)) {
				
				Auth.auth = m;
				
				break;
				
			}
			
		}
		
		if (Auth.auth != null) {
			
			System.out.println("\n로그인에 성공하셨습니다.");
			
		} else {
			
			System.out.println("\n로그인에 실패하셨습니다.");
			
		}
		
		System.out.println("\nEnter 키를 누르면, 메뉴가 출력됩니다.");
		scan.nextLine();
		
	}

	public static void logout() {

		Auth.auth = null;
		
		System.out.println("\n로그아웃했습니다.");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter 키를 누르면, 메뉴가 출력됩니다.");
		scan.nextLine();
		
	}

}
