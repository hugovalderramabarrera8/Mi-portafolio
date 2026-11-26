/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
import java.util.Arrays;

public class Tema4_Ejercio4 {

    // Método para intercambiar dos posiciones de un array
    public static void intercambiar(int[] arr, int i, int j) {
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

    public static void main(String[] args) {
        
        // --- 1. ARRAY DE 6 ELEMENTOS ---
        System.out.println("=== ARRAY DE 6 ELEMENTOS ===");
        int[] array6 = {10, 20, 30, 40, 50, 60};
        
        System.out.println("Antes del intercambio:   " + Arrays.toString(array6));
        
        // Intercambios requeridos
        intercambiar(array6, 0, 5); // 1º con último
        intercambiar(array6, 1, 4); // 2º con penúltimo
        intercambiar(array6, 2, 3); // 3º con 4º
        
        System.out.println("Después del intercambio: " + Arrays.toString(array6));
        
        System.out.println();

        // --- 2. AMPLIACIÓN: ARRAY DE 7 ELEMENTOS ---
        System.out.println("=== AMPLIACIÓN: ARRAY DE 7 ELEMENTOS ===");
        int[] array7 = {5, 12, 23, 34, 45, 56, 67};
        
        System.out.println("Antes del intercambio:   " + Arrays.toString(array7));
        
        // Intercambios simétricos (el elemento del medio, índice 3, se queda en su sitio)
        intercambiar(array7, 0, 6); // 1º con último
        intercambiar(array7, 1, 5); // 2º con penúltimo
        intercambiar(array7, 2, 4); // 3º con antepenúltimo
        
        System.out.println("Después del intercambio: " + Arrays.toString(array7));
    }
}