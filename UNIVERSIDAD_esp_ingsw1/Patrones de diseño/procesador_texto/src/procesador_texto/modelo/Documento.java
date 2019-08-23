package procesador_texto.modelo;

import java.util.ArrayList;
import java.util.List;

public class Documento {
	
	private List<Caracter> caracteres;
	
	public Documento() {
		caracteres = new ArrayList<Caracter>();
	}
	
	public void agregarCaracter(Caracter caracter) {
		caracteres.add(caracter);
	}
	
	public void borrarCaracter(int posicion) {
		caracteres.remove(posicion);
	}
	
}
