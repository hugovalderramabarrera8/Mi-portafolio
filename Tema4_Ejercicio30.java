/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class Tema4_Ejercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del archivo: ");
        String archivo = sc.nextLine().trim().toLowerCase();

        if (archivo.endsWith(".pdf")) {
            System.out.println("Archivo PDF.");
        } else if (archivo.endsWith(".jpg")) {
            System.out.println("Imagen JPG.");
        } else if (archivo.endsWith(".png")) {
            System.out.println("Imagen PNG.");
        } else if (archivo.endsWith(".txt")) {
            System.out.println("Archivo de texto TXT.");
        } else {
            System.out.println("Extension no permitida.");
        }

        sc.close();
    }
}

