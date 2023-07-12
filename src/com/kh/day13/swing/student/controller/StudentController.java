package com.kh.day13.swing.student.controller;

import java.util.List;

import com.kh.day13.swing.student.model.vo.Student;

public class StudentController {
	List<Student> stdList;
	
	public void addStudent(Student stdOne) {
		stdList.add(stdOne);
	}
}
