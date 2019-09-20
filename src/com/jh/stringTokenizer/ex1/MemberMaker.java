package com.jh.stringTokenizer.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberMaker {
	
	private String memberInfo;
	
	public MemberMaker() {
		this.memberInfo="iu-iu-27-choa-choa-28-suji-suji-30";//->stringTokenizer
		String str2 = "samsung,lg,apple,google"; //->split
	}
	
	public void makerMeber() {
		//member Info의 내용을 파싱해서 
		//Member 객체를 생성해서 
		//모든 정보를 출력 
		//String [] info = memberInfo.split("-");
		
		//for(int i=0; i<info.length;i++) {
		//	Member member =new Member();
		//	member.setId(info[i]);
		//	member.setName(info[++i]);
		// }
		
		
		StringTokenizer st = new StringTokenizer(this.memberInfo, "-");
		ArrayList<Member> ar = new ArrayList<Member>();
		
		//int index =0;
		
		while(st.hasMoreTokens()) {
			Member member =new Member();
			member.setId(st.nextToken());
			member.setName(st.nextToken());
			member.setAge(Integer.parseInt(st.nextToken()));
			//members[index]=member;
			ar.add(member);
			//index ++;			
		}
		
		for(int i =0; i<ar.size();i++) {
			System.out.println("Id : "+ar.get(i).getId());
			System.out.println("Name : "+ar.get(i).getName());
			System.out.println("Age: "+ar.get(i).getAge());
		}
	}

}
