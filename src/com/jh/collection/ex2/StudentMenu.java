package com.jh.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	private ArrayList<Student> students;
	private StudentService ss;
	private StudentView sv;
	private Scanner sc;
	
	public StudentMenu() {
		students = new ArrayList<Student>();
		ss = new StudentService();
		sv = new StudentView();
		sc = new Scanner(System.in);
	}

	public void start() {
		
		//1. 학생정보등록
		//2. 학생전체정보
		//3. 학생정보조회 - 이름으로 검색 
		//4. 학생정보삭제 
		//5. 프로그램종료 
		//StudentView sv = new StudentView();
		//StudentService ss = new StudentService();
		//Scanner sc = new Scanner(System.in);
		boolean check =true;
		Student student = null;
		
		while(check) {
			System.out.println("1.학생정보등록");
			System.out.println("2.학생전체정보");
			System.out.println("3.학생정보조회");
			System.out.println("4.학생정보삭제");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				ss.studentInput(students);
				break;
			case 2:
				sv.view(students);
				break;
			case 3:
				 student = ss.studentSearch(students);
				sv.view(student);
				break;
			case 4:
				student = ss.studentSearch(students);
				ss.StudentDelete(students, student);
				break;
			default:
				check = false;
			
			}
			//if(){
			//		student st;
			//		}else {
			//			student st;
			//		}
			
		}
		
	}
}
