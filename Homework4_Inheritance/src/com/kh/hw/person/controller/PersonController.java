package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
//		각 객체배열에 저장된 객체의 수를
//		정수배열에 담아 반환하는 메소드
		int M = 0;
		int N = 0;

		int[] result = new int[2];

		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				M++;
			}
		}
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				N++;
			}
		}

		result[0] = (M);
		result[1] = (N);

		return result;

	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student std = new Student(name, age, height, weight, grade, major);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = std;
				break;
			}
		}
		// 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
	}

	public Student[] printStudent() {
		// 학생 객체 배열의 주소를 반환하는메소드
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
//		개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
		Employee emp = new Employee(name, age, height, weight, salary, dept);
		for(int i=0;i<e.length;i++) {
			if(e[i] == null) {
				e[i] = emp;
				break;
			}
		}
	}

	public Employee[] printEmployee() {
//		사원 객체 배열의 주소를 반환하는매소드
		return e;
	}
}
