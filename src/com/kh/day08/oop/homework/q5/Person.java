package com.kh.day08.oop.homework.q5;

public class Person {
	String name;
	int money;
	
	public Person() {}
	public Person(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	public void buyCoffe(Cafe caffe, int money) {
		// 돈을 가지고 카피가 나와야함.
		this.money -= money;
		caffe.makeCoffee(money);
	}
	public void printInof() {
		System.out.println(this.name + "님의 잔액은 " + this.money+ "원 입니다.");
	}
}
