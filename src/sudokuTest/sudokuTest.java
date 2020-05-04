package sudokuTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import desarrollo.Celda;
import desarrollo.Fila;
import desarrollo.Tablero;

public class sudokuTest {
	Celda celda;
	Tablero sudoku;
	
	@Before
	public void setUp() {
		
		celda = new Celda();
		sudoku = new Tablero();
	}
	
	@Test
	public void alCrearUnaNuevaCeldaDebeEstarVacia() {
		
		Assert.assertEquals(true, celda.estaVacia());
	}	
	
	
}
