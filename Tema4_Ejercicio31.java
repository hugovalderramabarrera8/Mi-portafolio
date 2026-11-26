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

public class Tema4_Ejercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un correo electronico: ");
        String correo = sc.nextLine().trim().toLowerCase();

        int posArroba = correo.indexOf("@");
        boolean tieneArroba = posArroba != -1;
        boolean tienePuntoDespues = tieneArroba && correo.indexOf(".", posArroba) != -1;
        boolean sinEspacios = !correo.contains(" ");

        System.out.println("\nCorreo limpio: " + correo);
        System.out.println("Contiene @: " + tieneArroba);
        System.out.println("Contiene punto despues de @: " + tienePuntoDespues);
        System.out.println("No contiene espacios: " + sinEspacios);

        if (tieneArroba) {
            String usuario = correo.substring(0, posArroba);
            String dominio = correo.substring(posArroba + 1);
            System.out.println("Usuario: " + usuario);
            System.out.println("Dominio: " + dominio);
        } else {
            System.out.println("No se puede separar usuario y dominio porque falta @.");
        }

        sc.close();
    }
}

