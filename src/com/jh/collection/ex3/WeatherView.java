package com.jh.collection.ex3;

import java.util.ArrayList;

public class WeatherView {

	//메서드명 view
	//날씨전체정보출력
	
	//메서드명 view
	//날씨하나 정보출력
	
	public void view(Weather weather) {
		System.out.println("도시 : "+weather.getCity());
		System.out.println("기온 : "+weather.getGion());
		System.out.println("습도 : "+weather.getHumidity());
		System.out.println("상태 : "+weather.getStatus());
		
	}
	public void view(ArrayList<Weather> weathers) {
		for(int i =0; i<weathers.size();i++) {
			System.out.println("도시 : "+weathers.get(i).getCity());
			System.out.println("기온 : "+weathers.get(i).getGion());
			System.out.println("습도 : "+weathers.get(i).getHumidity());
			System.out.println("상태 : "+weathers.get(i).getStatus());
		}
	}
		
	//}
}
