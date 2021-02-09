public class Resta {
	
	/**
	 * @author Cristian Fernández
	 * @version 1.0
	 * @since 05/02/2021
	 */
	
	/**
	 * Declaro varios valores para hacer las operaciones de resta,
	 * 3 valores reales y 2 enteros, y resultado como valor de la solución
	 * y acumulado para guardar el valor donde acumulo.
	 */
	private double a, b, c, resultado, acumulado;
	private int  d, e;
	
	/**
	 * Declaro el constructor sin nada, vacío.
	 */
	public Resta() {
		super();
	}

	/**
	 * Declaro el constructor con todos los valores.
	 * @param a es un número real.
	 * @param b es un número real.
	 * @param c es un número real.
	 * @param d es un número entero.
	 * @param e es un número entero.
	 */
	public Resta(double a, double b, double c, int d, int e) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}

	/**
	 *  Método para restar números reales.
	 *  Recibe 2 parámetros de entrada y 1 de salida que será el resultado.
	 *  Si uno de los datos es 0, el resultado sería igual al otro valor.
	 *  Si uno de los datos introducido es negativo, daría error.
	 *  @return resultado
	 */
	public double restaReales() {
		resultado = a - b;
		return resultado;
	}

	/**
	 *  Método para restar números enteros.
	 *  Recibe 2 parámetros de entrada y 1 de salida que será el resultado.
	 *  Si uno de los datos es 0, el resultado sería igual al otro valor.
	 *  Si uno de los datos introducido es negativo, daría error.
	 *  @return resultado
	 */
	public double restaEnteros() {
		resultado = d - e;
		return resultado;
	}

	/**
	 *  Método para restar tres números reales.
	 *  Recibe 3 parámetros de entrada y 1 de salida que será el resultado.
	 *  Si uno de los datos es 0, el resultado sería igual a la resta de los otros dos valores.
	 *  Si uno de los datos introducido es negativo, daría error.
	 *  @return resultado
	 */
	public double restaTres() {
		resultado = a - b - c;
		return resultado;
	}

	/**
	 *  Método para restar número acumulado.
	 *  Recibe 1 parámetro de entrada y 1 de salida que será el resultado.
	 *  Si uno de los datos es 0, el resultado sería 0.
	 *  Si uno de los datos introducido es negativo, daría error.
	 */
	public void restaAcumulado() {
		resultado = c - c;
		

	}

}