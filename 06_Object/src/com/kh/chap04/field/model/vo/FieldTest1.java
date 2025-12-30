package com.kh.chap04.field.model.vo;

public class FieldTest1 {
	private int global;{
		//초기화 블럭
	}
	public static int num;
	
	static {
		// static 변수를 초기화 하는데 사용한다.
		num=55;
	}
}
