package com.kh.day13.swing.student.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.swing.student.model.vo.Student;


public class StudentView {
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재평가 대상 여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public Student inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
//		stdList.add(std);
		return std;
	}

	public void displaySuccess(String message) {
		System.out.println(message);
	}

	public void showAllStudentList(List<Student> allList) {
		int count = 1;
		for(Student student : allList) {
			System.out.printf("이름 : %s, 첫번째 점수 : %d, 두번째 점수 : %d", count++, student.getName(), student.getScore1(), student.getScore2());
		}
	}
}
