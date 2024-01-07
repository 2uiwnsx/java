package com.test.java.calendar;

import java.util.Calendar;

public class Main {
	
	public static void main(String[] args) {
		
		Data.load();
		
		int year = 2023;
		int month = 8;
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, (month - 1), 1);
		
		int lastDate = c.getActualMaximum(Calendar.DATE);
		int firstDay = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("\t\t\t" + month + "월");
		
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		for (int i = 0; i < (firstDay - 1); i++) {
			
			System.out.print("\t");
			
		}

		for (int i = 1; i <= lastDate; i++) {
			
			System.out.printf("%3d\t", i);
			
			if ((firstDay + i) % 7 == 1) {
				
				System.out.println();
				
				for (int j = (i - 6); (j < (i + 1)) && (j <= lastDate); j++) {
					
					System.out.printf("%s\t", getItem(String.format("%d-%02d-%02d", year, month, j)));
					
				}
				
				System.out.println();
				System.out.println();
				
			}
			
		}
		
	}

	private static Object getItem(String date) {

		for (Item item : Data.list) {
			
			if (item.getDate().equals(date)) {
				
				return item.getTitle();
				
			}
			
		}
		
		return "";
		
	}

}
