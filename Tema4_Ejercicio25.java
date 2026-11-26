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

public class Tema4_Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nombre de usuario: ");
        String usuario = sc.nextLine();

        boolean noVacio = !usuario.isEmpty();
        boolean minimo5 = usuario.length() >= 5;
        boolean maximo15 = usuario.length() <= 15;
        boolean sinEspacios = !usuario.contains(" ");

        System.out.println("\nResultados:");
        System.out.println("No esta vacio: " + noVacio);
        System.out.println("Tiene al menos 5 caracteres: " + minimo5);
        System.out.println("No supera los 15 caracteres: " + maximo15);
        System.out.println("No contiene espacios: " + sinEspacios);

        sc.close();
    }
}
