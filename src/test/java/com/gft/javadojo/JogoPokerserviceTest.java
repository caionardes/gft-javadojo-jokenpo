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
	public void JogadaPedraTesoura() {
		ObjetoDaJogada jogadorA = ObjetoDaJogada.Pedra;
		ObjetoDaJogada jogadorB = ObjetoDaJogada.Tesoura;
		
		Jogador retorno = jokenpoService.jogar(jogadorA, jogadorB);

		assertEquals(Jogador.JogadorA,retorno );
	}
	
	@Test
	public void JogadaPedraPapel() {
		ObjetoDaJogada jogadorA = ObjetoDaJogada.Pedra;
		ObjetoDaJogada jogadorB = ObjetoDaJogada.Papel;
		
		Jogador retorno = jokenpoService.jogar(jogadorA, jogadorB);

		assertEquals(Jogador.JogadorB,retorno );
	}
	
	@Test
	public void JogadaPapelTesoura() {
		ObjetoDaJogada jogadorA = ObjetoDaJogada.Papel;
		ObjetoDaJogada jogadorB = ObjetoDaJogada.Tesoura;
		
		Jogador retorno = jokenpoService.jogar(jogadorA, jogadorB);

		assertEquals(Jogador.JogadorB,retorno );
	}

	@Test
	public void JogadaPapelPedra() {
		ObjetoDaJogada jogadorA = ObjetoDaJogada.Papel;
		ObjetoDaJogada jogadorB = ObjetoDaJogada.Pedra;
		
		Jogador retorno = jokenpoService.jogar(jogadorA, jogadorB);

		assertEquals(Jogador.JogadorA,retorno );
	}
	
	@Test
	public void Empate() {
		
		Jogador ganhador = jokenpoService.jogar(ObjetoDaJogada.Papel, ObjetoDaJogada.Pedra);
		
		assertEquals(Jogador.JogadorA, ganhador);		
	}

}

