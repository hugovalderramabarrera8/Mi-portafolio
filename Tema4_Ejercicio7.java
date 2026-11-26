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

public class Tema4_Ejercicio7 {
    public static void main(String[] args) {
      //Solicita las 7 temperaturas.
      Scanner sc = new Scanner(System.in);
      double[] temperaturas = new double[7];
      for (int i = 0; i < temperaturas.length; i++) {
          System.out.println("Introduzca temperatura del dia " + i+1);
          temperaturas[i] = sc.nextDouble();
      }
      //Muestre todas las temperaturas.
      for (int i = 0; i < temperaturas.length; i++) {
           System.out.println("Dia: " + i +1 + " temperaturas: " + temperaturas[i]);
    }
    double suma = 0;
    for (double temperatura : temperaturas) {
        suma += temperatura;
    }
       //Calcule la temperatura media.
      double media = suma / temperaturas.length;
      System.out.println("La media es: " + media);
      
      //Indica temperatura maxima.
      double max = temperaturas[0];
      for (double temp : temperaturas) {
          if (temp > max) {
              max = temp;
              
          }
      }
      //Indica temperatura minima.
      int contador = 0;
      for (double temp : temperaturas) { 
          if (temp > 25) {
              contador++;
              
          }
      }
      System.out.println("Dias con mas de 25");

    }
}