package com.samuelvazquez;

import java.io.IOException;
import java.nio.file.*;


public class Main {
	public static void main(String[] args) {
		DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
			public boolean accept(Path path) throws IOException {
				return (Files.isRegularFile(path));
			}
		};
		Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2");
		//globbing is done to filename by the shell, regex is used for searching text
		try(DirectoryStream<Path> contents = Files.newDirectoryStream(directory, "*.dat")) {
			for(Path file: contents) {
				System.out.println(file.getFileName());
			}
		}catch(IOException | DirectoryIteratorException e) {
			System.out.println(e.getMessage());
		}

	}
}
