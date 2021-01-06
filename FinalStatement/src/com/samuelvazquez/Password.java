package com.samuelvazquez;

public class Password {
	public static final int key = 12345678;
	public final int encryptedPassword;

	public Password(int password) {
		this.encryptedPassword = encryptDecrypt(encryptedPassword);
	}

	private int encryptDecrypt(int password) {
		return password ^ key;
	}

	public void storePassword() {
		System.out.println("Saving password as" + this.encryptedPassword);
	}

	public boolean letMeIn(int password) {
		if(encryptDecrypt(password) == this.encryptedPassword) {
			System.out.println("Welcome");
			return true;
		} else {
			System.out.println("Nope, you cannot come in");
			return false;
		}
	}
}
