package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego21 partida = new Juego21();
		
		partida.agregarJugador(new Jugador("Brayan"));
		partida.agregarJugador(new Jugador("Julio"));
		partida.agregarJugador(new Jugador("Martín"));
		
		partida.inicializar();
		partida.repartirRonda();
		partida.repartirRonda();
		
		for(Jugador jugador : partida.getJugadores()) {
			jugador.imprimir();
			System.out.println("-------------------");
		}
		
		partida.getDealer().imprimirNaipe();
		System.out.println("-------------------");

	}

}
