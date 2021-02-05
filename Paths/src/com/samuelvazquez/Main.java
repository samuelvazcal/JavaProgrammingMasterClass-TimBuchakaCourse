package com.samuelvazquez;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;


public class Main {
	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
		printFile(path);
		//Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
		Path filePath = Paths.get(".", "files","SubdirectoryFile.txt");
		printFile(filePath);
		filePath = Paths.get("C:\\Users\\Samuel_Vazquez\\Desktop\\OutThere.txt");
		printFile(filePath);

		filePath = Paths.get(".");
		System.out.println(filePath.toAbsolutePath());
		Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
		printFile(path2.normalize().toAbsolutePath());
		printFile(path2.normalize());

		Path path3 = FileSystems.getDefault().getPath("thisfiledoesnexist.txt");
		System.out.println(path3.toAbsolutePath());
		Path path4 = Paths.get("\\Volume\\Test\\ING","ABCDE","whatever.txt");
		System.out.println(path4.toAbsolutePath());
		filePath = FileSystems.getDefault().getPath("files");
		System.out.println("Exist = " + Files.exists(filePath));

		System.out.println("Exists = " + Files.exists(path4));


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
