package com.test.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex63_File {
	
	private static int dirCount = 0;
	private static int fileCount = 0;
	private static long length = 0;
	
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
		// m14();
		
	}

	private static void m14() {

		File dir = new File("C:\\class\\dev\\eclipse");
		
		if (dir.exists()) {
			
			countFile(dir);
			
			System.out.printf("디렉터리 개수: %,d\n", dirCount);
			System.out.printf("파일 개수: %,d\n", fileCount);
			System.out.printf("총 디렉터리 크기: %,d바이트\n", length);
			
		}
		
	}

	private static void countFile(File dir) {
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			
			if (file.isFile()) {
				
				fileCount++;
				length += file.length();
				
			}
			
		}
		
		for (File subDir : list) {
			
			if (subDir.isDirectory()) {
				
				dirCount++;
				
				countFile(subDir);
				
			}
			
		}
		
	}

	private static void m13() {
		
		String path = "C:\\class\\dev\\eclipse";
		
		File dir = new File(path);
		
		if (dir.exists()) {
			
			String[] list = dir.list();
			
			for (String f : list) {
				
				File file = new File(path + "\\" + f);
				
				System.out.println(f + " ➜ " + (file.isFile() ? "파일" : "디렉터리"));
				
			}

		}
		
		System.out.println();
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			System.out.printf("%s ➜ %s\n", f.getName(), (f.isDirectory() ? "디렉터리" : "파일"));
			
		}
		
	}

	private static void m12() {

		File dir = new File("C:\\class\\code\\java\\file2\\일자");
		
		if (dir.exists()) {
			
			// 디렉터리가 비어 있을 때만 삭제할 수 있다.
			dir.delete();
			
			System.out.println("디렉터리를 삭제했습니다.");
			
		}
		
	}

	private static void m11() {

		File dir1 = new File("C:\\class\\code\\java\\file1\\일자");
		File dir2 = new File("C:\\class\\code\\java\\file2\\일자");
		
		if (dir1.exists()) {
			
			dir1.renameTo(dir2);
			
			System.out.println("디렉터리 위치를 변경했습니다.");
			
		}
		
	}

	private static void m10() {

		File dir1 = new File("C:\\class\\code\\java\\file1\\날짜");
		File dir2 = new File("C:\\class\\code\\java\\file1\\일자");
		
		if (dir1.exists()) {
			
			dir1.renameTo(dir2);
			
			System.out.println("디렉터리명을 변경했습니다.");
			
		}
		
	}

	private static void m9() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2023, 0, 1);
		
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		for (int i = 0; i < max; i++) {
			
			File dir = new File("C:\\class\\code\\java\\file1\\날짜\\" + String.format("%tF", c));
			
			dir.mkdirs();
			
			c.add(Calendar.DATE, 1);
			
		}
		
		System.out.println("디렉터리를 생성했습니다.");
		
	}

	private static void m8() {
		
		String[] member = {"홍길동", "아무개", "이순신", "권율", "유관순"};
		
		for (int i = 0; i < member.length; i++) {
			
			String path = String.format("C:\\class\\code\\java\\file1\\회원\\%s", member[i]);
			
			File dir = new File(path);
			
			dir.mkdirs();

		}
		
		System.out.println("디렉터리를 생성했습니다.");
		
	}

	private static void m7() {
		
		File dir1 = new File("C:\\class\\code\\java\\dir1");
		
		if (!dir1.exists()) {
			
			dir1.mkdir();
			
			System.out.println("디렉터리를 생성했습니다.");
			
		}

		File dir2 = new File("C:\\class\\code\\java\\dir2\\dir");
		
		if (!dir2.exists()) {
			
			dir2.mkdirs();

			System.out.println("디렉터리를 생성했습니다.");
			
		}
		
	}

	private static void m6() {
		
		File file = new File("C:\\class\\code\\java\\file2\\welcome.txt");
		
		if (file.exists()) {
			
			file.delete();
			
			System.out.println("파일을 삭제했습니다.");
			
		}
		
	}

	private static void m5() {

		File file1 = new File("C:\\class\\code\\java\\file1\\temp.txt");
		File file2 = new File("C:\\class\\code\\java\\file2\\welcome.txt");
		
		if (file1.exists()) {
			
			file1.renameTo(file2);
			
			System.out.println("파일명과 위치를 변경했습니다.");
			
		}
		
	}

	private static void m4() {

		File file1 = new File("C:\\class\\code\\java\\file1\\welcome.txt");
		File file2 = new File("C:\\class\\code\\java\\file1\\temp.txt");
		
		if (file1.exists()) {
			
			file1.renameTo(file2);
			
			System.out.println("파일명을 변경했습니다.");
			
		}
		
	}

	private static void m3() {
		
		File file = new File("C:\\class\\code\\java\\file1\\welcome.txt");
		
		if (!file.exists()) {
			
			try {
				
				file.createNewFile();
				
				System.out.println("파일을 생성했습니다.");
				
			} catch (IOException e) {
				
				System.out.println("at Ex63_File.m3");
				
				e.printStackTrace();
				
			}
			
		} else {
			
			System.out.println("동일한 이름의 파일이 존재합니다.");
			
		}
		
	}

	private static void m2() {
		
		File dir = new File("C:\\class\\code\\java\\file1");
		
		if (dir.exists()) {
			
			System.out.println(dir.getName());
			System.out.println(dir.isDirectory());
			System.out.println(dir.isFile());
			System.out.println(dir.isHidden());
			System.out.println(dir.length());
			System.out.println(dir.getAbsolutePath());
			System.out.println(dir.getParent());
			System.out.println(dir.lastModified());
			
		} else {
			
			System.out.println("존재하지 않는 디렉터리입니다.");
			
		}
		
	}

	private static void m1() {
		
		File file = new File("C:\\class\\code\\java\\file1\\hello.txt");
		
		if (file.exists()) {
			
			System.out.println(file.getName());
			System.out.println(file.isDirectory());
			System.out.println(file.isFile());
			System.out.println(file.isHidden());
			System.out.printf("%d바이트\n", file.length());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getParent());

			Calendar c = Calendar.getInstance();

			c.setTimeInMillis(file.lastModified());

			System.out.printf("%tF %tT\n", c, c);

		} else {
			
			System.out.println("존재하지 않는 파일입니다.");
			
		}
		
	}

}
