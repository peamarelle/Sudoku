package desarrollo;

public class ColeccionCeldas {
	
	private int numero;
	
	private Celda[] celdas;
	
	public ColeccionCeldas(int numero) {
		
		this.numero = numero; 
	}

	public void insertarCeldas(Celda[] celdas) {
		
		this.celdas = celdas;
	}
	
	public boolean contiene(int numero) {
		
		for (int i = 0; i < celdas.length; i++) {
			
			if(celdas[i].contiene(numero))return true;
		}
		return false;
		
	}
	
	public Celda[] getCeldas() {
		
		return celdas;
	}
	
	public int getNumero() {
		
		return numero;
	}
}
