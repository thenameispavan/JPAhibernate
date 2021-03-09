package com.cg.book;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.cg.author.Author;
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int isbn;
	private String title;
	private double price;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Author> author;
	public Book() {
		
	}
	
	

	public Book(String title, double price, List<Author> author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}



	public List<Author> getAuthor() {
		return author;
	}



	public void setAuthor(List<Author> author) {
		this.author = author;
	}



	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return this.isbn+"\t"+this.title+"\t"+this.price;
	}
	
 
 
}
