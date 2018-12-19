package com.example.demo.macdo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MacdoController {

	@Autowired
	private MacdoService service;


	@RequestMapping(value = "/macdo/{id}", method = RequestMethod.GET)
	Macdo findById(@PathVariable("id") Double pCodeEtat) {
		return service.findByCodeEtat(pCodeEtat);
	}
	@RequestMapping(value = "/macdo", method = RequestMethod.GET)
	List<Macdo> findById() {
		return service.findAll();
	}

}
