package cl.skillnest.ejemplos;

import java.util.Scanner;

public class Bienvenida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("¡Hola, " + nombre + "!");
        
        sc.close(); 
    }
}