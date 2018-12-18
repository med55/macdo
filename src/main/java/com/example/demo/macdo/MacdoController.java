package com.example.demo.macdo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MacdoController {

	@Autowired
	private MacdoService service;


	@RequestMapping(value = "/course/{id}", method = RequestMethod.GET)
	Macdo findById(@PathVariable("id") Double pCodeEtat) {
		return service.findByCodeEtat(pCodeEtat);
	}

}
