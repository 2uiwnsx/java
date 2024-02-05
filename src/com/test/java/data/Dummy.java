package com.test.java.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Dummy {

	public static void main(String[] args) throws IOException {
		
		String[] name1 = {"김", "이", "박", "최", "정", "장", "임", "유", "조", "권"};
		String[] name2 = {"진", "민", "인", "지", "서", "수", "은", "영", "석", "동", "현", "훈", "원", "혜"};
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(".\\data\\student.txt"));
		
		int n = 1;
		
		Random rnd = new Random();
		
		for (int i = 1; i <= 3; i++) {
			
			for (int j = 1; j <= 5; j++) {
				
				for (int k = 1; k <= 10; k++) {

					String name = name1[rnd.nextInt(name1.length)] +
								name2[rnd.nextInt(name2.length)] +
								name2[rnd.nextInt(name2.length)];
					
					String s = String.format("%d,%s,%d,%d,%d\r\n", n, name, i, j, k);
					
					writer.write(s);
					
					n++;
					
				}
				
			}
			
		}
		
		writer.close();
		
	}
	
}
