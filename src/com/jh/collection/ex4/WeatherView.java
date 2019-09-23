package com.jh.collection.ex4;


import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {

	//메서드명 view
	//날씨전체정보출력
	
	//메서드명 view
	//날씨하나 정보출력
	
	public void view(String str) {
		System.out.println(str);
	}
	
	public void view(Weather weather) {
		System.out.println("도시 : "+weather.getCity());
		System.out.println("기온 : "+weather.getGion());
		System.out.println("습도 : "+weather.getHumidity());
		System.out.println("상태 : "+weather.getStatus());
		
	}
	
	public void view(HashMap<String, Weather> map) {
		//1단계
		//키들을 모을 Iterator 생성
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			Weather weather = map.get(k);
			
			System.out.println("도시 : "+weather.getCity()); 
			System.out.println("기온 : "+weather.getGion());
			System.out.println("습도 : "+weather.getHumidity());
			System.out.println("상태 : "+weather.getStatus());
		}
	}
		
	//}
}
