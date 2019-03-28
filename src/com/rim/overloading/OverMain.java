package com.rim.overloading;

public class OverMain {

	public static void main(String[] args) {
		Cal cal = new Cal();
		CalView cv = new CalView();
		
		int hap = cal.plus(10, 20);
		cv.viewInt(hap);
		
		float fhap = cal.plus(10, 20.2f);
		cv.vieFloat(fhap);
		
		float ffhap = cal.plus(10.3f, 20.2f);
		cv.vieFloat(ffhap);

	}

}
