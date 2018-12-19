package com.example.demo.macdo;

import java.util.List;

public interface MacdoService {
	
	/**
	 * @param pCodeEtat
	 * @return
	 */
	Macdo findByCodeEtat(Double pCodeEtat);

	/**
	 * @return
	 */
	List<Macdo> findAll();

}
