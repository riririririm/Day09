package com.rim.mobile;

public class PhoneView {

	public void view(Phone phone) {
		System.out.println("브랜드: "+phone.brand);
		System.out.println("가격: "+phone.price);
		System.out.println("색상: "+phone.color);
		System.out.println("사이즈: "+phone.size);
	}
}
