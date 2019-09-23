package com.jh.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;



public class ProductMain {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer computer = new Computer();
		NoteBook noteBook = new NoteBook();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		//Computer와 Computer를 상속 받은 타입. 
		
		
		//<Generic>
	
		//ArrayList<Product> ar = new ArrayList<Product>();
		//ar.add(t);
		//ar.add(computer);
		
		ArrayList<Product> ar2 = new ArrayList<Product>();
		
		//ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>();
		
		HashMap<String, ArrayList<Product>> map = new HashMap<String, ArrayList<Product>>();
		
		
 	}

}
