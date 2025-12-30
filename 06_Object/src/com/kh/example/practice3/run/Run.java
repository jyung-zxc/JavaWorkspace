package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

		public static void main(String[] args) {
			Circle cir = new Circle();
			cir.getAreaOfCircle();// 원둘레 출력
			cir.getSizeOfCircle();// 원 넓이 출력
			
			cir.incrementRadius();
			
			cir.getAreaOfCircle();// 원둘레 출력
			cir.getSizeOfCircle();// 원 넓이 출력	
	}
}
