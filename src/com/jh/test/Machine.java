package com.jh.test;

import java.util.Calendar;

public class Machine {

	
	//콜라 선택 
	public Cola makeCola() {
		Cola cola = new Cola();
		cola.setBrand("CocaCola");
		cola.setPrice(1500);
		cola.setCalendar(Calendar.getInstance());
		return cola;
	}
	
	
	//사이다 
	public Cider makeCider(String brand, int price, Calendar calendar) {
		Cider cider = new Cider();
		cider.setBrand(brand);
		cider.setPrice(price);
		cider.setCalendar(calendar);
		return cider;
	}
	
	//물 
	public Water makeWater() {
		return new Water();
		
	}
	
}
