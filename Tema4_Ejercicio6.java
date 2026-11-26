/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 20, 3, 15};

        // 1. Mostrar todos los números utilizando un 'for' tradicional
        System.out.println("--- 1. Bucle 'for' tradicional ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // 2. Mostrar todos los números utilizando un 'for-each'
        System.out.println("\n--- 2. Bucle 'for-each' ---");
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }

        // 3. Mostrar únicamente los números mayores que 10
        System.out.println("\n--- 3. Números mayores que 10 ---");
        for (int num : numeros) {
            if (num > 10) {
                System.out.println(num);
            }
        }
    }
}