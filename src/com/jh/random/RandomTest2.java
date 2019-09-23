package com.jh.random;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		
		//로또 번호 출력 
		//1~45 
		
		Random random = new Random();
		
		for(int i = 0; i<6;i++) {
			int num = random.nextInt();
			num = random.nextInt(45)+1;
			
			
			//if(num ==0 ) {
			//	i --;
			//	continue;
			//}
			System.out.println(num);
		}

	}

}
