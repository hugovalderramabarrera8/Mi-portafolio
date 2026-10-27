/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
public class SumaHastaCien {
    public static void main(String[] args) {
        
        // Guardamos el total en una cajita que empieza valiendo 0
        int suma = 0;

        // Repetimos un proceso 100 veces, desde el número 1 hasta el 100
        for (int i = 1; i <= 100; i++) {
            
            // A lo que ya teníamos acumulado, le sumamos el número actual (i)
            suma += i; 
            
        } // Fin del bucle

        // Imprimimos el resultado final en la pantalla
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}
