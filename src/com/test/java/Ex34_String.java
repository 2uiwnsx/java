package com.test.java;

import java.util.Scanner;

public class Ex34_String {
	
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

		String name = ",홍길동,아무개,,유재석,강호동,박명수,";
		
		String[] temp = name.split(",");
		
		for (int i = 0; i < temp.length; i++) {
			
			System.out.printf(i + ": " + temp[i] + "\n");
			
		}
		
	}

	// 예제12
	private static void m12() {

		String txt1 = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		System.out.println(txt1.replace("아무개", "홍길동"));
		
		String txt2 = "     하나     둘    셋     ";
		
		System.out.println(txt2.trim());
		System.out.println(txt2.replace(" ", ""));
		
	}

	// 예제11
	private static void m11() {

		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));
		
	}

	// 예제10
	private static void m10() {

		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3));
		System.out.println(txt.substring(3, 7));

		System.out.println();
		
		String residentRegistrationNumber = "970727-1000001";
		
		if (residentRegistrationNumber.substring(7, 8).equals("1") || residentRegistrationNumber.substring(7, 8).equals("2")) {
			
			System.out.println("성별: 남자");
			
		} else if (residentRegistrationNumber.substring(7, 8).equals("2") || residentRegistrationNumber.substring(7, 8).equals("4")) {
			
			System.out.println("성별: 여자");
			
		}
		
		System.out.println();
		
		System.out.println("연: " + residentRegistrationNumber.substring(0, 2));
		
		System.out.println("월: " + residentRegistrationNumber.substring(2, 4));
		
		System.out.println("일: " + residentRegistrationNumber.substring(4, 6));
		
		System.out.println();
		
		// Q. 파일명을 출력하시오.
		
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		int index = path.lastIndexOf("\\");
		
		String fileName = path.substring(index + 1);
		
		System.out.println(fileName);
		
		// Q. 확장자가 포함되지 않은 파일명을 출력하시오.
		
		index = fileName.lastIndexOf(".");
		
		String fileNameWithoutExtension = fileName.substring(0, index);
		
		System.out.println(fileNameWithoutExtension);

		// Q. 파일의 확장자를 출력하시오.
		
		String extension = fileName.substring(index);
		
		System.out.println(extension);
		
	}

	// 예제9
	private static void m9() {

		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("프로그래밍"));
		
		System.out.println(txt.endsWith("자바"));
		System.out.println(txt.endsWith("프로그래밍"));
		
		System.out.println();
		
		String name = "홍길동";
		
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf("홍") == 0);
		
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length() - 1) == '동');
		System.out.println(name.indexOf("동") == name.length() - 1);
		
		System.out.println();
		
		// Q. 파일의 확장자가 .java인지 확인한 결과를 출력하시오.
		
		String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
		
		if (path.endsWith(".java")) {
			
			System.out.println("맞습니다.");
			
		} else {
			
			System.out.println("아닙니다.");
			
		}
		
	}

	// 예제8
	private static void m8() {

		String word = "java";
		String content = "오늘은 Java에 대해 학습합니다.";

		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		System.out.println();
		
		if (content.indexOf(word) > -1) {
			
			System.out.println("해당 단어가 포함되어 있습니다.");
			
		} else {
			
			System.out.println("해당 단어가 포함되어 있지 않습니다.");
			
		}
		
		System.out.println();
		
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			
			System.out.println("해당 단어가 포함되어 있습니다.");
			
		} else {
			
			System.out.println("해당 단어가 포함되어 있지 않습니다.");
			
		}
		
	}

	// 예제7
	private static void m7() {

		String residentRegistrationNumber = "970727-1000001";
		
		if(residentRegistrationNumber.indexOf('-') == 6) {
			
			System.out.println("올바른 형식의 주민등록번호입니다.");
			
		} else {
			
			System.out.println("올바르지 않은 형식의 주민등록번호입니다.");
			
		}
		
		System.out.println();
		
		// Q. 문장에 금지어가 포함되어 있는지 확인한 결과를 출력하시오.
		
		String[] words = {"바보", "멍청이", "메롱"};
		String content = "안녕하세요. 반갑습니다! 저는 바보가 아니랍니다.";
		
		for (int i = 0; i < words.length; i++) {
			
			if (content.indexOf(words[i]) > -1) {
				
				System.out.println("금지어를 발견했습니다.");
				
				break;
				
			}
			
		}
		
	}

	// 예제6
	private static void m6() {

		String txt1 = "안녕하세요. 홍길동입니다.";
		int index1 = -1;
		
		index1 = txt1.indexOf('하');
		
		System.out.println(index1);
		
		index1 = txt1.indexOf('김');
		
		System.out.println(index1);
		
		index1 = txt1.indexOf("홍길동");
		
		System.out.println(index1);
		
		System.out.println();

		String txt2 = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히 가세요. 홍길동입니다.";
		int index2 = -1;
		
		while (true) {
			
			index2 = txt2.indexOf("홍길동", index2);
			
			if (index2 == -1) {
				
				break;
				
			}
			
			System.out.println(index2);
			
			index2 += 3;
			
		}
		
		System.out.println();
		
		String txt3 = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		System.out.println(txt3.indexOf("홍길동"));
		System.out.println(txt3.lastIndexOf("홍길동"));
		
	}

	// 예제5
	private static void m5() {
		
		// Q. 문자열의 양끝에 존재하는, 공백(스페이스, 탭, 개행 문자)을 제거한 결과를 출력하시오.
		
		String txt = "     하나     둘     셋     ";

		System.out.printf("%s\n", txt.trim());
		
	}

	// 예제4
	private static void m4() {

		String residentRegistrationNumber = "970727-1000001";
		
		System.out.println(residentRegistrationNumber.charAt(6));
		
		if(residentRegistrationNumber.charAt(6) == '-') {
			
			System.out.println("올바른 형식의 주민등록번호입니다.");
			
			if (residentRegistrationNumber.charAt(7) == '1' || residentRegistrationNumber.charAt(7) == '3') {
				
				System.out.println("성별: 남자");
				
			} else if (residentRegistrationNumber.charAt(7) == '2' || residentRegistrationNumber.charAt(7) == '4') {
				
				System.out.println("성별: 여자");
				
			}
			
		} else {
			
			System.out.println("올바르지 않은 형식의 주민등록번호입니다.");
			
		}
		
	}

	// 예제3
	private static void m3() {
		
		// Q. 사용자가 입력한 아이디가 소문자로만 구성되어 있는지 확인한 결과를 출력하시오.
		
	    Scanner scan = new Scanner(System.in);

	    System.out.print("아이디를 입력하세요: ");
	    String id = scan.nextLine();

	    boolean isLowerCase = true;

	    for (int i = 0; i < id.length(); i++) {
	    	
	        if (id.charAt(i) < 'a' || id.charAt(i) > 'z') {
	        	
	            isLowerCase = false;
	            
	            break;
	            
	        }
	        
	    }

	    if (isLowerCase) {
	    	
	        System.out.printf("%s님, 안녕하세요.", id);
	        
	    } else {
	    	
	        System.out.println("소문자만 입력하세요.");
	        
	    }
	    
	    scan.close();
	    
	}

	// 예제2
	private static void m2() {

		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.charAt(3));
		System.out.println(txt.charAt(7));
		System.out.println(txt.charAt(txt.length() - 2));
		
	}

	// 예제1
	private static void m1() {
		
		System.out.println("홍길동".length());
		
		System.out.println("A1가$ ".length());
		
		System.out.println();
		
		// Q. 변수 str에 저장된 값의 길이를 구하시오.
		
		String str = "홍길동입니다.";
		
		System.out.println(str.length());
		
		System.out.println();
		
		// Q. 배열 list의 크기를 구하시오.
		
		char[] list = {'홍', '길', '동', '입', '니', '다', '.'};
		
		System.out.println(list.length);
		
		System.out.println();
	
		// Q. 사용자가 입력한 이름이 2 ~ 5자 이내인지 확인한 결과를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = scan.nextLine();
		
		if (name.length() >= 2 && name.length() <= 5) {
			
			System.out.printf("%s님, 안녕하세요.", name);
			
		} else {
			
			System.out.println("이름을 2 ~ 5자 이내로 작성하세요.");
			
		}
		
		scan.close();
		
	}

}
