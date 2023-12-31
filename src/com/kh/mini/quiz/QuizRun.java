package com.kh.mini.quiz;

import java.util.Random;
import java.util.Scanner;

public class QuizRun {

	public static void main(String[] args) {
		QuizFunction quizFunc = new QuizFunction();
		finish: while (true) {
			int language = quizFunc.printLanguageMenu();
			switch (language) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			}

			int category = quizFunc.printCategoryMenu();
			switch (category) {
			case 1:
				if (language == 1) {
					quizFunc.htmlChioceQuiz();
				} else if (language == 2) {
					quizFunc.oracleChioceQuiz();
				} else {
					quizFunc.javaChioceQuiz();
				}
				break;
			case 2:
				if (language == 1) {
					quizFunc.htmlYNQuiz();
				} else if (language == 2) {
					quizFunc.oracleYNQuiz();
				} else {
					quizFunc.javaYNQuiz();
				}
				break;
			case 3:
				System.out.println("이전 페이지로 갑니다.");
				break;
			}
		}

	}

}
