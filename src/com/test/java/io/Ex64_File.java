/*
	▶ 인코딩(Encoding) : 데이터를 특정 형식으로 변환하는 작업
	▶ 디코딩(Decoding) : 인코딩된 데이터를 원래의 형식으로 복원하는 작업
				
	▶ 인코딩 및 디코딩 형식
			
		▷ ANSI, ISO-8859-1, EUC-KR, MS949
				
			◆ 영어, 숫자, 특수 문자, 서유럽 언어 등 : 1byte로 표현
			◆ 한글, 한자, 일본어 등 : 2byte로 표현
		
		▷ UTF-8
				
			◆ 영어, 숫자, 특수 문자, 서유럽 언어 등 : 1byte로 표현
			◆ 한글, 한자, 일본어 등 : 3byte로 표현
				
		▷ UTF-16
				
			◆ 영어, 숫자, 특수 문자, 서유럽 언어 등 : 2byte로 표현
			◆ 한글, 한자, 일본어 등 : 2byte로 표현
*/

package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex64_File {
	
	public static final String FILE = "C:\\class\\code\\java\\file1\\list.txt";
	
	public static void main(String[] args) {

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		// m8();
		
	}

	private static void m8() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex01.java"));
			
			int n = 1;
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				System.out.printf("%03d: %s\n", n, line);
				
				n++;
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex64_File.m8");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m7() {
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("저장할 파일명: ");
			String fileName = scan.nextLine();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file1\\" + fileName + ".txt"));
			
			while (true) {
				
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if (line.equals("Exit")) {
					
					break;
					
				}
				
				writer.write(line);
				writer.write("\r\n");

			}
			
			System.out.println("파일을 저장했습니다.");
			
			writer.close();
			
			scan.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex64_File.m7");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m6() {

		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file1\\memo.txt"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				System.out.println(line);
				
			}

			reader.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex64_File.m6");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m5() {

		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file1\\memo.txt"));
			
			writer.write("하나");
			writer.write("\r\n");
			writer.write("둘");
			writer.newLine();
			writer.write("셋");
			
			writer.close();
			
			System.out.println("파일을 저장했습니다.");
			
		} catch (Exception e) {
			
			System.out.println("at Ex64_File.m5");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m4() {
		
		try {
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file1\\member.txt");
			
			int code = -1;
			
			while ((code = reader.read()) != -1) {
				
				System.out.print((char)code);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex64_File.m4");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m3() {
		
		try {
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file1\\member.txt");
			
			writer.write("Gildong Hong");
			writer.write("\r\n");
			writer.write("홍길동");
			
			System.out.println("파일을 저장했습니다.");
			
			writer.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex64_File.m3");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m2() {
		
		try {
			
			FileInputStream stream = new FileInputStream(Ex64_File.FILE);
			
			int code = -1;
			
			while ((code = stream.read()) != -1) {

				System.out.print((char)code);
				
			}
			
			stream.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex64_File.m2");
			
			e.printStackTrace();
			
		}
		
	}

	private static void m1() {

		try {
				
			File file = new File(Ex64_File.FILE);
			
			/*
				▶ 생성 모드(Create mode) : 기존 내용을 삭제하고 새로운 내용으로 덮어쓴다.
				▶ 추가 모드(Append mode) : 파일의 끝에 새로운 내용을 추가한다.
			*/

			FileOutputStream stream = new FileOutputStream(file, true);
			
			String txt = "Hello, Hong!";
			
			for (int i = 0; i < txt.length(); i++) {

				stream.write(txt.charAt(i));
				
			}
			
			System.out.println("파일을 저장했습니다.");
				
			stream.close();
			
		} catch (Exception e) {
				
			System.out.println("at Ex64_File.m1");
			
			e.printStackTrace();
				
		}

	}

}
