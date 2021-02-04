package com.samuelvazquez;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterMain {
	public static void main(String[] args) {
		WriteFile obj = new WriteFile();
		obj.write();
	}
}

class WriteFile{
	public void write() {
		FileWriter myWriter = null;
		String text = "The ultimate wizard in term of attack and defense";

		try{
			myWriter = new FileWriter("FileB.txt");
			for(int i=0;i<text.length();i++) {
				myWriter.write(text.charAt(i));
			}
			myWriter.close();
		} catch(IOException e) {
			System.out.println("File not found!");
		}
	}
}
