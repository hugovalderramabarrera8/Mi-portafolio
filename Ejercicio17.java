/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("CAJERO AUTOMÁTICO");
            System.out.println("1. Mostrar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.println("Mostrando saldo...");
            }

            if (opcion == 2) {
                System.out.println("Retirando dinero...");
            }

            if (opcion == 3) {
                System.out.println("Gracias por usar el cajero. ¡Adiós!");
                break;
            }
        }

        teclado.close();
    }
}


