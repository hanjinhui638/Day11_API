package com.jh.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();//현재시간
		//int h = calendar.get(Calendar.HOUR_OF_DAY);
		long l1 = calendar.getTimeInMillis();//1 ==1000
		System.out.println(l1);
		Calendar calendar2 = Calendar.getInstance();//5시간뒤 
		calendar2.add(Calendar.HOUR_OF_DAY, 26);
		long l2 = calendar2.getTimeInMillis();
		//int h2 = calendar2.get(Calendar.HOUR_OF_DAY);
		//1000
		//System.out.println(h2-h);
		//5000/1000 = 5초
		System.out.println(l2);
		System.out.println(l2-l1);
		long l3 = l2-l1;
		System.out.println(l3/(1000*60*60*24));
		long l4 = l3%(1000*60*60*24);
		System.out.println(l4/(1000*60*60));
		
	}

}
