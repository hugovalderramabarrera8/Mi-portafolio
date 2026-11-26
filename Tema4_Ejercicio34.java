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

public class Tema4_Ejercicio34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.print("Introduce un caracter: ");
        char buscado = sc.nextLine().charAt(0);

        int contador = 0;
        String posiciones = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == buscado) {
                contador++;
                if (posiciones.isEmpty()) {
                    posiciones = posiciones + i;
                } else {
                    posiciones = posiciones + ", " + i;
                }
            }
        }

        boolean aparece = contador > 0;
        int primera = frase.indexOf(buscado);
        int ultima = frase.lastIndexOf(buscado);

        System.out.println("\nAparece: " + aparece);
        System.out.println("Numero de apariciones: " + contador);
        System.out.println("Primera posicion: " + primera);
        System.out.println("Ultima posicion: " + ultima);
        System.out.println("Todas las posiciones: " + posiciones);

        sc.close();
    }
}

