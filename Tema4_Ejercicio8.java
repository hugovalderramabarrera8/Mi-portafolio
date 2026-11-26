/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio8 {
    public static void main(String[] args) {
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
// 1. Mostrar originales
        System.out.println("Originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
        
        // 2. Subir un 5%
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * 1.05;
        }
        
        // 3. Mostrar actualizados
        System.out.println("Nuevos precios:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
        
        // 4. Media
        double suma = 0;
        for (int i = 0; i < precios.length; i++) {
            suma = suma + precios[i];
        }
        double media = suma / precios.length;
        System.out.println("Media: " + media);
        
        // 5. Mayores de 15
        int cont = 0;
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > 15) {
                cont++;
            }
        }
        System.out.println("Mayores de 15: " + cont);
    }
}
    
    
    

