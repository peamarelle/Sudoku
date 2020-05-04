package sudokuTest;

import desarrollo.Celda;
import desarrollo.Fila;
import desarrollo.NumeroInvalido;

public class PruebaSudoku {

	private void cuandoIngresoUnNumeroNegativoLanzaUnaExcepcion() {

		Celda celda = new Celda();

		try {

			celda.colocarNumero(-1);

		} catch (NumeroInvalido e) {
			System.out.println("La prueba paso: se ingreso un numero negativo y arrojo una excepcion");
			return;
		}

		System.out.println("La prueba fallo: al ingresar un numero negativo no arrojo una excepcion");
	}

	private void cuandoIngresoUnCeroLanzaUnaExcepcion() {

		Celda celda = new Celda();

		try {

			celda.colocarNumero(0);

		} catch (NumeroInvalido e) {
			System.out.println("La prueba paso: se ingreso un numero negativo y arrojo una excepcion");
			return;
		}

		System.out.println("La prueba fallo: al ingresar un numero negativo no arrojo una excepcion");
	}
	
	private void contieneDevuelveTrueSiElNumeroEstaEnLaFila() {
		
		Celda[] array = new Celda[9];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = new Celda();
		}
		
		array[0].colocarNumero(1);
		array[3].colocarNumero(2);
		array[4].colocarNumero(7);
		
		Fila fila = new Fila(1);
		
		fila.insertarCeldas(array);
		
		if(fila.contiene(1)) {
			
			System.out.println("La prueba pasó: el metodo contiene devolvio true cuando el numero estaba en la fila");
		}
		else
			System.out.println("La prueba NO pasó: el metodo contiene devolvio false cuando el numero estaba en la fila");
	}

	public static void main(String[] args) {

		new PruebaSudoku().cuandoIngresoUnNumeroNegativoLanzaUnaExcepcion();

		new PruebaSudoku().cuandoIngresoUnCeroLanzaUnaExcepcion();
		
		new PruebaSudoku().contieneDevuelveTrueSiElNumeroEstaEnLaFila();
	}
}
