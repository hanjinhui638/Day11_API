package com.jh.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {

		//로또 번호 출력 
		//1~45 

		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<Integer>();

		for(int i=0; i<6;i++) {
			int num = random.nextInt(45)+1; 
			ar.add(num);

			for(int j=0;j<i;j++) {
				if(ar.get(j) == num) {
					i--;
					ar.remove(j);
					break;
				}
			}
		}
		//if(num ==0 ) {
		//	i --;
		//	continue;
		//}	
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}	

}


