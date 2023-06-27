package com.kh.day02.loop.exercise;

public class Exercise_ForDouble3 {

	public static void main(String[] args) {
		System.out.println("0시 0분부터 23시 59분까지 출력하기!");
		for(int h = 0; h < 24; h++) {
			for(int m = 0; m < 60; m++) {
				System.out.printf("%2d시 %2d분\n", h, m);
//				System.out.println(h + "시	" + m + "분");
			}
		}
	}

}
