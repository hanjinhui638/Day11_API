package com.jh.collection.ex3;

public class WeatherService {

	private StringBuffer sb;
	
	public WeatherService() {
		sb =new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		//파싱tokenizer -> 날씨 정보 객체로 
		
	}
	//메서드명 init 
	//날씨 정보를 파싱해서 저장. 
	
	//메서드명 addweather 
	//날씨 정보를 입력받아서 추가 
	
	//메서드명 findweather
	//도시명을 입력받아서 해당 weather 검색 
	
}
