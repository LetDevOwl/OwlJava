package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 단어를 입력해주세요. : ");
		// 문자열에서 첫번째 인덱스값을 자르니까 문자가 됨
		char word = sc.next().charAt(0);
		
		boolean result = (word >= 65) && (word <= 90);
//		boolean result = (word >= 'A') && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
	}
}
