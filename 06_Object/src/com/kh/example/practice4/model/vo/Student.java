package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	static{
		grade = 3;
	}
	{
		classroom = 1;
		name = "홍길동";
		height = 1.82;
		gender = 'M';
	}
	
	public Student() {
		
	}
	
	public void information() {
		System.out.println(grade+", "+classroom+", "+name+", "+height+", "+ gender);
	}
}
