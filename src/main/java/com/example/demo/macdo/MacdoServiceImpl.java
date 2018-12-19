package com.example.demo.macdo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MacdoServiceImpl implements MacdoService {
	
	@Autowired
	private MacdoRepository serviceRepository;

	public MacdoServiceImpl() {
	}

	public MacdoServiceImpl(MacdoRepository serviceRepository) {
		super();
		this.serviceRepository = serviceRepository;
	}

	@Override
	public Macdo findByCodeEtat(Double pCodeEtat) {
		return serviceRepository.findByCodeEtat(pCodeEtat);
	}

	@Override
	public List<Macdo> findAll() {
		return serviceRepository.findAll();
	}
}
