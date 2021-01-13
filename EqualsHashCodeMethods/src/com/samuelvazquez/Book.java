package com.samuelvazquez;

import java.util.Objects;


public class Book {
	private String title;
	private String author;
	private int ISBN;

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}

	//That's why I need to overwrite the equals method and adapt it to my Book class
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			  Book tempBook = ((Book) obj);

			  //Now we can compare the ISBN attribute between the current object and the object that passed as parameter.
			  if(this.ISBN==tempBook.ISBN) {
			  	return true;
			  } else {
			  	return false;
			  }
		}
		//And eventually now we have an equals method that works perfectly for our class and future purposes
		return false;
	}
	 */

	//Now using the IntelliJ tool, I can create automatically both methods choosing ISBN as main attribute
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Book book = (Book) o;
		return ISBN == book.ISBN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return ISBN;
	}

}
