/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class ContarHastaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        // Validamos que sea un número positivo
        if (numero > 0) {
            int contador = 1;

            System.out.println("Contando desde 1 hasta " + numero + ":");
            
            // Bucle que cuenta desde 1 hasta el número ingresado
            while (contador <= numero) {
                System.out.println(contador);
                contador++; // Incrementamos el contador en cada vuelta
            }
        } else {
            System.out.println("Por favor, ingrese un número entero positivo válido.");
        }

        scanner.close();
    }
}