package com.jh.test;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {
	private Machine machine;
	private Scanner sc;
	
	public Menu() {
		machine = new Machine();
		sc = new Scanner(System.in);
	}

	
	public void select() {
		//Cola cola	= machine.makeCola();
		//Cider cider = machine.makeCider();
		
		//boolean check = true;
		
	
			System.out.println("1. cola");
			System.out.println("2. cider");
			System.out.println("3. water");
			System.out.println("4. 종료 ");
			int select = sc.nextInt();
			Drink drink = null;
			
			if(select == 1){
				drink = machine.makeCola();
			}else if(select ==2){
				drink = machine.makeCider("Sprite", 2000, Calendar.getInstance());
			}else if(select ==3){
				drink = machine.makeWater();
				
			}else{
			
			}
			
			System.out.println(drink.getBrand());
		
		
		
	}
}
