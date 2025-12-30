package com.kh.example.practice3.model.vo;

public class Circle {
	private static final double PI = 3.14;
	private static int radius = 1;
	
	//기본생성자
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		//원둘레
		System.out.println(2*radius*PI);
	}
	
	public void getSizeOfCircle() {
		//원넓이
		System.out.println(radius*radius*PI);
	}
	
}
