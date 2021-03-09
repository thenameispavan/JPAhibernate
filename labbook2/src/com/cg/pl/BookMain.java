package com.cg.pl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.author.Author;
import com.cg.book.Book;

public class BookMain {

	public static void main(String[] args) {
		EntityManagerFactory eFactory=Persistence.createEntityManagerFactory("labbook2");
		EntityManager eManager=eFactory.createEntityManager();
		EntityTransaction eTx= eManager.getTransaction();
		
		eTx.begin();
		List<Author> a=new ArrayList<Author>();
		a.add(new Author("Ambani"));
		a.add(new Author("irani"));
		a.add(new Author("mukharjee"));
		a.add(new Author("adani"));
		Book b=new Book("thesis",2500,a);
		eManager.persist(b);
		eTx.commit();
	}

}
