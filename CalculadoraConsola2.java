package cl.skillnest.ejemplos;

public class CalculadoraConsola2 {

	  public static void main(String[] args) {
	        int resultado = sumar(5, 3);
	        System.out.println("Resultado: " + resultado);
	        int IMPUESTO_VALOR_AGREGADO = 19; // constante todas en mayusculas y cvon guiones bajos. 
	    }
	  
	  /**
	   * Metodo que retorna un int como resultado de la suma de los dos int
	   * @param a primer numero entero
	   * @param b segundo numero entero
	   * @returnLa suma de ambos
	   */

	    public static int sumar(int a, int b) {
	        return a + b;
	    }
	}