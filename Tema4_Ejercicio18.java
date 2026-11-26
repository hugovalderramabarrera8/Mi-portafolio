/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio18 {
    
    
    public static void Mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
    }
    
    public static void Incrementar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] +1;
        } 
    }
    
    public static void Multiplicar(int[] numeros, int factor) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * factor;
        }
    }

     public static void RellenarCeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        } 
    }
    
    //Ampliacion.
    public static int[] copiar(int[] numeros) {
        int[] nuevoArray = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            nuevoArray[i] = numeros[i];
        }
    return nuevoArray;
    } 
    
 public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("--- Array original ---");
        Mostrar(nums);

        System.out.println("\n--- 1. Incrementando (+1) ---");
        Incrementar(nums);
        Mostrar(nums); // Se ve que cambia el original

        System.out.println("\n--- 2. Multiplicando por 3 ---");
        Multiplicar(nums, 3);
        Mostrar(nums);

        System.out.println("\n--- Ampliación: Copia y aislamiento ---");
        int[] copia = copiar(nums);
        System.out.print("Array copia: ");
        Mostrar(copia);

        // Modificamos la copia para comprobar que el original no cambia
        copia[0] = 999; 
        
        System.out.print("Copia modificada en la posicion 0: ");
        Mostrar(copia);
        
        System.out.print("Array original (sigue intacto respecto a la copia): ");
        Mostrar(nums);

        System.out.println("\n--- 3. Rellenando de ceros el original ---");
        RellenarCeros(nums);
        Mostrar(nums);
    }
}
    
