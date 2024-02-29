package com.test.java.auth;

import java.util.Scanner;

import com.test.java.auth.admin.Admin;
import com.test.java.auth.auth.Auth;
import com.test.java.auth.data.Data;
import com.test.java.auth.member.Member;

public class Main {
	
	public static void main(String[] args) {
		
		Data.load();
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;

		while (loop) {
			
			System.out.println("====================================");
			System.out.println("       	     회원 관리");
			System.out.println("====================================");
			
			if (Auth.auth == null) {
				
				System.out.println("1. 로그인");
				
			} else {
				
				System.out.println("2. 로그아웃");
				System.out.println("3. 회원 정보");
				System.out.println("4. 회원 전용");
				
				if (Auth.auth.getLv().equals("2")) {
					
					System.out.println("5. 관리자 전용");
					
				}
				
			}

			System.out.println("6. 종료");
			System.out.println("------------------------------------");
			System.out.print("번호를 입력하세요: ");
			String num = scan.nextLine();
			
			if (num.equals("1")) {
				
				Auth.login();
				
			} else if (num.equals("2")) {
				
				Auth.logout();
				
			} else if (num.equals("3")) {
				
				Member.info();
				
			} else if (num.equals("4")) {
				
				Member.something();
				
			} else if (num.equals("5")) {
				
				Admin.something();
				
			} else {
				
				loop = false;
				
			}
			
		}
		
		System.out.println("\n프로그램을 종료합니다.");
		
		scan.close();
		
	}

}
