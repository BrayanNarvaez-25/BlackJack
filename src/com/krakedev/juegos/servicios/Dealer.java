package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	private ArrayList<Carta> naipe;
	
	
	public Dealer() {
		super();
		this.naipe = new ArrayList<>();
		generarNaipe();
	}

	public void generarNaipe() {
		
		ArrayList<String> palos = new ArrayList<>();
		palos.add("T");
		palos.add("CN");
		palos.add("CR");
		palos.add("D");
		
		for(String palo : palos) {
			naipe.add(new Carta("A",palo));
			naipe.add(new Carta("J",palo));
			naipe.add(new Carta("Q",palo));
			naipe.add(new Carta("K",palo));
			for(int i = 2;i <= 10;i++) {
				naipe.add(new Carta(i+ "",palo));
			}
		}
	}
	
	public void imprimirNaipe() {
		for(Carta carta: naipe) {
			carta.imprimir();
		}
	}
	
	// En la clase Dealer
	public int generarAleatorio(int maximo) {
		double aleatorio=Math.random()*(maximo+1);
		return (int)aleatorio;
	}
}
