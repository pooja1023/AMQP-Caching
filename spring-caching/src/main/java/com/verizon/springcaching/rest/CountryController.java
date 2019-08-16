package com.verizon.springcaching.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.springcaching.model.country;
import com.verizon.springcaching.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {
@Autowired
private CountryService cs;
@RequestMapping
public  List <country> getCountries(){
	return cs.getCountries();
}
@RequestMapping(method=RequestMethod.POST)
public boolean addCountry(country c) {
	return cs.addCountry(c);
}
}
