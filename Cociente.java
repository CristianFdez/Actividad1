
public class Cociente {
	
	/**
	 * @author alexandra
	 * @version 1.0
	 * @since 06/02/2021
	 *
	 */
	
	private double real1, real2, solucion; // Numeros reales. La solucion siempre ser� un double
	private int num1, num2; // Numeros enteros
	
	/**
	 * Constructor vacio
	 */
	public Cociente() {
		super();
	}
	
	/**
	 * Constructor para operaciones con numeros reales
	 * @param real1 es un numero real
	 * @param real2 es un numero real
	 */
	
	public Cociente(double real1, double real2) {
		super();
		this.real1 = real1;
		this.real2 = real2;
	}
	
	/**
	 * Constructor para operaciones con numeros enteros
	 * @param num1 es un numero entero
	 * @param num2 es un numero entero
	 */

	public Cociente(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * Constructor para la raiz cuadrada (solo necesita 1 parametro de entrada)
	 * @param num1 es un numero entero
	 */
	public Cociente(int num1) {
		super();
		this.num1 = num1;
	}
	

	// M�todos
	/**
	 * Divisi�n de dos n�meros reales 
	 * Recibe 2 par�metros de entrada y 1 de salida que ser� la soluci�n
	 * Si el divisor es 0 devolver 000, el resultado ser�a infinito
	 * @return solucion
	 */
	public double divisionReales() {
		if (real2 != 0) {
			solucion = real1/real2;
			return solucion;
		} else 
			return 000; 
	}

	/**
	 * Divisi�n de dos n�meros enteros 
	 * Recibe 2 par�metros de entrada y 1 de salida que ser� la soluci�n
	 * Si el divisor es 0 devolver 000, el resultado ser�a infinito
	 * @return solucion es un double para recoger resultados que no dan un n�mero exacto
	 */
	public double divisionEnteros() {
		if (num2 != 0) {
			solucion = num1/num2;
			return solucion;
		} else 
			return 000; 
		
	}
	
	/**
	 * Inverso de un n�mero real 
	 * Recibe 1 par�metro de entrada y 1 de salida que ser� la soluci�n
	 * El inverso de 0 no existe, asi que si el numero dado es 0 dar� 000000 para marcar error
	 * @return solucion es un double para recoger resultados que no dan un n�mero exacto
	 */
	public double inverso() {
		if (real1 != 0) {
			solucion = 1/real1;
			return solucion;
		} else 
			return 000000;
		
	}
	
	/**
	 * Raiz cuadrada de un n�mero
	 * Recibe 1 par�metro de entrada y 1 de salida que ser� la soluci�n
	 * @return solucion es un double para recoger resultados que no dan un n�mero exacto
	 */
	public double raiz() {
		solucion = Math.sqrt(num1);
		return solucion;
	}
	

}
