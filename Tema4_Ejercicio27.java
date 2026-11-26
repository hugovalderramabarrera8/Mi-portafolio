/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

public class Tema4_Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        boolean contiene = frase.contains(palabra);
        int posicion = frase.indexOf(palabra); // Devuelve -1 si no la encuentra
        boolean comienza = frase.startsWith(palabra);
        boolean termina = frase.endsWith(palabra);

        System.out.println("\n--- Resultados ---");
        System.out.println("¿Contiene la palabra? " + contiene);
        System.out.println("Posición: " + posicion);
        System.out.println("¿Comienza por ella? " + comienza);
        System.out.println("¿Termina por ella? " + termina);

        sc.close();
    }
}
