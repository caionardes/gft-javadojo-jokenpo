package com.gft.javadojo.poker;

import org.springframework.stereotype.Service;

import com.gft.javadojo.Jogador;
import com.gft.javadojo.ObjetoDaJogada;

@Service
public class JokenpoService {

	public Jogador jogar(ObjetoDaJogada jogadorA, ObjetoDaJogada jogadorB) {
		// if (jogadorA.equals(ObjetoDaJogada.Pedra)
		// && jogadorB.equals(ObjetoDaJogada.Tesoura)) {
		// return "jogadorA";
		// }else if(jogadorA.equals(ObjetoDaJogada.Pedra) &&
		// jogadorB.equals(ObjetoDaJogada.Papel)) {
		// return "jogadorB";
		// }else if(jogadorA.equals(ObjetoDaJogada.Papel) &&
		// jogadorB.equals(ObjetoDaJogada.Tesoura)) {
		// return "jogadorB";
		// }else if(jogadorA.equals(ObjetoDaJogada.Papel) &&
		// jogadorB.equals(ObjetoDaJogada.Pedra)) {
		// return "jogadorA";
		// }

		switch (jogadorA) {
		case Pedra:
			return jogadorB.equals(ObjetoDaJogada.Tesoura) ? Jogador.JogadorA : Jogador.JogadorB;
		case Tesoura:
			return jogadorB.equals(ObjetoDaJogada.Papel) ? Jogador.JogadorA : Jogador.JogadorB;
		case Papel:
			return jogadorB.equals(ObjetoDaJogada.Tesoura) ? Jogador.JogadorA : Jogador.JogadorB;
		default:
			return null;
		}
	}

}
