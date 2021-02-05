package com.samuelvazquez;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;


public class Main {
	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
		printFile(path);
		Path filepath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
		printFile(filepath);
		filepath = Paths.get("C:\\Users\\Samuel_Vazquez\\Desktop\\OutThere.txt");
		printFile(filepath);
	}

	private static void printFile(Path path) {
		try(BufferedReader fileReader = Files.newBufferedReader(path)) {
			String line;
			while((line = fileReader.readLine())!=null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
