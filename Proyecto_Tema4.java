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

public class Proyecto_Tema4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nombres = {"Ana", "Carlos", "María", "Pablo", "Lucía"};
        double[] notas = {8.5, 4.2, 9.0, 6.3, 3.8};

        int opcion;

        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    mostrarAlumnos(nombres, notas);
                    break;
                case 2:
                    int aprobados = contarAprobados(notas);
                    int suspensos = notas.length - aprobados;
                    System.out.println("Nota media: " + calcularMedia(notas));
                    System.out.println("Nota maxima: " + calcularMaximo(notas));
                    System.out.println("Nota minima: " + calcularMinimo(notas));
                    System.out.println("Aprobados: " + aprobados);
                    System.out.println("Suspensos: " + suspensos);
                    break;
                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscado = teclado.nextLine().trim();
                    int pos = buscarAlumno(nombres, buscado);
                    if (pos != -1) {
                        System.out.println("Encontrado: " + nombres[pos] + " - " + notas[pos]);
                    } else {
                        System.out.println("No se encuentra el alumno.");
                    }
                    break;
                case 4:
                    mostrarAprobados(nombres, notas);
                    break;
                case 5:
                    System.out.print("Nombre a analizar: ");
                    String texto = teclado.nextLine().trim();
                    analizarNombre(texto);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    public static void mostrarMenu() {
        System.out.println("GESTOR DE ALUMNOS");
        System.out.println("1. Mostrar todos los alumnos");
        System.out.println("2. Mostrar estadisticas de notas");
        System.out.println("3. Buscar alumno por nombre");
        System.out.println("4. Mostrar alumnos aprobados");
        System.out.println("5. Analizar un nombre");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opcion: ");
    }

    public static void mostrarAlumnos(String[] nombres, double[] notas) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i] + " - " + notas[i]);
        }
    }

    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    public static double calcularMaximo(double[] notas) {
        double max = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        return max;
    }

    public static double calcularMinimo(double[] notas) {
        double min = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        return min;
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

    public static int buscarAlumno(String[] nombres, String nombreBuscado) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                return i;
            }
        }
        return -1;
    }

    public static void mostrarAprobados(String[] nombres, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println((i + 1) + ". " + nombres[i] + " - " + notas[i]);
            }
        }
    }

    public static void analizarNombre(String texto) {
        if (texto.length() == 0) {
            System.out.println("Nombre vacío.");
            return;
        }
        System.out.println("Numero de caracteres: " + texto.length());
        System.out.println("Mayusculas: " + texto.toUpperCase());
        System.out.println("Minusculas: " + texto.toLowerCase());
        System.out.println("Primera letra: " + texto.charAt(0));
        System.out.println("Numero de vocales: " + contarVocales(texto));
    }

    public static int contarVocales(String texto) {
        String minusculas = texto.toLowerCase();
        int vocales = 0;
        for (int i = 0; i < minusculas.length(); i++) {
            char c = minusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
}
