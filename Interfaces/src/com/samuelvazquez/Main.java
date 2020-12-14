package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		ITelephone samsPhone = new DeskPhone(1234567);

		samsPhone.powerOn();
		samsPhone.callPhone(1234567);
		samsPhone.answer();

		samsPhone = new MobilePhone(7654321);
		samsPhone.powerOn();
		samsPhone.callPhone(7654321);
		samsPhone.answer();
	}
}
