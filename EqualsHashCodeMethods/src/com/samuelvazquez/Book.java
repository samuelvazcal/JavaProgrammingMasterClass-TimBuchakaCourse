package com.samuelvazquez;

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
