package com.kh.mini.quiz;

import java.util.Random;
import java.util.Scanner;

public class QuizFunction {

	private int[] answer;
	private int[] randQuestion; // 랜덤 5개 퀴즈 선택

	public QuizFunction() {
		randQuestion = new int[5];
		answer = new int[5];

	}

	public int printLanguageMenu() {
//		메인화면
//		======= KH 퀴즈 !!! =======
//		1. HTML, CSS, JAVASCRIPT
//		2. Oracle
//		3. Java
//		4. EXIT
//		원하는 퀴즈를 선택해주세요 : (ex> 3 -> enter)
		Scanner sc = new Scanner(System.in);
		System.out.println("======= KH 퀴즈 !!! =======");
		System.out.println("1. HTML, CSS, JAVASCRIPT");
		System.out.println("2. Oracle");
		System.out.println("3. Java");
		System.out.println("4. 프로그램 종료");
		System.out.print("원하는 퀴즈를 선택해주세요 : ");
		int language = sc.nextInt();
		return language;
	}

	public int printCategoryMenu() {
//		문제유형 화면
//		======= KH 퀴즈 !!! =======
//		1. 4지선다
//		2. O/X
//		3. 이전화면으로…
//		원하는 문제형식을 선택해주세요 : (ex> 2 -> enter)
		Scanner sc = new Scanner(System.in);
		System.out.println("======= KH 퀴즈 !!! =======");
		System.out.println("1. 4지선다");
		System.out.println("2. O/X");
		System.out.println("3. 이전화면으로…");
		System.out.print("원하는 문제형식을 선택해주세요 : ");
		int category = sc.nextInt();
		return category;
	}

	public void htmlChioceQuiz() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		Quiz quiz = new Quiz();
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20); // html 4지선다 랜덤문제 인덱스값 5개 받기(0~19)
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		// 정렬
		for (int i = 0; i < randQuestion.length; i++) {
			for (int j = 0; j < randQuestion.length - 1; j++) {
				if (randQuestion[j] > randQuestion[j + 1]) {
					int temp = randQuestion[j];
					randQuestion[j] = randQuestion[j + 1];
					randQuestion[j + 1] = temp;
				}
			}
		}
		// 배열출력
		for (int i = 0; i < randQuestion.length; i++) {
			System.out.println(quiz.quizArrs[randQuestion[i]]);
			System.out.print("정답을 입력하시오 : ");
			int answer = sc.nextInt();
		}
	}

	public void oracleChioceQuiz() {
		Random rand = new Random();
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 20; // oracle 4지선다 랜덤문제 인덱스값 5개 받기(20~39)
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		// 정렬
		for (int i = 0; i < randQuestion.length; i++) {
			for (int j = 0; j < randQuestion.length - 1; j++) {
				if (randQuestion[j] > randQuestion[j + 1]) {
					int temp = randQuestion[j];
					randQuestion[j] = randQuestion[j + 1];
					randQuestion[j + 1] = temp;
				}
			}
		}
	}

	public void javaChioceQuiz() {
		Random rand = new Random();
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 40; // java 4지선다 랜덤문제 인덱스값 5개 받기(40~59)
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		// 정렬
		for (int i = 0; i < randQuestion.length; i++) {
			for (int j = 0; j < randQuestion.length - 1; j++) {
				if (randQuestion[j] > randQuestion[j + 1]) {
					int temp = randQuestion[j];
					randQuestion[j] = randQuestion[j + 1];
					randQuestion[j + 1] = temp;
				}
			}
		}
	}

	public void htmlYNQuiz() {
		Random rand = new Random();
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 60; // oracle O/X 랜덤문제 인덱스값 5개 받기(60~79)
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		// 정렬
		for (int i = 0; i < randQuestion.length; i++) {
			for (int j = 0; j < randQuestion.length - 1; j++) {
				if (randQuestion[j] > randQuestion[j + 1]) {
					int temp = randQuestion[j];
					randQuestion[j] = randQuestion[j + 1];
					randQuestion[j + 1] = temp;
				}
			}
		}
	}

	public void oracleYNQuiz() {
		Random rand = new Random();
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 80; // oracle O/X 랜덤문제 인덱스값 5개 받기(80~99)
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		// 정렬
		for (int i = 0; i < randQuestion.length; i++) {
			for (int j = 0; j < randQuestion.length - 1; j++) {
				if (randQuestion[j] > randQuestion[j + 1]) {
					int temp = randQuestion[j];
					randQuestion[j] = randQuestion[j + 1];
					randQuestion[j + 1] = temp;
				}
			}
		}
	}

	public void javaYNQuiz() {
		Random rand = new Random();
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 100; // oracle O/X 랜덤문제 인덱스값 5개 받기(100~119)
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		// 정렬
		for (int i = 0; i < randQuestion.length; i++) {
			for (int j = 0; j < randQuestion.length - 1; j++) {
				if (randQuestion[j] > randQuestion[j + 1]) {
					int temp = randQuestion[j];
					randQuestion[j] = randQuestion[j + 1];
					randQuestion[j + 1] = temp;
				}
			}
		}
	}

}
