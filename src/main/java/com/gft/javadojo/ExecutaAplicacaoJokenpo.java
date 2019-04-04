package com.gft.javadojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gft.javadojo.poker.JokenpoService;

/**
 * Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre três possíveis itens: Pedra, Papel ou Tesoura.
 * 
 * O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.
 * 
 * As regras são as seguintes:
 * 
 * Pedra empata com Pedra e ganha de Tesoura
 * Tesoura empata com Tesoura e ganha de Papel
 * Papel empata com Papel e ganha de Pedra
 * 
 */
@SpringBootApplication
public class ExecutaAplicacaoJokenpo {

	public static void main(String[] args) {
		SpringApplication.run(ExecutaAplicacaoJokenpo.class, args).close();
	}
	
	@Autowired
	private JokenpoService jokenpoService;

	@Bean
	public CommandLineRunner run() {
		return args -> {
			Jogador jogador = jokenpoService.jogar(ObjetoDaJogada.Papel, ObjetoDaJogada.Papel);
			System.out.println(jogador);
		};
	}
}

