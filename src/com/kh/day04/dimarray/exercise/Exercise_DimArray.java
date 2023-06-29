package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise2() {
		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() {
		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs.length - 1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise4() {
		int arrs[][] = new int[5][5];
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k;
					k++;
				}
			} else {
				for (int j = arrs.length - 1; j >= 0; j--) {
					arrs[i][j] = k;
					k++;
				}
			}
		}
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평균의 출력하라.
		// (3.3 3.4) (3.5 3.6) (3.7 4.0) (4.1 4.2)
		double arrs[][] = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum = 0;
		// 출력
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				sum += arrs[i][j];
			}
		}
		int frontLength = arrs.length;
		int backLength = arrs[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %.2f\n", result);
	}
}
