package com.srk.model;

public class User 
{
	private int user_id;
	private String user_name;
	private String email;
	private String phone_no;
	private String password;
	private String adress;
	public User()
	{
		
	}
	public User(int user_id, String user_name, String email, String phone_no, String password, String adress) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.phone_no = phone_no;
		this.password = password;
		this.adress = adress;
	}
	public User(String user_name, String email, String phone_no, String password, String adress) {
		super();
		this.user_name = user_name;
		this.email = email;
		this.phone_no = phone_no;
		this.password = password;
		this.adress = adress;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdress() {
		return adress;
	}
	public void setddress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", email=" + email + ", phone_no=" + phone_no
				+ ", password=" + password + ", adress=" + adress + "]";
	}
	

}
