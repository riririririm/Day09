package com.rim.mobile;

public class MobileMain {

	public static void main(String[] args) {
		PhoneView pv = new PhoneView();
		
		
		Phone p1 = new Phone();
		Phone p2 = new Phone(200);
		Phone p3 = new Phone(200, "Black");
		Phone p4 = new Phone(200, "Green", 20);
		
		pv.view(p1);
		System.out.println();
		pv.view(p2);
		System.out.println();
		pv.view(p3);
		System.out.println();
		pv.view(p4);
		
		
		Pad pad = new Pad("apple",200);
		
		
		System.out.println();

	}

}
