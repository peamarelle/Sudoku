package desarrollo;

import java.io.File;
import java.util.Scanner;

public class LectorDeArchivo {
	
	public int[][] leer() {
		
		int[][] tablero = new int[9][9];
		Scanner entrada = null;
		
		try {
			
			entrada = new Scanner(new File("sudoku.txt"));
			
			for (int i = 0; i < tablero.length; i++) {
				
				for (int j = 0; j < tablero.length; j++) {
					
					tablero[i][j]= entrada.nextInt();
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
			entrada.close();
		}
		return tablero;
		
	}

}
