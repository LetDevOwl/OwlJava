package com.kh.day17.oop.motal.run;

import java.util.Scanner;

import com.kh.day17.oop.motal.controller.MotalController;
import com.kh.day17.oop.motal.view.MotalView;

public class MotelRun {
	public static void main(String[] args) throws Exception {
		MotalView view = new MotalView();
		MotalController controller = new MotalController();
		Scanner sc = new Scanner(System.in);

		end: while (true) {
			int choice = view.printMenu();
			int chosenRoom = 0;
			switch (choice) {
			case 1:
				chosenRoom = view.inputRoomNumber("입실");
				controller.checkIn(chosenRoom);
				Thread.sleep(500);
				break;
			case 2:
				chosenRoom = view.inputRoomNumber("퇴실");
				controller.checkOut(chosenRoom);
				Thread.sleep(500);
				break;
			case 3:
				controller.printAllRooms();
				Thread.sleep(2000);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}
}
