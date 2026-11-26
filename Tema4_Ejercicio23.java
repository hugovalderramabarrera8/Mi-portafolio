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

public class Tema4_Ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.next();

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.next();

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.next();

        //Nombre completo con Espacio.
        String completo = nombre + " " + apellido1 + " " + apellido2;
        
        System.out.println("Nombre completo: " + completo);
        System.out.println("Total de caracteres: " + completo.length());

        // Ampliación.
        System.out.println("En mayusculas: " + completo.toUpperCase());
        System.out.println("En minusculas: " + completo.toLowerCase());
        System.out.println("Original intacto: " + completo);

        sc.close();
    }
}
