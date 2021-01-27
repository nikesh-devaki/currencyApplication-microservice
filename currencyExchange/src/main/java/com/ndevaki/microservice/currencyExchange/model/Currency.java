package com.ndevaki.microservice.currencyExchange.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Currency {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name="currencyFrom")
	private String from;
	@Column(name="currencyTo")
	private String to;
	private BigDecimal conversion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public BigDecimal getConversion() {
		return conversion;
	}
	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}
	public Currency() {
		super();
	}
	
	
}
