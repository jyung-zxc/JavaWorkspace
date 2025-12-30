package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vp.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimether(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		double peri = (width * 2) + (height * 2);
		return peri;
	}
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		double area = height * width;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		System.out.println("사각형 "+s.inforamtion());
		return "사각형 "+s.inforamtion();
		
	}
}
