package com.verizon.springcaching.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.verizon.springcaching.model.country;

@Service
public class CountryService {
List<country>countries=new ArrayList<>();
@Cacheable("countries")
public List<country> getCountries(){
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return countries;
	
}
@CachePut(value="countries")
public boolean addCountry(country c) {
	c.setId(countries.size()+1);
	countries.add(c);
	return true;
}
}
