package com.example.demo.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Client_id")
	private int id;
	
	@Column(name="Client_firstname")
	private String firstname;
	@Column(name="Client_lastname")
	private String lastname;
	@Column(name="Client_checkin")
	private String checkin;
	@Column(name="Client_checkout")
	private String checkout;
	@Column(name="Client_people")
	private String people;
	@Column(name="Client_totalprice")
	private String totalprice;
	
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
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	
}
