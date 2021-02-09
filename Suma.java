public class Suma {
	
	/**
	 * Entorno de desarollo 
	 * Actividad 1. Tarea en equipo 4 personass. Generación de documentación
	 * Clase 1. SUMA
	 * @author Inma Prieto
	 * @version 1.0
	 * 
	 */
	
	

	/**
	 * declaro las variables para hacer las operaciones de suma
	 * dos valores enteros y tres reales y resultados como valor de la solucion
	 * y acumulado para guardar donde acumulo 
	 */
	
	
	double num1, num2,num3, resultado, acumulado;
	int num4, num5;  
	
	
	/**
	 * Declaro el constructor con todos los valores
	 * @param num1 es un numero real
	 * @param num2 es un numero real
	 * @param num3 es un numero real
	 * @param num4 es un numero enteros
	 * @param num5 es un numero enteros
	 * 
	 * 
	 */
	
	public Suma(double num1, double num2, double num3, double resultado, double acumulado, int num4, int num5) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
	}

    /**
     * Declaro el constructor vacio
     */
	
	public Suma() {
		super();
	}

    /**
     * Metodo sumar valores reales
     * recibe dos parametros de entrada y uno de salida que sera el resultado
     * si uno de los datos es 0 el resultado seria igual al otro valor
     * si uno de los datos es negativo daria error
     * @return resultado
     */
	
	
	public double sumarReales() {
		
		resultado = num1+num2;
		return resultado;
	}
    
	/**
     * Metodo sumar valores enteros
     * recibe dos parametros de entrada y uno de salida que sera el resultado
     * si uno de los datos es 0 el resultado seria igual al otro valor
     * si uno de los datos es negativo daria error
     * @return resultado
     */
	
	
	public double SumarEnteros() {
		
		resultado = num4+num5;
		return resultado;
		
	}
	
	/**
     * Metodo para sumar tres numero reales
     * recibe tres parametros de entrada y uno de salida que sera el resultado
     * si uno de los datos es 0 el resultado seria igual al otro valor
     * si uno de los datos es negativo daria error
     * @return resultado
     */
	
	public double SumaTres() {
		resultado = num1+num2+num3;
		return resultado; 
		
    }
	
	/**
     * Metodo sumar numeros acumulados
     * recibe un parametro de entrada y uno de salida que sera el resultado
     * si uno de los datos es 0 el resultado seria igual al otro valor
     * si uno de los datos es negativo daria error
     * 
     */
	
	
	public void SumaAcumulado () {
		 resultado = num1+num1+num1;
	
		 
	}
	
	
}
		