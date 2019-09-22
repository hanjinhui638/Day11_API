package com.jh.collection.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {
	//메서드명  start
	//1. 날씨정보 초기화- init
	//2. 날씨정보 추가 - addWeather
	//3. 전체날씨정보  - view 
	//4. 지역날씨검색 - findWeather, view
	//5. 프로그램종료 
	
	//+전화번호부 만들기
	private ArrayList<Weather> weathers;
	private Scanner sc;
	private WeatherService ws;
	private WeatherView wv;
	
	public WeatherMenu() {
		weathers = new ArrayList<Weather>();
		sc = new Scanner(System.in);
		ws = new WeatherService();
		wv = new WeatherView();
		
	}
	
	public void start() {
		boolean check  = true;
		while(check) {
			System.out.println("1.날씨정보 초기화");
			System.out.println("2.날씨정보 추가");
			System.out.println("3.전체날씨정보");
			System.out.println("4.지역날씨검색");
			System.out.println("5. 프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1: 
				ws.init();
				break;
			case 2:
				ws.addweather(weathers);
				break;
			case 3:
				wv.view(weathers);
				break;
			case 4:
				Weather weather = ws.findweather(weathers);
				wv.view(weather);
				break;
			default:
				check = false;
				
			}
			
			
		}
		
	}
}
