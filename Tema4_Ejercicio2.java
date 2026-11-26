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

public class Tema4_Ejercicio2 {
    public static void main(String[] args) {
        double[] temperaturas = new double[5];
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Por favor, introduce las 5 temperaturas registradas:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dia " + (i +1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
        
        
        System.out.println("\n--- TEMPERATURAS REGISTRADAS ---");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + temperaturas[i] + " ºC");
            
            
    } 
        
        System.out.println("\nSe han almacenado un total de " + temperaturas.length + " temperaturas.");
        
        scanner.close();
    }
    
}
