package com.kh.day13.swing.student.run;

import java.util.List;

import com.kh.day13.swing.student.controller.StudentController;
import com.kh.day13.swing.student.model.vo.Student;
import com.kh.day13.swing.student.view.StudentView;

public class Run {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentController sController = new StudentController();
		
		int choice = 0;
		Student std = null;
		String name = "";
		
		do {
			choice = view.printMenu();
			switch (choice) {
			case 1 :
				std = view.inputInfo();
				sController.addStudent(std);
				view.displaySuccess("저장완료");
				break;
			case 2 :
				std = view.inputInfo();
				List<Student> searchList = sController.searchInfoByName(name);
				view.showAllStudentList(searchList);
				view.displaySuccess("검색완료");
			}
		} while(choice != 5);
	}
}
