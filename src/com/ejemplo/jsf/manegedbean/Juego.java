package com.ejemplo.jsf.manegedbean;

import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="juego")
public class Juego {

	private int numero1;
	private int numero2;
	private int numero3;
	private int contador = 10;

	public String intento() {
		Random aleatorio = new Random();

		numero1 = aleatorio.nextInt(3) + 1;
		numero2 = aleatorio.nextInt(3) + 1;
		numero3 = aleatorio.nextInt(3) + 1;

		while (contador <= 10) {
			if (numero1 != numero2 && numero2 != numero3 && numero3 != numero1) {
				contador--;
			}
		}
		return "ganador";
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
