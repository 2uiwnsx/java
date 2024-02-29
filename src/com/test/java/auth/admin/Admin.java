package com.test.java.auth.admin;

import java.util.Scanner;

import com.test.java.auth.auth.Auth;

public class Admin {

	public static void something() {
		
		if ((Auth.auth == null) || Auth.auth.getLv().equals("1")) {
			
			System.out.println("\n관리자만 접근 가능합니다.\n");
			
			return;
			
		}

		System.out.println("\n관리자 전용 기능입니다.");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter 키를 누르면, 메뉴가 출력됩니다.");
		scan.nextLine();
		
	}

}
