package com.ndevaki.microservice.currencyConverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ndevaki.microservice.currencyConverter.bean.Result;
import com.ndevaki.microservice.currencyConverter.service.CurrencyService;

@RestController("currency/")
public class CurrencyConverterController {

	@Autowired
	CurrencyService currencyService;
	
	@GetMapping("convert/from/{from}/to/{to}/unit/{unit}")
	public Result convert(@PathVariable String from,@PathVariable String to,@PathVariable int units) {
	    return currencyService.convert(from,to,units);	
	}
	
}
