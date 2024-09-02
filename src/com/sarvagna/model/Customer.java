package com.sarvagna.model;

public class Customer {
         
	
	   private int cusId;
	   
	   private String name;
	   
	   private String gender;
	   
	   
	   
	   public Customer() {
		// TODO Auto-generated constructor stub
	}



	public Customer(int cusId, String name, String gender) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.gender = gender;
	}



	public int getCusId() {
		return cusId;
	}



	public void setCusId(int cusId) {
		this.cusId = cusId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", name=" + name + ", gender=" + gender + "]";
	}
	   
	   
	   
}
