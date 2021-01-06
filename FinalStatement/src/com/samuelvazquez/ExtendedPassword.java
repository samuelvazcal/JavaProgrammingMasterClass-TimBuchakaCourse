package com.samuelvazquez;

public class ExtendedPassword extends Password{
	private int decryptedPassword;

	public ExtendedPassword(int password) {
		super(password);
		this.decryptedPassword = password;
	}

//	@Override
//	//with the last update in Password class (final declaration), now isn't possible to override storePassword
//	public void storePassword() {
//		System.out.println("Saving password as " + this.decryptedPassword);
//	}
}
