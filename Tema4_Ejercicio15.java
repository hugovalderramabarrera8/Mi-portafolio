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

public class Tema4_Ejercicio15 {
    public static void main(String[] args) {
        int[] notas = {4, 7, 3, 8, 5, 2, 9, 6, 4, 7};
        Scanner sc = new Scanner(System.in);

        int aprobados = 0;
        int suspendidos = 0;
        boolean hayDiez = false;
        int max = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }

            if (notas[i] == 10) {
                hayDiez = true;
            }

            if (notas[i] > max) {
                max = notas[i];
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);
        System.out.println("¿Hay algún 10? " + hayDiez);

        System.out.print("¿De qué nota quieres contar cuántos alumnos la sacaron?: ");
        int notaBuscada = sc.nextInt();
        int vecesNota = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == notaBuscada) {
                vecesNota++;
            }
        }
        System.out.println("Alumnos con nota " + notaBuscada + ": " + vecesNota);

        int primeraPos = -1;
        int ultimaPos = -1;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == max) {
                if (primeraPos == -1) {
                    primeraPos = i;
                }
                ultimaPos = i;
            }
        }

        System.out.println("Nota más alta: " + max);
        System.out.println("Primera posición: " + primeraPos);
        System.out.println("Última posición: " + ultimaPos);

        sc.close();
    }
}
