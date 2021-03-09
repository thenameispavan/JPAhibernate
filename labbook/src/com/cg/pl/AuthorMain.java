package com.cg.pl;

import java.util.Scanner;

import com.cg.pojo.Author;
import com.cg.service.AuthorService;
import com.cg.service.AuthorServiceImpl;

public class AuthorMain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		AuthorService aService=new AuthorServiceImpl();
		String enter="yes";
		while(enter.equalsIgnoreCase(enter)) {
			int i=s.nextInt();
			switch(i) {
			case 1:
				System.out.println("enter first name");
				String fname=s.next();
				System.out.println("enter middle name");
				String mname=s.next();
				System.out.println("enter first name");
				String lname=s.next();
				System.out.println("enter phone number");
				int phnum=s.nextInt();
				System.out.println(aService.insertAuthor(new Author(fname,lname,mname,phnum)));
				break;
			case 2:
				System.out.println("enter author id: ");
				int aid=s.nextInt();
				System.out.println("enter new name:");
				String f_name=s.next();
				System.out.println(aService.updateAuthor(aid, f_name));
				break;
			case 3:
				System.out.println("enter author id to be deleted");
				int author_id=s.nextInt();
				System.out.println(aService.removeAuthor(author_id));
				break;
			case 4:
				System.out.println("enter author id to find");
				int authorid=s.nextInt();
				System.out.println(aService.findAuthor(authorid));
			default:
				System.out.println("invalid option");
				
			}
			System.out.println("do you want to continue?");
			i=s.nextInt();
		}
		s.close();
	}

}
