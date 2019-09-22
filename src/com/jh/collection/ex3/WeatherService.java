package com.jh.collection.ex3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	private StringBuffer sb;
	private String str;
	private Scanner sc;
	public WeatherService() {
		sb =new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		//파싱tokenizer -> 날씨 정보 객체로 
		str = sb.toString();	
		sc = new Scanner(System.in);
	}
	//메서드명 init 
	//날씨 정보를 파싱해서 저장. 
	public void init() {
		StringTokenizer st = new StringTokenizer(this.str, "-");
		ArrayList<Weather> ar = new ArrayList<Weather>();
		
		while(st.hasMoreTokens()) {
			Weather weather =new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			ar.add(weather);
		}
	}
	
	//메서드명 addweather 
	//날씨 정보를 입력받아서 추가 
	public void addweather(ArrayList<Weather> weathers) {
		Weather weather = new Weather();
		System.out.println("도시를 입력하세요");
		weather.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weather.setGion(sc.nextDouble());
		System.out.println("습도를 입력하세요");
		weather.setHumidity(sc.nextInt());
		System.out.println("상태를 입력하세요");
		weather.setStatus(sc.next());
		weathers.add(weather);
	}
	
	//메서드명 findweather
	//도시명을 입력받아서 해당 weather 검색 
	public Weather findweather(ArrayList<Weather> weathers) {
		System.out.println("도시명을 입력하세요");
		String name = sc.next();
		Weather weather = null;
		int i =0; 
		for(i = 0;i<weathers.size();i++) {
			if(weathers.get(i).getCity().equals(name)) {
				weather = weathers.get(i);
				break;
			}
		}
		
		return weather;

	}
	
}
