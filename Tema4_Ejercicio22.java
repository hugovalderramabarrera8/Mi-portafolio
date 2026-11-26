/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class Tema4_Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.next();

        int longPalabra = palabra.length();
        char primero = palabra.charAt(0);
        char ultimo = palabra.charAt(longPalabra - 1);

        System.out.println("Palabra: " + palabra);
        System.out.println("Longitud: " + longPalabra);
        System.out.println("Primer caracter: " + primero);
        System.out.println("Ultimo caracter: " + ultimo);

        // Ampliacion.
        if (longPalabra > 10) {
            System.out.println("La palabra tiene mas de 10 caracteres.");
        } else {
            System.out.println("La palabra no tiene mas de 10 caracteres.");
        }

        sc.close();
    }
}
