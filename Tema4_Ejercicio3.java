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

public class Tema4_Ejercicio3 {
    public static void main(String[] args) {
        // 1. Crear el array: 5 cajones vacíos para guardar números decimales (precios)
        double[] precios = new double[5];
        Scanner sc = new Scanner(System.in);

        // 2. Solicitar los cinco precios al usuario (rellenar los cajones)
        System.out.println("Introduce 5 precios:");
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Precio del producto " + (i + 1) + ": ");
            precios[i] = sc.nextDouble(); // Guardamos lo que escribe el usuario en el cajón 'i'
        }

        // 3. Mostrar todos los precios actuales
        System.out.println("\n--- Listado actual de precios ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Posición [" + i + "]: " + precios[i] + " €");
        }

        // 4. Modificar el precio de un producto indicando su posición
        System.out.print("\nIntroduce la posición que deseas modificar (del 0 al 4): ");
        int pos = sc.nextInt();

        // Controlamos con un 'if' que la posición exista para que el programa no falle
        if (pos >= 0 && pos < precios.length) {
            System.out.print("Introduce el nuevo precio: ");
            precios[pos] = sc.nextDouble(); // Sobrescribimos el valor de ese cajón
            System.out.println("¡Precio modificado con éxito!");
        } else {
            System.out.println("Error: Posición no válida (debe estar entre 0 y 4).");
        }

        // 5. Mostrar el listado actualizado
        System.out.println("\n--- Listado actualizado de precios ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Posición [" + i + "]: " + precios[i] + " €");
        }

        // Cerramos el scanner para liberar recursos
        sc.close();
    }
}
