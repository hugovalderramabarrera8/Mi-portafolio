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

public class Tema3_Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 y 2. Solicitar el tamaño y crear el array dinámicamente
        System.out.print("Introduce el tamaño que tendrá el array: ");
        int tamano = sc.nextInt();
        int[] numeros = new int[tamano];

        // 3. Introducir los elementos del array
        System.out.println("\nIntroduce los " + tamano + " elementos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Elemento en la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // 4. Solicitar una posición al usuario para consultar
        System.out.print("\n¿Qué posición deseas consultar? (de 0 a " + (tamano - 1) + "): ");
        int posicion = sc.nextInt();

        // 5 y 6. Controlar que la posición sea válida y mostrar el valor
        if (posicion >= 0 && posicion < numeros.length) {
            System.out.println("El valor almacenado en la posición [" + posicion + "] es: " + numeros[posicion]);
        } else {
            System.out.println("Error: La posición introducida no existe en este array.");
        }

        sc.close();
    }
}
