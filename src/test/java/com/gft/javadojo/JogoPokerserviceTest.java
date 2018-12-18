package com.gft.javadojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gft.javadojo.poker.JokenpoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JogoPokerserviceTest {

	@Autowired
	private JokenpoService jokenpoService;
	
	@Test
	public void test_getJogadorComMelhorMao() {
		boolean retorno = jokenpoService.jogar();

		assertEquals(retorno, true);
	}

}

