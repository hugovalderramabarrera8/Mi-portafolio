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

public class Tema4_Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Posición de inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Posición de fin: ");
        int fin = sc.nextInt();

        int longitud = frase.length();

        if (inicio < 0) {
            System.out.println("Error: el inicio no puede ser negativo.");
        } else if (fin > longitud) {
            System.out.println("Error: el fin no puede superar la longitud de la frase (" + longitud + ").");
        } else if (inicio > fin) {
            System.out.println("Error: el inicio no puede ser mayor que el fin.");
        } else {
            String subcadena = frase.substring(inicio, fin);
            System.out.println("Resultado: " + subcadena);
        }

        sc.close();
    }
}
