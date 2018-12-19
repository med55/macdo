package com.example.demo.macdo;

import java.util.List;

public interface MacdoRepository {

	/**
	 * @return
	 */
	List<Macdo> findAll();
	/**
	 * @param pCodeEtat
	 * @return
	 */
	Macdo findByCodeEtat(Double pCodeEtat);
}
