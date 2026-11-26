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

public class Tema4_Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        // Contadores
        int letras = 0;
        int mayus = 0;
        int minus = 0;
        int digitos = 0;
        int espacios = 0;
        int otros = 0;

        // Miro cada letra/carácter del texto uno por uno
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
                // Si es letra, miro si es mayúscula o minúscula
                if (Character.isUpperCase(c)) {
                    mayus++;
                } else {
                    minus++;
                }
            } else if (Character.isDigit(c)) {
                digitos++;
            } else if (c == ' ') {
                espacios++;
            } else {
                otros++;
            }
        }

        System.out.println("Letras: " + letras);
        System.out.println("Mayúsculas: " + mayus);
        System.out.println("Minúsculas: " + minus);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Otros caracteres: " + otros);

        sc.close();
    }
}
