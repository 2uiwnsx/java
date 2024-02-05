package com.test.java.data;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Data.load();
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		
		while (loop) {
			
			View.mainMenu();
			
			String num = scan.nextLine();
			
			if (num.equals("1")) {
				
				Service.add();
				
			} else if (num.equals("2")) {
				
				Service.list();
				
			} else if (num.equals("3")) {
				
				Service.delete();
				
			} else {
				
				loop = false;
				
			}
			
		}
		
		Data.save();
				
		System.out.println("\n프로그램을 종료합니다.");
		
		scan.close();
		
	}

}
