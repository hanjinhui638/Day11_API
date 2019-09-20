package com.jh.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
	private Scanner sc;
	
	public StudentService() {
		sc = new Scanner(System.in);
	}
	
	//studentDelete
	//이름을 입력해서 해당학생정보를 삭제 
	public void StudentDelete(ArrayList<Student> students) {
		System.out.println("삭제할 학생 이름을 입력");
		String name = sc.next();
		
		
		for(int i=0;i<students.size();i++) {
			
			if(students.get(i).getName().equals(name)) {
				students.remove(i);
				break;
			}else {
				System.out.println("해당학생이 없습니다.");
			}
		}
	}
	
	//메서드명 studentSearch
	//학생의 이름을 입력 받아서, 이름이 같은 학생을 리턴 못 찾으면 

	public Student studentSearch(ArrayList<Student> students) {
		System.out.println("검색할 학생 이름을 입력 ");
		String name = sc.next();
		Student student = null;
		int i =0; 
		for(i = 0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				student = students.get(i);
				break;
			}
		}
		
		return student;

	}


	//메서드명은 studentInput
	//학생의 정보 입력 

	public void studentInput(ArrayList<Student> students) {
		sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("이름을 입력하세요");
		student.setName(sc.next());
		System.out.println("번호를 입력하세요");
		student.setNum(sc.nextInt());
		System.out.println("국어점수를 입력");
		student.setKor(sc.nextInt());
		System.out.println("수학점수를 입력");
		student.setMath(sc.nextInt());
		System.out.println("영어점수를 입력");
		student.setEng(sc.nextInt());
		student.setSum(student.getKor()+student.getEng()+student.getMath());
		student.setAvg(student.getSum()/3.0);
		students.add(student);

	}
}
