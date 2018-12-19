package com.example.demo.macdo;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Repository
public class MacdoRepositoryImpl implements MacdoRepository {
	
	private static List<Macdo> list;
	
	static {
		list = new ArrayList<>();
		try (Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/mcdonalds.csv"))) {
			ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
			strategy.setType(Macdo.class);
			CsvToBean<Macdo> csvToBean = new CsvToBeanBuilder(reader).withMappingStrategy(strategy)
					.withIgnoreLeadingWhiteSpace(true).build();

			Iterator<Macdo> MacdoIterator = csvToBean.iterator();
			while (MacdoIterator.hasNext()) {
				Macdo macdo = MacdoIterator.next();
				list.add(macdo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Macdo> findAll() {
		return list;
	}

	@Override
	public Macdo findByCodeEtat(Double pCodeEtat) {
		return list.stream().filter(m -> m.getCodeEtat().equals(pCodeEtat)).findFirst().get();
	}

}
