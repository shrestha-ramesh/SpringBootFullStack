package com.example.demo.reviews;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Reviews_id")
	private int id;
	
	@Column(name="Reviews_firstname")
	private String firstname;
	@Column(name="Reviews_lastname")
	private String lastname;
	@Column(name="Reviews_email")
	private String email;
	@Column(name="Reviews_comment")
	private String comment;
	@Column(name="Reviews_gender")
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
