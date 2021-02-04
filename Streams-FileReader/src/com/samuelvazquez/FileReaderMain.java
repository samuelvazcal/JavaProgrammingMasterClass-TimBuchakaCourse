package com.samuelvazquez;

import java.io.FileReader;
import java.io.IOException;


public class FileReaderMain {
	public static void main(String[] args) {
		ReadFile obj = new ReadFile();
		obj.read();
	}
}

class ReadFile{
	public void read(){
		FileReader myReader = null;
		try{
			myReader = new FileReader("FileA.txt");
			int c;
			while((c=myReader.read())!=-1) {
				char parseValue = (char) c;
				System.out.print(parseValue);
			}
			myReader.close();
		} catch (IOException e) {
			System.out.println("File not found!");
		}
	}
}
