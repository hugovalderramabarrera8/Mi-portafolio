/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double suma = 0;
        int contador = 0;
        
        System.out.println("Introduce los números (puedes separarlos por espacios).");
        System.out.println("Cuando termines, escribe cualquier letra o pulsa Enter y finaliza para ver el promedio:");
        
        // El bucle lee números mientras la entrada sea un número válido
        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            suma += numero;
            contador++;
        }
        
        // Verificamos que se haya introducido al menos un número para evitar división por cero
        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("\nHas introducido " + contador + " números.");
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se introdujo ningún número válido.");
        }
        
        scanner.close();
    }
}
