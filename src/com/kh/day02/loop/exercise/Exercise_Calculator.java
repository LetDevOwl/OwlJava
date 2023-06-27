package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		// 계산기
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(;;) {
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char mark = sc.next().charAt(0);
			switch(mark) {
			case '+' : System.out.println(num1 + " " + mark + " " + num2 + " = " + (num1 + num2) );
			break;
			case '-' : System.out.println(num1 + " " + mark + " " + num2 + " = " + (num1 - num2) );
			break;
			case '*' : System.out.println(num1 + " " + mark + " " + num2 + " = " + (num1 * num2) );
			break;
			case '/' : System.out.println(num1 + " " + mark + " " + num2 + " = " + (num1 / num2) );
			break;
			case '%' : System.out.println(num1 + " " + mark + " " + num2 + " = " + (num1 % num2) );
			break;
			}
			count++;
			if(count == 3) break;
		}
	}

}
