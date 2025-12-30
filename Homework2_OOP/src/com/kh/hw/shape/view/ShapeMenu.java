package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	// 멤버 변수
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		if (!(num == 3 || num == 4 || num == 9)) {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			inputMenu();
		}

		if (num == 3) {
			triangleMenu();
		}

		if (num == 4) {
			squareMenu();
		}

		if (num == 9) {
			System.out.println("프로그램 종료");
			return;
		}
	}

	public void triangleMenu() {

		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		if (!(num == 1 || num == 2 || num == 3 || num == 9)) {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			triangleMenu();
		}

		if (num == 1) {
			inputSize(3, num);
		}

		if (num == 2) {
			inputSize(3, num);
		}

		if (num == 3) {
			printinformation(3);
		}

		if (num == 9) {
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		}
	}

	public void squareMenu() {

		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		if (!(num == 1 || num == 2 || num == 3 || num == 4 || num == 9)) {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			squareMenu();
		}

		if (num == 1) {
			inputSize(4, num);
		}

		if (num == 2) {
			inputSize(4, num);
		}

		if (num == 3) {
			inputSize(4, num);
		}

		if (num == 4) {
			printinformation(4);
		}

		if (num == 9) {
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		}
	}

	public void inputSize(int type, int menuNum) {
		if (type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			double hei = sc.nextDouble();
			System.out.print("너비 : ");
			double wid = sc.nextDouble();
			System.out.println("삼각형 면적 : " + tc.calcArea(hei, wid));
		}

		if (type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}

		if (type == 4 && (menuNum == 1 || menuNum == 2)) {
			System.out.print("높이 : ");
			double hei = sc.nextDouble();
			System.out.print("너비 : ");
			double wid = sc.nextDouble();

			if (menuNum == 1) {
				System.out.println("사각형 둘레 : " + scr.calcPerimether(hei, wid));
			}

			if (menuNum == 2) {
				System.out.println("사각형 면적 : " + scr.calcArea(hei, wid));
			}
		}

		if (type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}

	}

	public void printinformation(int type) {
		if (type == 3) {
			tc.print();
		}
		if (type == 4) {
			scr.print();
		}

	}
}
