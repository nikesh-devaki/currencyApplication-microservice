package com.ndevaki.microservice.currencyConverter.service;

import org.springframework.stereotype.Service;

import com.ndevaki.microservice.currencyConverter.bean.Result;

@Service
public class CurrencyService {

	private static final float factor=0.5f;
	
	public Result convert(String from,String to,int unit) {
		return new Result(from,to,unit*factor);
	}
	
}
