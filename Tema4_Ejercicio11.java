/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio11 {
    public static void main(String[] args) {
        int[] original = {2, 5, 3, 2, 8, 5, 9};

        System.out.print("Resultado: [");
        boolean primero = true;

        for (int i = 0; i < original.length; i++) {
            int veces = 0;
            for (int j = 0; j < original.length; j++) {
                if (original[i] == original[j]) {
                    veces++;
                }
            }

            if (veces == 1) {
                if (!primero) {
                    System.out.print(", ");
                }
                System.out.print(original[i]);
                primero = false;
            }
        }

        System.out.println("]");
    }
}
