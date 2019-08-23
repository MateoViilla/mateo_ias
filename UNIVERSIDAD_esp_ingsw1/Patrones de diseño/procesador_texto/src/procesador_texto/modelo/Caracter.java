package procesador_texto.modelo;

import java.awt.Color;

public class Caracter {
	
	private char representacion;
	private int tama�o;
	private String fuente;
	private Color color;
	
	public Caracter(char representacion) {
		this.representacion = representacion;
	}
	
	public Caracter(char representacion, String fuente, Color color, int tama�o) {
		this(representacion);
		this.fuente = fuente;
		this.color = color;
		this.tama�o = tama�o;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
