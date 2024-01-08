/*
	▶ toString() 메서드
	
		▷ Object 클래스에서 선언된 메서드 중 하나이다.
		▷ 객체를 '클래스명@해시코드' 형태로 표현한다.
*/

package com.test.java.obj.inheritance;

import java.util.Date;

public class Ex48_Overriding {
	
	public static void main(String[] args) {

		Time time = new Time(2, 30);
		
		System.out.println(time);
		System.out.println(time.toString());
		System.out.println(time.info());
		
		System.out.println();

		Date now = new Date();
		
		System.out.println(now);
		System.out.println(now.toString());
		
	}

}

class Time {
	
	private int hour;
	private int minute;

	public Time(int hour, int minute) {

		this.hour = hour;
		this.minute = minute;
		
	}
	
	@Override
	public String toString() {
		
		return "Time [hour=" + hour + ", minute=" + minute + "]";
		
	}

	public String info() {
		
		return (this.hour + ":" + this.minute);
		
	}
	
}
