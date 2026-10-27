/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2;

/**
 *
 * @author 20_1DAW
 */


import java.util.Scanner; // Importa Scanner para leer datos por teclado

public class Ejercicio_3 {
    public static void main(String[] args) {

        // Scanner: crea un objeto para leer los datos que introduce el usuario
        Scanner teclado = new Scanner(System.in);

        // Variable 
        int bateria = 10; 
        int energia;
        int ciclos = 0;

        // Bucle while, repite el código mientras la batería sea menor que 100
        while (bateria < 100) {    
            System.out.println("Batería actual: " + bateria + "%");           
            System.out.print("¿Cuántos puntos de energía quieres añadir (1-30)? ");
            energia = teclado.nextInt();

            
            if (energia < 1 || energia > 30) {
                System.out.println("Entrada inválida");
                continue;
            }

            // Suma la energía introducida al nivel actual de batería
            bateria = bateria + energia;

            // Incrementa el contador de ciclos en 1
            ciclos++;

            // Muestra el nuevo nivel de batería
            System.out.println("Batería recargada: " + bateria + "%");
        }

        // Muestra el número total de ciclos de recarga válidos
        System.out.println("Total de ciclos de recarga: " + ciclos);

        
        teclado.close();
    }
}
