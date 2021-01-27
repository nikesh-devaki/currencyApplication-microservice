package com.ndevaki.microservice.currencyConverter.bean;

public class Result {

	private String from,to;
	private float value;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public Result(String from, String to, float value) {
		super();
		this.from = from;
		this.to = to;
		this.value = value;
	}
	private Result() {
		super();
	}
	
	
	
}
