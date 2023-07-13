package com.kh.day13.swing.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day13.swing.student.model.vo.Student;

public class StudentController {
	List<Student> stdList;
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	// 학생 추가
	public void addStudent(Student stdOne) {
		stdList.add(stdOne);
	}
	// 학생 검색
	public List searchInfoByName(String name) {
		List<Student> findList = new ArrayList<Student>();
		for(Student sOne : stdList) {
			if(sOne.getName().equals(name)) {
				findList.add(sOne);
			}
		}
		return findList;
	}
	
}
