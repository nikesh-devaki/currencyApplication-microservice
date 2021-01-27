package com.ndevaki.microservice.currencyExchange.service.dto;

import java.math.BigDecimal;

import com.ndevaki.microservice.currencyExchange.model.Currency;

public class Conversion {
	private Currency currency;
	private String from,to;
	private BigDecimal value;
	
	public Conversion(Currency currency,String from,String to) {
		this.currency=currency;
		this.from=from;
		this.to=to;
		if(!currency.getFrom().equals(from)) {
			this.value=currency.getConversion().divide(new BigDecimal(0.1));
		}else {
			this.value=currency.getConversion();
		}	
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
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

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}	
}
