package com.samuelvazquez;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferMain {
	public static void main(String[] args) {
		Buffer obj = new Buffer();
		obj.buffer();
	}
}

class Buffer {
	public void buffer(){
		FileReader inputFile = null;
		try {
			inputFile = new FileReader("FileC.txt");
			BufferedReader myBuffer = new BufferedReader(inputFile);
			String line = "";
			while(line!=null) {
				line = myBuffer.readLine();
				if(line!=null){
					System.out.println(line);
				}
			}
		} catch(IOException e) {
			System.out.println("File not found!");
		} finally{
			try{
				inputFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
