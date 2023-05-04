package com.demo.errorResponce;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorApi {
	
	private int statusCode;
	private String massege;
	private HttpStatus statusMsg;
	private Date date;
	private String url;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMassege() {
		return massege;
	}
	public void setMassege(String massege) {
		this.massege = massege;
	}
	public HttpStatus getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(HttpStatus statusMsg) {
		this.statusMsg = statusMsg;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ErrorApi() {
		
	}
	public ErrorApi(int statusCode, String massege, HttpStatus statusMsg, Date date, String url) {
		this.statusCode = statusCode;
		this.massege = massege;
		this.statusMsg = statusMsg;
		this.date = date;
		this.url = url;
	}
	
	
	
	

}
