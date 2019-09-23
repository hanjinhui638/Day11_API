package com.jh.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest4 {

	public static void main(String[] args) {
		//닭다리쿠션(40%), 최신핸드폰(10%), 은갈치넥타이(50%) 
		ArrayList<String> ar = new ArrayList<String>();
		//ar.add("닭다리쿠션"); *4
		//ar.add("최신핸드폰"); *1
		//ar.add("은갈치넥타이");*6
		//int num = radom.nextInt(ar.size());
		//System.out.println(ar.get(num));
		
		Random random = new Random();
		
		int a = random.nextInt(10);
		
		if(a<1) {
			System.out.println("최신 핸드폰");
		}else if(a<5) {
			System.out.println("닭다리 쿠션");
		}else
			System.out.println("은갈치넥타이");
		
	}

}
