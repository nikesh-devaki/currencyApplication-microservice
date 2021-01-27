package com.ndevaki.microservice.currencyExchange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndevaki.microservice.currencyExchange.model.Currency;
import com.ndevaki.microservice.currencyExchange.service.dao.CurrencyRepository;
import com.ndevaki.microservice.currencyExchange.service.dto.Conversion;

@Service
public class ConversionService {

	@Autowired
	CurrencyRepository currencyRepository;
	
	public Conversion getConversion(String fromUnit,String toUnit) {
		Currency currency= currencyRepository.findConversion(fromUnit,toUnit);
		if(currency==null) {
			throw new IllegalArgumentException("Conversion not available for {fromUnit} - {toUnit} ");
		}
		return new Conversion(currency,fromUnit,toUnit);
	}
}
