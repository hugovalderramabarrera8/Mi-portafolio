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

public class Tema4_Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                suspensos++;
            } else if (notas[i] < 7) {
                aprobados++;
            } else if (notas[i] < 9) {
                notables++;
            } else {
                sobresalientes++;
            }
        }

        int totalAprobados = aprobados + notables + sobresalientes;
        double porcentajeAprobados = (totalAprobados * 100.0) / notas.length;
        int sumaTotal = suspensos + aprobados + notables + sobresalientes;

        System.out.println("\nSuspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Suma de categorías: " + sumaTotal + " (Total alumnos: " + notas.length + ")");

        sc.close();
    }
}