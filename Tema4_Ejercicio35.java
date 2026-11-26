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

public class Tema4_Ejercicio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine().trim().toLowerCase();

        String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida = invertida + palabra.charAt(i);
        }

        if (palabra.equals(invertida)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("No palindromo");
        }

        sc.close();
    }
}

