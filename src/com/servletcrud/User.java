package com.servletcrud;

public class User {
	private int id;
	private String uname,uemail,upassword,ucpassword,ugender,umobileno,uage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUmobileno() {
		return umobileno;
	}
	public void setUmobileno(String umobileno) {
		this.umobileno = umobileno;
	}
	public String getUage() {
		return uage;
	}
	public void setUage(String uage) {
		this.uage = uage;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUcpassword() {
		return ucpassword;
	}
	public void setUcpassword(String ucpassword) {
		this.ucpassword = ucpassword;
	}
	public String getUgender() {
		return ugender;
	}
	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

}
