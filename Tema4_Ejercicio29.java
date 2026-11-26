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

public class Tema4_Ejercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nombre completo: ");
        String nombre = sc.nextLine();

        String limpio = nombre.trim();

        System.out.println("\n" + limpio.toUpperCase());
        System.out.println(limpio.toLowerCase());
        System.out.println(limpio.replace(" ", "-"));

        sc.close();
    }
}
