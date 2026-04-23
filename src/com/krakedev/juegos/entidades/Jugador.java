package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();;
	
	public Jugador(String nickname) {
		super();
		this.nickname = nickname;
	}

	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	}
	
	public void imprimir() {
		System.out.println("Nickname: "+ nickname);
		for(Carta carta : cartas) {
			carta.imprimir();
		}
	}
	
}
