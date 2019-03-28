package com.rim.mod;

public class MemberMain {
	public static void main(String[] args) {
		Member m = new Member("ji",20,57,160);
		m.check();
		
		m.weight=47;
		m.check();
	}
	

}
