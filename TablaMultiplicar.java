/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class TablaMultiplicar {
    
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("\n--- Tabla de multiplicar del " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            imprimirTablaMultiplicar(num);
        } else {
            System.out.println("Por favor, introduce un número válido.");
        }
        
        scanner.close();
    }
}