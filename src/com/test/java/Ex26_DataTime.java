/*
	▶ Date 클래스, Calender 클래스 : 날짜와 시간을 다루기 위한 클래스
	
	▶ 시각 : 시간의 어느 한 시점
	▶ 시간 : 시각과 시각 사이의 간격
	
	▶ 시각과 시간의 연산
	
		▷ 시각 - 시각 = 시간
		▷ 시간 + 시간 = 시간
		▷ 시간 - 시간 = 시간
		▷ 시각 + 시간 = 시각
		▷ 시각 - 시간 = 시각
		
	▶ 형식 문자
	
		▷ %tF : 날짜
		▷ %tT : 시간
		▷ %tA : 요일
*/

package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex26_DataTime {
	
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
	
	// 예제8
	private static void m8() {
		
		// Q. 현재 시각을 밀리세컨드로 변환한 값을 출력하시오.

		Calendar now = Calendar.getInstance();
		
		System.out.println(now.getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
	}

	// 예제7
	private static void m7() {
		
		// Q. '2시간'을 출력하시오.
		
		int hour = 2;
		
		System.out.printf("%d시간\n", hour);
		
		System.out.println();
		
		// Q. '2시간 30분'을 출력하시오.
		
		int min = 30;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		System.out.println();
		
		// Q. '2시간 40분'을 출력하시오.
		
		min += 10;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		System.out.println();
		
		// Q. '3시간 10분'을 출력하시오.
		
		min += 30;
		hour += min / 60;
		min = min % 60;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
	}

	// 예제6
	private static void m6() {

		Calendar now = Calendar.getInstance();
		
		// Q. 종강까지 남은 일수를 출력하시오.
		
		Calendar end = Calendar.getInstance();
		
		end.set(2023, 11, 27);
		
		long nowTick = now.getTimeInMillis();
		long endTick = end.getTimeInMillis();
		
		System.out.printf("%d일\n", (endTick - nowTick) / 1000 / 60 / 60 / 24);
		
		System.out.println();
		
		// Q. 크리스마스까지 남은 일수를 출력하시오.
		
		Calendar christmas = Calendar.getInstance();
		
		christmas.set(2023, 11, 25);
		
		long christmasTick = christmas.getTimeInMillis();
		
		System.out.printf("%d일\n", (christmasTick - nowTick) / 1000 / 60 / 60 / 24);
		
		System.out.println();
		
		// Q. 본인이 지금까지 살아온 연, 월, 일, 시를 출력하시오.
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(2000, 9, 6, 0, 15, 0);
		
		long birthdayTick = birthday.getTimeInMillis();
		
		System.out.printf("연: %,d년\n", (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 365);
		System.out.printf("월: %,d월\n", (nowTick - birthdayTick) / 1000 / 60 / 60 / 24 / 30);
		System.out.printf("일: %,d일\n", (nowTick - birthdayTick) / 1000 / 60 / 60 / 24);
		System.out.printf("시: %,d시\n", (nowTick - birthdayTick) / 1000 / 60 / 60);
		
	}

	// 예제5
	private static void m5() {

		// Q. 개강일을 출력하시오.

		Calendar start = Calendar.getInstance();
		
		start.set(2023, 6, 14);
		
		System.out.printf("%tF %tA\n", start, start);
		
		// Q. 종강일을 출력하시오.

		Calendar end = Calendar.getInstance();
		
		end.set(2023, 11, 27);
		
		System.out.printf("%tF %tA\n", end, end);
		
	}

	// 예제4
	private static void m4() {

		// Q. 오늘부터 사귀는 커플의 100일 기념일 날짜를 출력하시오.

		Calendar now = Calendar.getInstance();
		
		now.add(Calendar.DATE, 100);
		
		System.out.printf("%tF\n", now);
		
		System.out.println();
				
		// Q. 본인의 돌잔치가 진행된 날짜를 출력하시오.
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(2000, 9, 6);
		
		birthday.add(Calendar.YEAR, 1);
		
		System.out.printf("%tF\n", birthday);
		
		System.out.println();
				
		// Q. 현재 날짜를 기준으로, 12일 전의 날짜를 출력하시오.
				
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -12);
		
		System.out.printf("%tF\n", now);
		
		System.out.println();
				
		// Q. 현재 시각을 기준으로, 3시간 25분 뒤의 시각을 출력하시오.
				
		now = Calendar.getInstance();
		
		now.add(Calendar.HOUR, 3);
		now.add(Calendar.MINUTE, 25);
		
		System.out.printf("%tT\n", now);
		
	}

	// 예제3
	private static void m3() {
				
		// Q. 올해 크리스마스 날짜를 출력하시오.
		
		Calendar christmas = Calendar.getInstance();
		
		christmas.set(Calendar.MONTH, 11);
		christmas.set(Calendar.DATE, 25);
		christmas.set(Calendar.HOUR_OF_DAY, 0);
		christmas.set(Calendar.MINUTE, 0);
		christmas.set(Calendar.SECOND, 0);
		
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		System.out.println();
				
		// Q. 본인 생일을 출력하시오.
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(2000, 9, 6, 0, 15, 0);
		
		System.out.printf("%tF %tT\n", birthday, birthday);
		
	}

	// 예제2
	private static void m2() {
		
		Calendar c = Calendar.getInstance();

		System.out.println(c.get(1));
		System.out.println(c.get(2));
		
		System.out.println();
		
		int year = 1;
		int month = 2;
		
		System.out.println(c.get(year));
		System.out.println(c.get(month));
		
		System.out.println();

		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		
		System.out.println();
		
		/*
			▶ Calendar.YEAR	: 연도
			▶ Calendar.MONTH : 월 ➜ 1월 : 0
			▶ Calendar.DATE : 일
			▶ Calendar.WEEK_OF_YEAR : 연중 몇 번째 주
			▶ Calendar.WEEK_OF_MONTH : 월의 몇 번째 주
			▶ Calendar.DAY_OF_YEAR : 연중 몇 번째 날
			▶ Calendar.DAY_OF_MONTH : 일
			▶ Calendar.DAY_OF_WEEK : 요일 ➜ 일요일 : 1, 토요일 : 7
			▶ Calendar.HOUR : 시(12시간제)
			▶ Calendar.HOUR_OF_DAY : 시(24시간제)
			▶ Calendar.MINUTE : 분
			▶ Calendar.SECOND : 초
			▶ Calendar.AM_PM : 시간대 ➜ 오전 : 0, 오후 : 1
			▶ Calendar.MILLISECOND : 밀리세컨드
		*/
		
		// Q. '오늘은 2023년 7월 20일입니다.'를 출력하시오.
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n",
						  c.get(Calendar.YEAR),
						  c.get(Calendar.MONTH) + 1,
						  c.get(Calendar.DATE));
		
		System.out.println();

		// Q. '지금은 17시 05분 50초입니다.'를 출력하시오.
		
		System.out.printf("지금은 %d시 %02d분 %02d초입니다.\n",
						  c.get(Calendar.HOUR),
						  c.get(Calendar.MINUTE),
						  c.get(Calendar.SECOND));
		
		System.out.println();

		// Q. '지금은 오후 5시 05분 50초입니다.'를 출력하시오.
		
		System.out.printf("지금은 %s %d시 %02d분 %02d초입니다.\n",
						  c.get(Calendar.AM_PM) == 0 ? "오전" : "오후",
						  c.get(Calendar.HOUR),
						  c.get(Calendar.MINUTE),
						  c.get(Calendar.SECOND));
		
	}

	// 예제1
	private static void m1() {

		Date date = new Date();
		
		System.out.println(date);
				
	}

}
