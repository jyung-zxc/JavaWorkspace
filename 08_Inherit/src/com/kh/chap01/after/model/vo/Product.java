package com.kh.chap01.after.model.vo;

/*
 * 세 클래스 모두 공톡적으로 가지고 있는 요소들을 정리해둘 클래스
 */

public class Product {
	protected String brand;
	protected String pCode;
	protected String pName;
	protected int price;
	
	public Product() {
		
	}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	//alt+shift+s
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price;
	}

}
