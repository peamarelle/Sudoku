package desarrollo;

public class NumeroInvalido extends RuntimeException{
	
	public NumeroInvalido() {
		System.out.println("El numero ingresado es incorrecto");
	}
}
