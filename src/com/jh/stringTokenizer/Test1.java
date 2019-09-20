package com.jh.stringTokenizer;


import java.util.*; //import java.*.*; -> x 


public class Test1 {

	public static void main(String[] args) {
		//파싱 
		String str = "iu,27,suji,24,choa,30,hani,25";
		
		//Member m = new Member();
		//com.jh.m2.Member m2 = new Member();
		
		StringTokenizer st =new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();//문자열 파싱
			String age = st.nextToken();
			System.out.println("이름:"+s);
			System.out.println("나이:"+age);
		}


	}

}
