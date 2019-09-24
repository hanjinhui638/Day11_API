package com.jh.test;

import java.util.Calendar;

public class Drink {
	
	private String brand;
	private int price;
	private Calendar calendar; //클래스 - 선언 o new x 
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	

}
