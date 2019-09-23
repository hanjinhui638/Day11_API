package com.jh.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;

public class WeatherMenu {
	//메서드명  start
	//1. 날씨정보 초기화- init
	//2. 날씨정보 추가 - addWeather
	//3. 전체날씨정보  - view 
	//4. 지역날씨검색 - findWeather, view
	//5. 프로그램종료 
	
	//+전화번호부 만들기
	private HashMap<String, Weather> map;
	private Scanner sc;
	private WeatherService ws; //null
	private WeatherView wv;
	
	public WeatherMenu() {
		map = new HashMap<String, Weather>();
		
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
			System.out.println("5.날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1: 
				map= ws.init();
				wv.view(map);
				break;
			case 2:
				ws.addweather(map);
				break;
			case 3:
				wv.view(map);
				break;
			case 4:
				Weather weather = ws.findweather(map);
				if(weather != null) {
				wv.view(weather);
				}else {
					wv.view("해당 지역의 정보가 없습니다.");
				}
				break;
			case 5:
				weather = ws.deleteWeather(map);
				if(weather !=null) {
					wv.view("삭제 성공");
				}else {
					wv.view("삭제 실패");
				}
				
				break;
			default:
				check = false;
				
			}
			
			
		}
		
	}
}
