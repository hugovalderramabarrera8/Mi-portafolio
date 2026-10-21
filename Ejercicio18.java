/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */

public class Ejercicio18 {
    public static void main(String[] args) {

        double[] precios = {10.5, -5.0, 20.0, -1.2, 5.5};

        double total = 0;

        for (double precio : precios) {

            if (precio <= 0) {
                continue;
            }

            total += precio;
        }

        System.out.println("El total de la compra es: " + total);
    }
}
