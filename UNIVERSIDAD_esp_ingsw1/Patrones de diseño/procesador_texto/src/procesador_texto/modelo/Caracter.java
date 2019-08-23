package procesador_texto.modelo;

import java.awt.Color;

public class Caracter {
	
	private char representacion;
	private int tamaño;
	private String fuente;
	private Color color;
	
	public Caracter(char representacion) {
		this.representacion = representacion;
	}
	
	public Caracter(char representacion, String fuente, Color color, int tamaño) {
		this(representacion);
		this.fuente = fuente;
		this.color = color;
		this.tamaño = tamaño;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public char getRepresentacion() {
		return representacion;
	}
	
}
