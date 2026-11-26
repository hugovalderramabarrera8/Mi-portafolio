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

public class Tema4_Ejercicio26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine().toUpperCase();

        System.out.print("Primer apellido: ");
        String apellido1 = sc.nextLine().toUpperCase();

        System.out.print("Segundo apellido: ");
        String apellido2 = sc.nextLine().toUpperCase();

        char i1 = nombre.charAt(0);
        char i2 = apellido1.charAt(0);
        char i3 = apellido2.charAt(0);

        System.out.println("Iniciales: " + i1 + i2 + i3);

        sc.close();
    }
}
