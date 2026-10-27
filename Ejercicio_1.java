/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;

import java.util.Scanner;

/**
 *
 * @author 20_1DAW
 */
public class Ejercicio_1 {

    public static void main(String[] args) {

        // Leer datos por teclado
       Scanner teclado = new Scanner(System.in);

        // Pedir el codigo de la nave
        System.out.print("Introduce el codigo (1-4): ");
        int codigo = teclado.nextInt();

        // Comprobar el codigo de la nave
        switch (codigo) {

            case 1:
                System.out.println("Acceso concedido: Sector Central");
                break;

            case 2:
                System.out.println("Acceso concedido: Hangar de Carga");

                // Pedir el peso de la carga
                System.out.print("Introduce el tonelaje: ");
                int tonelaje = teclado.nextInt();

                // Comprobar el peso
                if (tonelaje > 500) {
                    System.out.println("Requiere inspección aduanera");
                } else {
                    System.out.println("No requiere inspección aduanera");
                }
                break;

            case 3:
                System.out.println("Acceso restringido: Enviar escolta");
                break;

            case 4:
                System.out.println("¡ALERTA! Iniciar protocolos de defensa");
                break;

            default:
                System.out.println("Codigo no valido");
                break;
        }

        // Cerrar el Scanner
        teclado.close();
    }
}