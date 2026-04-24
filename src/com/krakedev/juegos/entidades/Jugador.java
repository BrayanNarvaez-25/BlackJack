package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private int puntajeCartas;
	
	public Jugador(String nickname) {
		super();
		this.nickname = nickname;
	}

	public void recibirCarta(Carta carta) {
		cartas.add(carta);
	}
	
	
	public int getPuntajeCartas() {
		return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
		this.puntajeCartas = puntajeCartas;
	}
	

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public void imprimir() {
		System.out.println("Nickname: "+ nickname);
		for(Carta carta : cartas) {
			carta.imprimir();
		}
	}
	
}
