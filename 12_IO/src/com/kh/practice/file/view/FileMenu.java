package com.kh.practice.file.view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****\n" 
							+ "1. 노트 새로 만들기\n" 
							+ "2. 노트 열기\n" 
							+ "3. 노트 열어서 수정하기\n" 
							+ "9. 끝내기\n");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

/*					if(!isFileExist) {
//	fc.fileSave(fname, str);
//	return;
//}
//
//System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
//char ch = sc.nextLine().toUpperCase().charAt(0);
//
//if(ch == 'Y') {
//	fc.fileSave(fname, str);
//	return;
//}else {
//	continue;
//}
break;*/
	
	public void fileSave() {
		StringBuilder str = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요. \n"
							   +"ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String text = sc.nextLine();
			
			if(text.equals("ex끝it")) {
				break;
			}
			str.append(text+"\n"); // 내가 입력한 값을 StringBuilder에 기록
		}
				while(true) {
					System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
					String fname = sc.nextLine();
					
					boolean isFileExist = fc.checkName(fname);
					
					if(isFileExist) {
						// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
						// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
						System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
						char ch = sc.nextLine().toUpperCase().charAt(0);
					
						if(ch == 'Y') {
							// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
							fc.fileSave(fname, str);
							return;
						}else {
							// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
							continue;
						}
					}else {
						// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
						// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
						fc.fileSave(fname, str);
					return;
			}
		}
	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String fname = sc.nextLine();
		
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		boolean exists = fc.checkName(fname);

		if(!exists) {
			System.out.println("없는 파일일니다.");
			return;
//			throw new RuntimeException("존재하지 않는 파일입니다.");
		}
		System.out.println(fc.fileOpen(fname));
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
			// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
	}
	

	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String fname = sc.next();
		
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		boolean exists = fc.checkName(fname);
		
		if(!exists) {
			// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
			System.out.println("없는 파일입니다.");
			return;
		} 
			StringBuilder sb = addText();
			fc.fileEdit(fname, sb);
			// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
			// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달
		}
	

	private StringBuilder addText() {
		StringBuilder str = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요. \n"
							   +"ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String text = sc.nextLine();
			
			if(text.equals("ex끝it")) {
				break;
			}
			str.append(text+"\n");
		}
		return str;
	}
}
