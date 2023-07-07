package com.kh.mini.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuizFunction {

	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	Quiz2 quiz2 = new Quiz2();
	
	private List<Quiz2> qList;
	private int[] answer;
//	private List<Quiz2> userAnswer;
	private int[] randQuestion; // 랜덤 5개 퀴즈 선택
//	private List<randQuestion> randQ;

	public QuizFunction() {
		qList = new ArrayList<Quiz2>();
		// html 4지선다 문제
		qList.add(new Quiz2("4지선다 html문제1", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제2", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제3", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제4", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제5", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제6", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제7", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제8", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제9", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제10", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제11", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제12", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제13", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제14", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제15", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제16", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제17", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제18", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제19", "1.a 2.b 3.c 4.d", 1));
		qList.add(new Quiz2("4지선다 html문제20", "1.a 2.b 3.c 4.d", 1));
		// oracle 4지선다 문제
		qList.add(new Quiz2("4지선다 oracle문제1", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제2", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제3", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제4", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제5", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제6", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제7", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제8", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제9", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제10", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제11", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제12", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제13", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제14", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제15", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제16", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제17", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제18", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제19", "1.a 2.b 3.c 4.d", 2));
		qList.add(new Quiz2("4지선다 oracle문제20", "1.a 2.b 3.c 4.d", 2));
		// java 4지선다 문제
		qList.add(new Quiz2("4지선다 java문제1", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제2", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제3", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제4", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제5", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제6", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제7", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제8", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제9", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제10", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제11", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제12", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제13", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제14", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제15", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제16", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제17", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제18", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제19", "1.a 2.b 3.c 4.d", 3));
		qList.add(new Quiz2("4지선다 java문제20", "1.a 2.b 3.c 4.d", 3));
		// html OX 문제
		qList.add(new Quiz2("OX html문제1", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제2", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제3", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제4", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제5", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제6", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제7", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제8", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제9", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제10", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제11", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제12", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제13", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제14", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제15", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제16", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제17", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제18", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제19", "1.O 2.X", 1));
		qList.add(new Quiz2("OX html문제20", "1.O 2.X", 1));
		// oracle OX 문제
		qList.add(new Quiz2("OX oracle문제1", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제2", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제3", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제4", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제5", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제6", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제7", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제8", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제9", "1.O 2.X", 1));
		qList.add(new Quiz2("OX oracle문제10", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제11", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제12", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제13", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제14", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제15", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제16", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제17", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제18", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제19", "1.O 2.X", 2));
		qList.add(new Quiz2("OX oracle문제20", "1.O 2.X", 2));
		// java OX 문제
		qList.add(new Quiz2("OX java문제1", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제2", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제3", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제4", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제5", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제6", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제7", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제8", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제9", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제10", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제11", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제12", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제13", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제14", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제15", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제16", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제17", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제18", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제19", "1.O 2.X", 2));
		qList.add(new Quiz2("OX java문제20", "1.O 2.X", 2));

		randQuestion = new int[5];
		answer = new int[5];

	}

//	public void inputQuiz() {
//		String quizContent = "";
//		Quiz2 quiz2 = new Quiz2();
//		quiz2.setQuizContent(quizContent);
//	}

	public int printLanguageMenu() {
		System.out.println("======= KH 퀴즈 !!! =======");
		System.out.println("1. HTML, CSS, JAVASCRIPT");
		System.out.println("2. Oracle");
		System.out.println("3. Java");
		System.out.println("4. 프로그램 종료");
		System.out.print("원하는 퀴즈를 선택해주세요 : ");
		int language = sc.nextInt();
		System.out.println();
		return language;
	}

	public int printCategoryMenu() {
		System.out.println("======= KH 퀴즈 !!! =======");
		System.out.println("1. 4지선다");
		System.out.println("2. O/X");
		System.out.println("3. 이전화면으로…");
		System.out.print("원하는 문제형식을 선택해주세요 : ");
		int category = sc.nextInt();
		System.out.println();
		return category;
	}

// html 4지선다
	public void htmlChioceQuiz() {
		// html 4지선다 랜덤문제 인덱스값 5개 받기(0~19)
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20); 
			// 중복제거
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		sort();
		gamePlay();
	}

// oralce 4지선다
	public void oracleChioceQuiz() {
		// oracle 4지선다 랜덤문제 인덱스값 5개 받기(20~39)
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 20; 
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		sort();
		gamePlay();
	}

// java 4지선다
	public void javaChioceQuiz() {
		// java 4지선다 랜덤문제 인덱스값 5개 받기(40~59)
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 40; 
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		sort();
		gamePlay();
	}

// html OX
	public void htmlYNQuiz() {
		// oracle O/X 랜덤문제 인덱스값 5개 받기(60~79)
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 60; 
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		sort();
		gamePlay();
	}

// oracle OX
	public void oracleYNQuiz() {
		// oracle O/X 랜덤문제 인덱스값 5개 받기(80~99)
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 80; 
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		sort();
		gamePlay();
	}

// java OX
	public void javaYNQuiz() {
		// oracle O/X 랜덤문제 인덱스값 5개 받기(100~119)
		for (int i = 0; i < randQuestion.length; i++) {
			randQuestion[i] = rand.nextInt(20) + 100; 
			for (int j = 0; j < i; j++) {
				if (randQuestion[j] == randQuestion[i]) {
					i--;
					break;
				}
			}
		}
		sort();
		gamePlay();
	}

	// 정렬
	public void sort() {
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

	// 배열출력
	public void gamePlay() {
		for (int i = 0; i < randQuestion.length; i++) {
			Quiz2 quizList = qList.get(randQuestion[i]);
			System.out.printf("%d번. %s\n", i + 1, quizList.getQuizContent());
			System.out.printf("%s\n", quizList.getChoiceArrs());
			System.out.print("정답을 입력하시오 : ");
			answer[i] = sc.nextInt();
			if (quizList.getAnswerSheet() == answer[i]) {
				System.out.println("정답입니다!");
				System.out.println();
			} else {
				System.out.println("틀렸습니다...");
				System.out.printf("정답은 %d번 입니다.\n", quizList.getAnswerSheet());
				System.out.println();
			}
		}
		System.out.println("메인화면으로 돌아갑니다.");
		System.out.println();
	}

}
