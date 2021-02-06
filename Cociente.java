
public class Cociente {
	
	/**
	 * @author alexandra
	 * @version 1.0
	 * @since 06/02/2021
	 *
	 */
	
	private double real1, real2, solucion; // Numeros reales. La solucion siempre será un double.
	private int num1, num2; // Numeros enteros
	
	/**
	 * Constructor vacio
	 */
	public Cociente() {
		super();
	}
	
	/**
	 * Constructor lleno
	 * @param real1
	 * @param real2
	 * @param solucion
	 * @param num1
	 * @param num2
	 */
	public Cociente(double real1, double real2, double solucion, int num1, int num2) {
		super();
		this.real1 = real1;
		this.real2 = real2;
		this.solucion = solucion;
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Métodos
	/**
	 * División entre dos números reales
	 * Si el divisor es 0 devolver 000, el resultado sería infinito
	 * @return double
	 */
	public double divisionReales() {
		if (real2 != 0) {
			solucion = real1/real2;
			return solucion;
		} else 
			return 000; 
	}
	
	/**
	 * Este método devuelve la división del primer entero entre el segundo. 
	 * Si el divisor es 0 devolver 000, el resultado sería infinito
	 * @return double para poder recoger resultados que no dan un número exacto.
	 */
	public double divisionEnteros() {
		if (num2 != 0) {
			solucion = num1/num2;
			return solucion;
		} else 
			return 000; 
		
	}
	
	/**
	 * Método para devolver el inverso de un número dado
	 * El inverso de 0 no existe, asi que si el numero dado es 0 dará 000 para marcar error.
	 * @return double
	 */
	public double inverso() {
		if (real1 != 0) {
			solucion = 1/real1;
			return solucion;
		} else 
			return 000;
		
	}
	
	/**
	 * Método para calcular la raiz cuadrada de un numero dado
	 * @return double
	 */
	public double raiz() {
		solucion = Math.sqrt(num1);
		return solucion;
		
	}
	

}
