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

public class Tema4_Ejercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primera palabra: ");
        String pal1 = sc.next();

        System.out.print("Segunda palabra: ");
        String pal2 = sc.next();

        //Si son iguales exactamente
        boolean iguales = pal1.equals(pal2);

        //Si son iguales ignorando mayúsculas y minúsculas
        boolean igualesSinMayus = pal1.equalsIgnoreCase(pal2);

        //Si tienen la misma longitud
        boolean mismaLongitud = pal1.length() == pal2.length();

        System.out.println("\n¿Son iguales? " + iguales);
        System.out.println("¿Son iguales ignorando mayúsculas? " + igualesSinMayus);
        System.out.println("¿Tienen la misma longitud? " + mismaLongitud);

        // Ampliación.
        boolean mismoInicio = pal1.charAt(0) == pal2.charAt(0);
        System.out.println("¿Empiezan por el mismo carácter? " + mismoInicio);

        sc.close();
    }
}
