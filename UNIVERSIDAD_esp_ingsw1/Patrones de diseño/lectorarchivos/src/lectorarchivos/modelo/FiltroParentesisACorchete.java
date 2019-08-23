package lectorarchivos.modelo;

public class FiltroParentesisACorchete extends FiltroLectura {

	public FiltroParentesisACorchete(Lector lector) {
		super(lector);
	}
	
	@Override
	public int leer() throws LecturaException {
		int c = lector.leer();
		return filtrar(c);
	}

	@Override
	public int filtrar(int c) {
		if( c == '(') {
			return '[';
		} else if ( c == ')') {
			return ']';
		}
		return c;
	}

}
