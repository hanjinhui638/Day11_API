package com.jh.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest4 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		
		Date d = new Date();
		System.out.println(d);
		
		d = calendar.getTime();
		System.out.println(d);
	}

}
