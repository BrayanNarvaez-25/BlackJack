package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private Dealer dealer;
	
	
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public void cargarValores() {
		for(Carta carta : dealer.getNaipe()) {
			if(carta.getValor().equals("A")) {
				carta.setValorJuego(11);
			}else if(carta.getValor().equals("J") || carta.getValor().equals("Q") || carta.getValor().equals("K")) {
				carta.setValorJuego(10);
			}else {
				carta.setValorJuego(Integer.parseInt(carta.getValor()));
			}
		}
	}
	
	public void inicializar() {
		dealer = new Dealer();
		cargarValores();
	}
	
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void repartirCarta(Jugador jugador) {
		Carta carta = dealer.entregarCarta();
		jugador.recibirCarta(carta);
	}
	
	public void repartirRonda() {
		for(Jugador jugador : jugadores) {
			repartirCarta(jugador);
		}
		calcularTotal();
	}
	
	public void calcularTotal() {
		for(Jugador jugador : jugadores) {
			int totalCartas = 0;
			for(Carta carta : jugador.getCartas()) {
				totalCartas += carta.getValorJuego();
			}
			jugador.setPuntajeCartas(totalCartas);
		}
	}
	
}
