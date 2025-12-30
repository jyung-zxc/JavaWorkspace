package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vp.Shape;

public class TriangleController {
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		double area = (height * width)/2;
		return area;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		System.out.println("삼각형 "+s.inforamtion());
		return "삼각형 "+s.inforamtion();
	}
}
