/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio17 {
    
    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
    }
    
    public static int sumar(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        return suma;
    }
    
    public static double CalcularMedia(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        double media = (double) suma / numeros.length;
        return media;
       
    } 
    
    public static int ObtenerMaximo(int[] numeros){
        int max = numeros[0];
         for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }
    
    public static int contarPares(int[] numeros) {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    // Ampliación
    public static int buscar(int[] numeros, int valor) {
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                posicion = i;
                break; 
            }
        }
        return posicion;
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 9, 12, 5};

        System.out.println("Array:");
        mostrar(nums);

        System.out.println("Suma: " + sumar(nums));
        System.out.println("Media: " + CalcularMedia(nums));
        System.out.println("Maximo: " + ObtenerMaximo(nums));
        System.out.println("Pares: " + contarPares(nums));
        System.out.println("Posicion del 9: " + buscar(nums, 9));
    }
}

