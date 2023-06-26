package com.kh.day01.operator;

import java.util.Scanner;

public class Exam_Unary {

	public static void main(String[] args) {
		// 단항 연산자
//		int a = 1;
//		System.out.println(a++); // 후위연산(나중연산)
		// a가 2인 상태임
//		System.out.println(++a); // 전위연산(먼저연산)
		// a가 3인 상태
//		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("b 입력 : ");
		int b = sc.nextInt();
		
		System.out.print("c 입력 : ");
		int c = sc.nextInt();
		a++;
		b=(--a)+b;
		c=(a++) + (--b);
		System.out.print(a + ", ");
		System.out.print(b + ", ");
		System.out.print(c);

		boolean flag = true;
		boolean fResult = !!!!flag;
		System.out.println(fResult);
		
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
