package desarrollo;

public class Aplicacion {

	Tablero sudoku;
	
	public Aplicacion() {
	
		sudoku = new Tablero();
	}
	
	public void iniciar() {
		
		sudoku.cargarTablero();
	}
}
