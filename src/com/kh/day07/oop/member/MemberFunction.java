package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	private Member[] memArr;
	private int index;
	
	public MemberFunction() {
		memArr = new Member[3];
		index = 0;
	}
	
	public int printMenu() {
		// 회원관리 프로그램
		// 1. 회원정보입력
		// 2. 회원정보출력
		// 3. 프로그램 종료
		// 메뉴 입력 :
		Scanner sc = new Scanner(System.in);
		System.out.println("회원관리프로그램");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3. 프로그램 종료");
		System.out.println("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원정보입력 ======");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
//		memArr[0] = new Member();
//		memArr[0].setMemberId(memberId);
//		memArr[0].setMemberPw(memberPw);
//		memArr[0].setMemberEmail(memberEmail);
//		memArr[0].setMemberAddress(memberAddress);
		memArr[index] = new Member(memberId, memberPw, memberEmail, memberAddress);
		index++;
	}
	
	public void printInfo() {
		System.out.println("====== 회원정보출력 ======");
		for(int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다."
					, memArr[i].getMemberId()
					, memArr[i].getMemberPw()
					, memArr[i].getMemberEmail()
					, memArr[i].getMemberAddress());
		}
	}
	
}
