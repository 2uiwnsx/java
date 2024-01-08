package com.test.java.dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Ex74 {
	
	public static void main(String[] args) {
		
		String[] name1 = {"김", "이", "박", "최", "정", "장", "임", "유", "조", "권"};
		String[] name2 = {"진", "민", "인", "지", "서", "수", "은", "영", "석", "동", "현", "훈", "원", "혜"};
		
		String[] address1 = {"서울시", "부산시", "대전시", "광주시", "제주시"};
		String[] address2 = {"강동구", "강남구", "강서구", "강북구", "중구"};
		String[] address3 = {"역삼동", "대치동", "압구정동", "천호동", "방배동"};

		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(".\\data\\people.txt"));
			
			Random rnd = new Random();
			
			for (int i = 0; i < 100; i++) {
				
				int no = i + 1;
				
				String name = name1[rnd.nextInt(name1.length)] +
							name2[rnd.nextInt(name2.length)] +
							name2[rnd.nextInt(name2.length)];
				
				int age = rnd.nextInt(41) + 20;
				
				String tel = "010-" + (rnd.nextInt(9000) + 1000) + "-" + (rnd.nextInt(9000) + 1000);
				
				String address = address1[rnd.nextInt(address1.length)] + " " +
								address2[rnd.nextInt(address2.length)] + " " +
								address3[rnd.nextInt(address3.length)];
				
				writer.write(String.format("%d,%s,%d,%s,%s\r\n", no, name, age, tel, address));
				
			}
			
			writer.close();
			
		} catch (Exception e) {
			
			System.out.println("at Ex74.main");
			
			e.printStackTrace();
			
		}

	}

}
