/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
public class SumaPares {
    public static void main(String[] args) {
        
        // Guardamos el total en una cajita que empieza en 0
        int suma = 0;
        
        // Empezamos en el 2, terminamos en el 100, y avanzamos de 2 en 2
        for(int i = 2; i <= 100; i += 2) {
            
            // Sumamos el número par actual a nuestra cajita 
            suma += i;
            
        } // Fin del bucle
        
        System.out.println("La suma de los numeros pares del 1 al 100 es: " + suma);
        }
    }
