package com.kh.hw.employee.controller;

import java.util.Set;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();
	
//	public EmployeeController() {
//		
//	}
	
	public void add(int empNo, String name, char gender, String Phone){
		// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
		e = new Employee(empNo, name, gender, Phone);
	}
	
	public void add(int empNo, String name, char gender, String Phone, String dept, int salary, double bonus){
		// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
		e = new Employee(empNo, name, gender, Phone, dept, salary, bonus);
	}
	
	public void modify(String phone) {
		// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setPhone(phone);
	}
	
	public void modify(int salary) {
		// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		// 받아온 매개변수를 이용하여 해당 정보 수정
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		// 객체 e에 null을 저장하여 객체 삭제
		Employee delete = e; //기존 주소값 봇가
		
		e = null; // 삭제처리
		
		return delete; //삭제된 주소값 반환
	}
	
	public String inform() {
		// 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환
		if(e == null) return null;
		
		return e.printEmployee();
	}
}
