package com.ndevaki.microservice.currencyExchange.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ndevaki.microservice.currencyExchange.model.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency,Long>{
	
	@Query("select c from Currency c where ((c.currencyFrom=?1 and c.currencyTo=?2) or (c.currencyFrom=?2 and c.currencyFrom=?1))")
	public Currency findConversion(String from,String to);

}
