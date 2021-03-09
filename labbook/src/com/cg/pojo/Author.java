package com.cg.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AuthorDetails")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private int phoneNo;
	public Author() {
		
	}
	public Author(String firstName, String middleName, String lastName, int phoneNo) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String toString() {
		return this.authorId+"\t"+this.firstName+" "+this.middleName+" "+this.lastName+"\t"+this.phoneNo;
	}
}
