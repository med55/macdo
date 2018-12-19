package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.macdo.Macdo;
import com.example.demo.macdo.MacdoRepository;
import com.example.demo.macdo.MacdoService;
import com.example.demo.macdo.MacdoServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MacdoServiceImplTest {

	// Using annotation
	@Mock
	MacdoRepository dataServiceMock;

	@InjectMocks
	MacdoServiceImpl businessImpl;

	@Test
	public void findTheGreatestFromAllDatatest1() {
		when(dataServiceMock.findByCodeEtat(anyDouble())).thenReturn(new Macdo(10.10, 5.5, "nom", "adresse"));
		Macdo result = businessImpl.findByCodeEtat(10.0);

		assertNotNull(result);
		assertEquals(result.getCodeEtat(), Double.valueOf(10.10));
		assertEquals(result.getNumber(), Double.valueOf(5.5));
		assertEquals(result.getNom(), "nom");
		assertEquals(result.getAdresse(), "adresse");
	}

	// Without annotation
	@Test
	public void findTheGreatestFromAllDatatest2() {
		MacdoRepository dataService = mock(MacdoRepository.class);
		MacdoService service = new MacdoServiceImpl(dataService);

		when(dataService.findByCodeEtat(anyDouble())).thenReturn(new Macdo(10.10, 5.5, "nom", "adresse"));
		Macdo result = service.findByCodeEtat(10.0);
		assertNotNull(result);
		assertEquals(result.getCodeEtat(), Double.valueOf(10.10));
		assertEquals(result.getNumber(), Double.valueOf(5.5));
		assertEquals(result.getNom(), "nom");
		assertEquals(result.getAdresse(), "adresse");
	}
}
