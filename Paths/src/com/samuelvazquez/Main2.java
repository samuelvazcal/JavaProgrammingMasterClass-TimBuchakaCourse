package com.samuelvazquez;

import java.io.IOException;
import java.nio.file.*;


public class Main2 {
	public static void main(String[] args) {
		try {
			//creating a file
//			Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
//			Files.createFile(fileToCreate);
			//creating a folder
//			Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//			Files.createDirectory(dirToCreate);
//			Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//			Files.createDirectories(dirToCreate);
//			Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//			Files.createDirectories(dirToCreate);
			Path filePath = FileSystems.getDefault().getPath("Examples\\Dir1\\file1.txt");
			long size = Files.size(filePath);
			System.out.println("Size = " + size);
			System.out.println("Last modified" + Files.getLastModifiedTime(filePath));
			//delete a file
//			Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//			Files.delete(fileToDelete);
			//move a file
//			Path fileToMove = FileSystems.getDefault().getPath("Examples","file.txt");
//			Path destination = FileSystems.getDefault().getPath("Examples","file2.txt");
//			Files.move(fileToMove,destination);

//			Path fileToMove = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//			Path destination = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//			Files.move(fileToMove,destination);

//			Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//			Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//			Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//			sourceFile = FileSystems.getDefault().getPath("Examples","Dir1");
//			copyFile = FileSystems.getDefault().getPath("Examples","Dir4");
//			Files.copy(sourceFile,copyFile,StandardCopyOption.REPLACE_EXISTING);
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
