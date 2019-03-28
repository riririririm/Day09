package com.rim.mod2;

public class StaticTest {

	public int num = 10;
	public static int num2 = 20;
	
	public void instanceMethod() {
		System.out.println("멤버메서드");
		StaticTest.staticMethod();
	}
	
	
	public static void staticMethod() {
		System.out.println("클래스 메서드");
		
		//this.instanceMethod();
		//System.out.println(this.num);
		//static메서드 내에서는 멤버변수, 멤버메서드 사용 불가
		//그 클래스가 만들어질지 안만들어질지 모르는 불확실한 상태이기 때문
		System.out.println(StaticTest.num2);
	}
}
