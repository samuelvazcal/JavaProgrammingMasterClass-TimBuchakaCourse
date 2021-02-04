package com.samuelvazquez;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class StreamByteMain {
	public static void main(String[] args) {

		int count = 0;
		int[] dataBytesImage = new int[186688];

		try{
			FileInputStream readFile = new FileInputStream("testImage.jpg");
			boolean finalFile = false;

			while(!finalFile) {
				int byteIn = readFile.read();
				if(byteIn!=-1) {
					dataBytesImage[count] = byteIn;
				} else {
					finalFile = true;
				}
				System.out.println(dataBytesImage[count]);
				count++;
			}
			readFile.close();
		} catch (IOException e) {
			System.out.println("Error accesing to the image");
		}
		System.out.println(count);
		createFile(dataBytesImage);
	}

	static void createFile(int [] dataNewFile) {
		try{
			FileOutputStream newFile = new FileOutputStream("newTestImage.jpg");
			for(int i=0;i<dataNewFile.length;i++){
				newFile.write(dataNewFile[i]);
			}
			newFile.close();
		} catch(IOException e) {
			System.out.println("Error rebuilding the file!");
		}
	}
}
