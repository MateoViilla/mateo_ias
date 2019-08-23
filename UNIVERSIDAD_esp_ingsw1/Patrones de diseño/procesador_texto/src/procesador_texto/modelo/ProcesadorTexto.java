package procesador_texto.modelo;

public class ProcesadorTexto {
	private Documento documento;
	
	public ProcesadorTexto() {
		documento = new Documento();
	}
	
	public void agregarCaracterADocumento(Caracter caracter) {
		documento.agregarCaracter(caracter);
	}
}
