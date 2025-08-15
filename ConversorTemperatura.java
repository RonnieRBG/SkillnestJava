package cl.skillnest.ejemplos;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa Grados C°: ");
        double gradosCelsius = sc.nextDouble();

        double gradosFarenheit = ((gradosCelsius * 1.8) + 32);
        System.out.println("F° =" + gradosFarenheit);
        
        sc.close(); 
}
}















