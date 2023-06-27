package com.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
		//switch 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 
		//에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 알려드립니다.");
//		System.out.print("1 ~ 4번중 골라주세요.(1. 에스프에소, 2. 카푸치노, 3. 카페라떼, 4. 아메리카노) : ");
//		int mNum = sc.nextInt();
//		
//		switch (mNum) {
//		case 1: System.out.println("에스프레소는 3500원 입니다.");
//		break;
//		case 2: System.out.println("카푸치노는 3500원 입니다.");
//		break;
//		case 3: System.out.println("카페라떼는 3500원 입니다.");
//		break;
//		case 4: System.out.println("아메리카노는 2000원 입니다.");
//		break;
//		default : System.out.println("1 ~ 4번을 선택해주세요");
//		break;
//		}
		
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노");
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		int price = 0;
		switch(menu) {
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼" : price = 3500; break;
		case "아메리카노" : price = 2000; break;
		}
		System.out.println(price + "원 입니다.");
	}
}
