package desarrollo;

public class Tablero {

	private int[][] tablero;
	private Celda[][] celdas;
	private ColeccionCeldas[] filas;
	private ColeccionCeldas[] columnas;
	private ColeccionCeldas[] cajas;
	private LectorDeArchivo lector;

	public Tablero() {

		tablero = null;

		lector = new LectorDeArchivo();

		celdas = new Celda[9][9];

		filas = new Fila[9];

		columnas = new Columna[9];

		cajas = new Caja[9];

	}

	public void cargarTablero() {

		int[][] array = lector.leer();

		if (array[0].length != 9 && array.length != 9) {

			throw new TamanioInvalido();
		} else {
			tablero = array;
		}

	}

	public void celdas() {

		for (int i = 0; i < celdas.length; i++) {

			for (int j = 0; j < celdas[0].length; j++) {

				celdas[i][j] = new Celda();

				if (this.tablero[i][j] > 0) {

					celdas[i][j].colocarNumero(this.tablero[i][j]);
				}
			}
		}
	}

	public void filas() {

		for (int i = 0; i < filas.length; i++) {

			Celda[] fill = new Celda[9];

			filas[i] = new Fila(i + 1);

			for (int k = 0; k < filas.length; k++) {

				fill[k] = this.celdas[i][k];
			}

			filas[i].insertarCeldas(fill);
		}

	}

	public void columnas() {

		for (int i = 0; i < columnas.length; i++) {

			Celda[] column = new Celda[9];

			columnas[i] = new Columna(i + 1);

			for (int k = 0; k < columnas.length; k++) {

				column[k] = this.celdas[k][i];
			}

			columnas[i].insertarCeldas(column);
		}
	}

	public void cajas() {

		for (int i = 0; i < cajas.length; i++) {

			cajas[i] = new Caja(i + 1);

			Celda[] box = new Celda[9];

			armarCaja(i, box);

			cajas[i].insertarCeldas(box);
		}
	}

	private void armarCaja(int num, Celda[] box) {
		int fila = 0, columna = 0;
		
		if(num % 3 == 0) {
			fila = num;
			columna = 0;
		}
		if(num % 3 == 1) {
			
			fila = num -1;
			columna = 3;
		}
		
		if(num % 3 == 2)
		{
			fila = num - 2;
			columna = 6;
		}
		
		int n = 0;
		
		for (int k = fila; k < fila + 3; k++) {
			
			for (int j = columna; j < columna + 3; j++) {
				
				box[n] = this.celdas[k][j]; 
				
				n++;
			}
		}
	}

	public ColeccionCeldas[] getColumnas() {
		
		return this.columnas;
	}

	public static void main(String[] args) {

		Tablero tab = new Tablero();

		tab.cargarTablero();

		tab.celdas();

		tab.filas();

		tab.columnas();
		
		tab.cajas();

//		for (int i = 0; i < tab.tablero.length; i++) {
//
//			for (int j = 0; j < tab.tablero.length; j++) {
//
//				System.out.print(tab.tablero[i][j] + " ");
//			}
//
//			System.out.println();
//		}
//		
//		System.out.println();

		for (int i = 0; i < tab.celdas.length; i++) {
			
			for (int j = 0; j < tab.celdas[0].length; j++) {
				
				System.out.print(tab.celdas[i][j].getNumero()  + " ");
			}
			
			System.out.println();
		}

		for (int i = 0; i < tab.cajas.length; i++) {

			System.out.println("caja " + tab.cajas[i].getNumero());

			Celda[] box = tab.cajas[i].getCeldas();

			for (int j = 0; j < box.length; j++) {

				System.out.print(box[j].getNumero() + " ");
			}

			System.out.println();
		}

	}
}
