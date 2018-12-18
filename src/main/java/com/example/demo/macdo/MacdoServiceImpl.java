package com.example.demo.macdo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class MacdoServiceImpl implements MacdoService {

	@Override
	public Macdo findByCodeEtat(Double pCodeEtat) {
		List<Macdo> listMacdo = fromCsv();
		
		return listMacdo.stream().filter(m -> m.getCodeEtat() == pCodeEtat).findFirst().get();
	}

	private List<Macdo> fromCsv() {
		File file = new File("mcdonalds.csv");
		List<Macdo> lListMacdo = new ArrayList<>();
		Scanner inputStream;

		try {
			inputStream = new Scanner(file);

			while (inputStream.hasNext()) {
				String line = inputStream.next();
				String[] values = line.split(",");
				lListMacdo.add(new Macdo(Double.valueOf(values[0]), Double.valueOf(values[1]), values[2], values[3]));
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return lListMacdo;
	}
}
