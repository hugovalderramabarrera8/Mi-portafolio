/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio1 {
    public static void main(String[] args) {
        
        int[] numeros = {10, 20, 30, 40, 50};
        
        System.out.println("--- ARRAY ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
            
        }
        
        numeros[2] = 99;
        
        
        System.out.println("\n--- ARRAY Modificado ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeros[i]);
        }
    }
    
}
