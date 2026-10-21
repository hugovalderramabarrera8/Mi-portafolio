/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int sumaTotal = 0;
        int numero;
    
        System.out.println("Introduzce numeros para sumar. Ingresa 0 para terminar");
    
        // Bucle para pedir numeros hasta que se ingrese el 0
        do {
            System.out.println("Introduce un numero: ");
            numero= scanner.nextInt();
        
            // Acumulamos el numero ingresado a lo que ya teniamos
            sumaTotal += numero;
        
        } while (numero != 0);
    
        System.out.println("\nPrograma finalizado.");
        System.out.println("La suma total acumulada es: " + sumaTotal);
    
    scanner.close();
    
   }
  }

