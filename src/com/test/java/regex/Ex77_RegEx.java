package com.test.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex77_RegEx {
	
	public static void main(String[] args) {
		
		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		
	}

	private static void m5() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[회원가입]");
		
		String id = getData(scan, "아이디");
		String name = getData(scan, "이름");
		String age = getData(scan, "나이");
		String email = getData(scan, "이메일");

		if (isValid(id, name, age, email)) {
			
			System.out.println("가입에 성공하셨습니다.");
			
		} else {
			
			System.out.println("가입에 실패하셨습니다.");
			
		}
		
	}
	
	private static String getData(Scanner scan, String label) {
		
		System.out.print(label + ": ");
		
		return scan.nextLine();
		
	}

	private static boolean isValid(String id, String name, String age, String email) {
		
		String regex = "^[A-Za-z_]\\w{3,11}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(id);
		
		if (!matcher.find() || ((Integer.parseInt(age) < 18) || (Integer.parseInt(age) > 100))) {
			
			System.out.println("4 ~ 12자 이내의 '영문자, 숫자, 밑줄' 조합을 입력하세요. 단, 숫자로 시작할 수 없습니다.");
			
			return false;
			
		}
		
		regex = "^[가-힣]{2,5}$";
		
		pattern = Pattern.compile(regex);
		
		matcher = pattern.matcher(name);
		
		if (!matcher.find()) {
			
			System.out.println("2 ~ 5자 이내의 한글을 입력하세요.");
			
			return false;
			
		}
		
		regex = "^[0-9]{2,3}$";
		
		pattern = Pattern.compile(regex);
		
		matcher = pattern.matcher(age);
		
		if (!matcher.find() || (Integer.parseInt(age) < 18 || Integer.parseInt(age) > 100)) {
			
			System.out.println("18 ~ 100세만 가입할 수 있습니다.");
			
			return false;
			
		}
		
		regex = "\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}";
		
		pattern = Pattern.compile(regex);
		
		matcher = pattern.matcher(email);
		
		if (!matcher.find()) {
			
			System.out.println("****@***.***형식으로 입력하세요.");
			
			return false;
			
		}

		return true;
		
	}

	private static void m4() {

		String txt = "안녕하세요, 홍길동입니다. 성함이 어떻게 되시나요? 남궁길동이요? 알겠습니다.";
		
		String regex = "(홍|김|최|남궁)(길동)";
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		
		while (m1.find()) {
			
			System.out.println("찾은 이름: " + m1.group());
			System.out.println("성: " + m1.group(1));
			System.out.println("이름: " + m1.group(2) + "\n");
			
		}
		
	}

	private static void m3() {

		String txt = "안녕하세요, 홍길동입니다. 제 연락처는 010-1234-5678입니다. 부재 시 010-9876-5432로 연락주세요.";
		
		String regex = "(\\d{3})-(\\d{3,4})-(\\d{4})";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(txt);
		
		while (matcher.find()) {
			
			System.out.println("전화번호: " + matcher.group());
			System.out.println("통신망 번호: " + matcher.group(1));
			System.out.println("지역 번호: " + matcher.group(2));
			System.out.println("가입자 번호: " + matcher.group(3));
			
			System.out.println();
			
		}
		
	}

	private static void m2() {

		String name = "홍길동,아무개;하하하,,테스트 이순신";
		
		String[] list = name.split("[,;\s]{1,2}");
		
		for (String item : list) {
			
			System.out.println(item);
			
		}
		
	}

	private static void m1() {
		
		String txt = "안녕하세요, 홍길동입니다. 제 연락처는 010-1234-5678이고, 이메일 주소는 hong@gmail.com입니다. 부재 시 010-9876-5432로 연락주세요.";
		
		System.out.println(txt.replaceFirst("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
		
		System.out.println(txt.replaceAll("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX")
							.replaceAll("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}", "*****@****.***"));

	}

}
