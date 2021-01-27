package com.ndevaki.microservice.currencyExchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ndevaki.microservice.currencyExchange.service.ConversionService;
import com.ndevaki.microservice.currencyExchange.service.dto.Conversion;

@RestController("/exchange")
public class CurrencyExchangeController {

	@Autowired
	ConversionService conversionService;
	
	@GetMapping("currency/fromUnit/{from}/toUnit/{to}")
	public Conversion convert(@PathVariable("from")String fromUnit,@PathVariable("to")String toUnit) {
		return conversionService.getConversion(fromUnit, toUnit);
	}
}
