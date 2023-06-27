package com.kh.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// 동전 앞뒤 맞추기!!
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		틀렸습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		틀렸습니다.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====== 동전 앞 뒤 맞추기 =======");
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
			int input = sc.nextInt();
			int rNum = rand.nextInt(2) + 1;
			
			// 1, 2이외의 값 입력시
			if(input < 1 || input > 2) {
				System.out.println("1 또는 2를 입력해주세요.");
				continue;
			}
			
			if(rNum == input) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			
		}
	}

}
