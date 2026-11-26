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

public class Tema4_Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = {2, 5, 2, 8, 2, 9, 5, 2};
        Scanner sc = new Scanner(System.in);

        int contador2 = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 2) {
                contador2++;
            }
        }
        System.out.println("El 2 aparece " + contador2 + " veces.");

        System.out.print("Introduce otro número para buscar: ");
        int buscado = sc.nextInt();
        int contadorBuscado = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contadorBuscado++;
            }
        }
        System.out.println("El " + buscado + " aparece " + contadorBuscado + " veces.");

        // Ampliación: 2, 5, 8 y 9
        int[] objetivos = {2, 5, 8, 9};
        for (int i = 0; i < objetivos.length; i++) {
            int veces = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == objetivos[i]) {
                    veces++;
                }
            }
            System.out.println("Número " + objetivos[i] + ": " + veces + " veces.");
        }

        sc.close();
    }
}
