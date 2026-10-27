/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int n = scanner.nextInt();
        
        boolean esPrimo = true;
        
        // El 0, el 1 y los negativos no son primos
        if (n <= 1) {
            esPrimo = false;
        } else {
            // Probamos a dividir el número entre todos los anteriores desde el 2
            for (int i = 2; i < n; i++) {
                if (n % i == 0) { // Si la división es exacta (resto 0)
                    esPrimo = false;
                    break; // Encontramos un divisor, salimos del bucle
                }
            }
        }
        
        // Mostramos el resultado
        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " NO es un número primo.");
        }
        
        scanner.close();
    }
}
