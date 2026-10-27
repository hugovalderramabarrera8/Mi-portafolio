/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
public class SumaInversa {
    public static void main(String[] args) {
        
        // Guardamos el total en una cajita que empieza en 0
        int suma = 0;

        // Empezamos en 100 y vamos bajando de 1 en 1 hasta llegar a 1
        for (int i = 100; i >= 1; i--) {
            
            // Le sumamos a nuestra cajita el número actual (i)
            suma += i; 
            
        } // Fin del bucle

        // Imprimimos el resultado final en la pantalla
        System.out.println("La suma desde el 100 hasta el 1 es: " + suma);
    }
}
