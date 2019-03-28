package com.rim.mobile;

public class Phone {

	String brand;
	int price;
	String color;
	int size;
	
	public Phone() {
		//디폴트 생성자(기본생성자/빈 생성자)
		//클래스 내에 생성자가 하나도 없으면 
		//컴파일러가 디폴트 생성자를 자동생성
		this.brand="LG";
		this.price=100;
		this.size=15;
		this.color="RED";
		
	}
	
	public Phone(int price) {
		this.brand="LG";
		this.price=price;
		this.size=15;
		this.color="RED";
		
	}
	
	public Phone(int price, String color) {
		this.brand="LG";
		this.price=price;
		this.size=15;
		this.color=color;
		
	}
	
	public Phone(int price, String color, int size) {
		this.brand="LG";
		this.price=price;
		this.size=size;
		this.color=color;
		
	}
	public void info() {
		System.out.println("~~~~phone~~~~");
	}
	
}
