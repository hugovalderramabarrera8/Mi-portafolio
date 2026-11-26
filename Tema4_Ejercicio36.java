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

public class Tema4_Ejercicio36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        int caracteres = frase.length();
        int vocales = 0;
        int consonantes = 0;
        int digitos = 0;
        int espacios = 0;

        String minus = frase.toLowerCase();
        String invertida = "";
        String soloLetras = "";

        for (int i = 0; i < frase.length(); i++) {
            char cOriginal = frase.charAt(i);
            char c = minus.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
                soloLetras = soloLetras + cOriginal;
            } else if (c >= 'a' && c <= 'z') {
                consonantes++;
                soloLetras = soloLetras + cOriginal;
            } else if (c >= '0' && c <= '9') {
                digitos++;
            } else if (c == ' ') {
                espacios++;
            }
        }

        for (int i = frase.length() - 1; i >= 0; i--) {
            char cOriginal = frase.charAt(i);
            if (cOriginal != ' ') {
                invertida = invertida + cOriginal;
            }
        }

        String limpia = frase.trim();
        int palabras = 0;
        if (!limpia.isEmpty()) {
            palabras = 1;
            for (int i = 0; i < limpia.length(); i++) {
                if (limpia.charAt(i) == ' ' && limpia.charAt(i + 1) != ' ') {
                    palabras++;
                }
            }
        }

        System.out.println("\nCaracteres: " + caracteres);
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Digitos: " + digitos);
        System.out.println("Espacios: " + espacios);
        System.out.println("Palabras: " + palabras);
        System.out.println("Frase invertida (sin espacios): " + invertida);
        System.out.println("Solo letras: " + soloLetras);

        sc.close();
    }
}
