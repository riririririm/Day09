package com.rim.mod;

public class Member {

	String name;
	int age;
	double weight;
	double height;
	
	public Member() {
		
	}
	public Member(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		
		System.out.println(this.name+" "+this.age+" "+this.weight+" "+this.height);
	}
	
	public void check() {
		//(키 -100)*0.95 : 표준몸무게
		double standard =(this.height-100)*0.95;
		System.out.println(standard);
		
		if(standard<this.weight) {
			System.out.println("과체중");
		}else if(standard>this.weight) {
			System.out.println("저체중");
		}else
			System.out.println("표준");
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
