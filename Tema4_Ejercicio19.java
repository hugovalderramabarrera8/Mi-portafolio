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

public class Tema4_Ejercicio19 {

    public static void main(String[] args) {
        double[] notas = {4.5, 7.0, 8.5, 3.0, 6.5, 9.0};
        Scanner sc = new Scanner(System.in);

        mostrarNotas(notas);

        double media = calcularMedia(notas);
        System.out.println("Media: " + media);

        int aprobados = contarAprobados(notas);
        System.out.println("Aprobados: " + aprobados);

        double maxima = notaMaxima(notas);
        System.out.println("Nota máxima: " + maxima);

        System.out.print("Nota a buscar: ");
        double buscada = sc.nextDouble();
        boolean encontrada = buscarNota(notas, buscada);
        System.out.println("¿Está la nota? " + encontrada);

        sc.close();
    }

    public static void mostrarNotas(double[] notas) {
        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        return suma / notas.length;
    }

    public static int contarAprobados(double[] notas) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                contador++;
            }
        }
        return contador;
    }

    public static double notaMaxima(double[] notas) {
        double max = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }

    public static boolean buscarNota(double[] notas, double buscada) {
        boolean esta = false;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == buscada) {
                esta = true;
            }
        }
        return esta;
    }
}
