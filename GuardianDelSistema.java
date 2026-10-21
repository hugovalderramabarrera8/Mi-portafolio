/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class GuardianDelSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pinCorrecto = 1234;
        int intentos = 0;
        boolean acceso = false;

        // Bucle para dar maximo 3 oportunidades
        while (intentos < 3 && !acceso) {
            System.out.print("Introduce el PIN: ");
            int pinIngresado = scanner.nextInt();
            
            // Verificacion con if/else
            if (pinIngresado == pinCorrecto) {
                System.out.println("PIN correcto. Acceso concedido.");
                acceso = true;
            } else {
                intentos++;
                System.out.println("PIN incorrecto. Intentos usados: " + intentos + " de 3.");
            }
        }

        // Menu con switch si acierta el PIN
        if (acceso) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver perfil");
            System.out.println("2. Ajustes");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entrando al perfil de usuario...");
                    break;
                case 2:
                    System.out.println("Entrando a ajustes...");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } else {
            System.out.println("Sistema bloqueado. Has agotado los 3 intentos.");
        }

        scanner.close();
    }
}
