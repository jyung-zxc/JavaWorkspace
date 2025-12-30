package Com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		String arr[][] = new String[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = "("+i+"," +j+")";
				System.out.print(arr[i][j]);
			}System.out.println();
		}
	}
	public void practice2() {
		int arr[][] = new int[4][4];
		
		int value = 1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	
	public void practice3() {
		int arr[][] = new int[4][4];
		
		int value = 16;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = value--;
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	
	public void practice4() {
		int arr[][] = new int[4][4];

		
		for(int i = 0;i<arr.length -1;i++) {
			for(int j = 0;j<arr[i].length -1;j++) {
				arr[i][j] = (int)(Math.random()*10 +1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j] * 2;
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int col = sc.nextInt();
		
		if (!(1 <= row && row <= 10 && 1 <= col && col <= 10)) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야합니다.");
			practice5();
			return;
		}
		
		char arr[][] = new char[row][col];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char)((int)(Math.random()* 26 + 65));
				System.out.print(arr[i][j]+ " ");
			}System.out.println();
		}
	}
}














