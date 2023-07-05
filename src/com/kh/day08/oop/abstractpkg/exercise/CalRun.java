package com.kh.day08.oop.abstractpkg.exercise;

public class CalRun {

	public static void main(String[] args) {
//		CalCulator calc = new Calculator();
		Calculator calc = new GoodCalc(); // 업캐스팅
		// 추상클래스는 객체 생성 안됨...
		// Cannot instantiate the type Calculator
		int [] a = {11,25,30,43,54};
		System.out.printf("평균 : %.2f", calc.average(a));

	}

}
