package desarrollo;

public class Celda {

	private int numero;
	
	public Celda() {
		
		this.numero = 0;
	}

	public boolean estaVacia() {

		return this.numero == 0;
	}

	public void colocarNumero(int numero) {

		if (numero < 1 || numero > 9) {
			
			throw new NumeroInvalido();
		} else
			this.numero = numero;
	}
	
	public boolean contiene(int numero) {
		
		return this.numero == numero;
	
	}
	
	public int getNumero() {
		
		return this.numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Celda other = (Celda) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

}
