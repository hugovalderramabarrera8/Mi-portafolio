/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author 20_1DAW
 */
public class Ejercicio_2 {
    public static void main(String[] args) {

        
        // Bucle for: empieza en 100, llega hasta 150 y aumenta de 1 en 1
        for (int frecuencia = 100; frecuencia <= 150; frecuencia++) {

            
            // Comprueba si la frecuencia es divisible entre 5
            if (frecuencia % 5 == 0) {
                continue;
            }
            

            // Comprueba si la frecuencia es exactamente 137
            if (frecuencia ==137) {
                System.out.println("¡Frecuencia de socorro 137 hallada! Deteniendo el escaneo.");
                break;
            }
            
            // Muestra la frecuencia si no es divisible entre 5 ni es la 137
            System.out.println("Sintonizando frecuencia: " + frecuencia);
            
        }
    }
}
