package com.kh.mini.quiz;

import java.util.Scanner;

public class QuizRun {

	public static void main(String[] args) {
		Quiz[] QuizArr = new Quiz[5];
		finish: while (true) {
			int language = printMenu();
			int category = printMenu();
			switch (language) {
			case 1:
				inputScore(QuizArr);
				break;
			case 2:
				printScore(QuizArr);
				break;
			case 3:
				checkPass(QuizArr);
				break;
			case 4:
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			}
		}

//

//
//		문제화면
//		======= KH 퀴즈 !!! =======
//		(문제)
//		정답을 입력해주세요 (맞으면 1, 틀리면 2) :  (ex> 2 -> enter)
//		맞았습니다! / 틀렸습니다!
//		======= KH 퀴즈 !!! =======
//		(문제)
//		정답을 입력해주세요 (맞으면 1, 틀리면 2) :  (ex> 2 -> enter)
//		맞았습니다! / 틀렸습니다!
//		======= KH 퀴즈 !!! =======
//		(문제)
//		정답을 입력해주세요 (맞으면 1, 틀리면 2) :  (ex> 2 -> enter)
//		맞았습니다! / 틀렸습니다!
//		======= KH 퀴즈 !!! =======
//		(문제)
//		정답을 입력해주세요 (맞으면 1, 틀리면 2) :  (ex> 2 -> enter)
//		맞았습니다! / 틀렸습니다!
//		======= KH 퀴즈 !!! =======
//		(문제)
//		정답을 입력해주세요 (맞으면 1, 틀리면 2) :  (ex> 2 -> enter)
//		맞았습니다! / 틀렸습니다!

	}

	private static int printMenu() {
//		메인화면
//		======= KH 퀴즈 !!! =======
//		1. HTML, CSS, JAVASCRIPT
//		2. Oracle
//		3. Java
//		4. EXIT
//		원하는 퀴즈를 선택해주세요 : (ex> 3 -> enter)
		
//		문제유형 화면
//		======= KH 퀴즈 !!! =======
//		1. 4지선다
//		2. O/X
//		3. 이전화면으로…
//		원하는 문제형식을 선택해주세요 : (ex> 2 -> enter)
		Scanner sc = new Scanner(System.in);
		System.out.println("======= KH 퀴즈 !!! =======");
		System.out.println();
		System.out.println("1. HTML, CSS, JAVASCRIPT");
		System.out.println("2. Oracle");
		System.out.println("3. Java");
		System.out.println("4. 프로그램 종료");
		System.out.print("원하는 퀴즈를 선택해주세요 : ");
		int language= sc.nextInt();
		
		
		System.out.println("======= KH 퀴즈 !!! =======");
		System.out.println();
		System.out.println("1. 4지선다");
		System.out.println("2. O/X");
		System.out.println("3. 이전화면으로…");
		System.out.print("원하는 문제형식을 선택해주세요 : ");
		int category= sc.nextInt();
		return category;
	}

	private static void inputScore(Quiz[] quizArr) {
		// TODO Auto-generated method stub

	}

	private static void printScore(Quiz[] quizArr) {
		// TODO Auto-generated method stub

	}

	private static void checkPass(Quiz[] quizArr) {
		// TODO Auto-generated method stub

	}

}
