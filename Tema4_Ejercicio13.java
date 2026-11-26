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

public class Tema4_Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};
        Scanner sc = new Scanner(System.in);

        System.out.print("Número buscado: ");
        int buscado = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println("El número se encuentra en la posición " + i + ".");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El número no existe en el array.");
        }

        sc.close();
    }
}

