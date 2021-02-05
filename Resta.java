public class Resta {
	
	/**
	 * Declaro varios valores para hacer las operaciones de resta,
	 * 2 valores reales y 3 enteros, y resultado como valor de la solución
	 * y acumulado para guardar el valor donde acumulo.
	 */
	private double a, b, resultado, acumulado;
	private int c, d, f;
	
	/**
	 * Declaro el constructor sin nada, vacío.
	 */
	public Resta() {
		super();
	}

	/**
	 * Declaro el constructor con todos los valores.
	 */
	public Resta(double a, double b, int c, int d, int f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.f = f;
	}

	/**
	 *  Método para restar números reales.
	 */
	public double restaReales() {
		resultado = a - b;
		return resultado;
	}

	/**
	 *  Método para restar números enteros.
	 */
	public double restaEnteros() {
		resultado = c - d;
		return resultado;
	}

	/**
	 *  Método para restar tres números.
	 */
	public double restaTres() {
		resultado = c - d - f;
		return resultado;
	}

	/**
	 *  Método para restar número acumulado.
	 */
	public void restaAcumulado() {
		resultado = c - c;

	}

}