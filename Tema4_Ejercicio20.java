/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio20 {

    public static void main(String[] args) {
        
        //Variables
        int[][] numeros = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {10, 20, 30, 40}
        };

        //Mostrar todos los elementos
        System.out.println("\nMatriz: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        //Mostrar el número de filas y columnas
        System.out.println("\n2. Dimensiones:");
        System.out.println("Filas: " + numeros.length);
        System.out.println("Columnas: " + numeros[0].length);

        //Mostrar el elemento de la segunda fila y tercera columna
        System.out.println("\n3. Elemento fila 2, columna 3: " + numeros[1][2]);

        //Modificar el elemento de la primera fila y primera columna
        numeros[0][0] = 99;
        System.out.println("\n4. Nuevo valor en fila 1, columna 1: " + numeros[0][0]);

        //Calcular la suma de todos los elementos
        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                sumaTotal = sumaTotal + numeros[i][j];
            }
        }
        System.out.println("\n5. Suma total de todos los elementos: " + sumaTotal);

        // Ampliación.
        System.out.println("\n--- Ampliación: Suma por filas ---");
        for (int i = 0; i < numeros.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < numeros[i].length; j++) {
                sumaFila = sumaFila + numeros[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }
    }
}