package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		// 별찍기
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
