package com.jh.collection.ex2;

import java.util.ArrayList;

public class StudentView {

	//메서드명은 view
	//학생한명 출력 
	
	//메서드명은 view - students 필요 메서드 매게변수로 
	//학생들의 정보를 전부 출력 2. 학생전체정보 
	public void view(Student student) {
		System.out.println("이름 : "+student.getName());
		System.out.println("번호 : "+student.getNum());
		System.out.println("국어 : "+student.getKor());
		System.out.println("영어 : "+student.getEng());
		System.out.println("수학 : "+student.getMath());
		System.out.println("총합 : "+student.getSum());
		System.out.println("평균 : "+student.getAvg());
		
	}
	
	public void view(ArrayList<Student> students) {
		
		for(int i=0;i<students.size();i++) {
			System.out.println("이름 : "+students.get(i).getName());
			System.out.println("번호 : "+students.get(i).getNum());
			System.out.println("국어 : "+students.get(i).getKor());
			System.out.println("영어 : "+students.get(i).getEng() );
			System.out.println("수학 : "+students.get(i).getMath());
			System.out.println("총합 : "+students.get(i).getSum());
			System.out.println("평균 : "+students.get(i).getAvg());
			
		}
		
	}
	
	
}
