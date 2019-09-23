package com.jh.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//현재 시간의 정보
		Calendar cal = Calendar.getInstance(); //new GregorianCalendar()
		//get
		int hour = cal.get(Calendar.HOUR); //12시간..
		hour = cal.get(Calendar.HOUR_OF_DAY);//24시간..
		int min = cal.get(Calendar.MINUTE);
		int year = cal.get(Calendar.YEAR);
		//연도 
		int mon = cal.get(Calendar.MONTH); // 1월 0, 2월 1...12월 11 
		//월
		int day = cal.get(Calendar.DATE);
		//일
		int d = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(hour);
		System.out.println(min);
		System.out.println(year);
		System.out.println(mon+1);
		System.out.println(day);
		System.out.println(d);
		
		
	}

}
