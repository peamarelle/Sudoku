package sudokuTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import desarrollo.Celda;
import desarrollo.Columna;
import desarrollo.Tablero;

public class TableroTest {

	Columna[] columnas;

	Celda[] celdas;
	
	Tablero tab;

	public void generarCeldas() {

		for (int i = 0; i < celdas.length; i++) {

			celdas[i] = new Celda();
		}
		
	}

	public void generarColumna() {

		for (int i = 0; i < columnas.length; i++) {

			columnas[i] = new Columna(i + 1);
		}
	}

	@Before

	public void setUp() {

		columnas = new Columna[9];

		celdas = new Celda[9];
		
		tab = new Tablero();

	}

	@Test

	public void alCrearLaColumnaUnoSeCreoComoEstanEnElTableroConElPrimerArchivo() {
		
		generarCeldas();
		
		generarColumna();

		celdas[0].colocarNumero(5);
		celdas[1].colocarNumero(6);
		celdas[3].colocarNumero(8);
		celdas[4].colocarNumero(4);
		celdas[5].colocarNumero(7);
		
		columnas[0].insertarCeldas(celdas);

		tab.cargarTablero();

		tab.celdas();

		tab.filas();
		
		tab.columnas();
		
		Assert.assertArrayEquals(columnas[0].getCeldas(), tab.getColumnas()[0].getCeldas());
	}
	
	@Test

	public void alCrearLaColumnaDosSeCreoComoEstanEnElTableroConElPrimerArchivo() {
		
		generarCeldas();
		
		generarColumna();

		celdas[0].colocarNumero(3);
		celdas[2].colocarNumero(9);
		celdas[6].colocarNumero(6);
		
		columnas[1].insertarCeldas(celdas);

		tab.cargarTablero();

		tab.celdas();

		tab.filas();
		
		tab.columnas();
		
		Assert.assertArrayEquals(columnas[1].getCeldas(), tab.getColumnas()[1].getCeldas());
	}
}
