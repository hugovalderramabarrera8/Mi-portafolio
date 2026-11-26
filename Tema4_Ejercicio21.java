/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author 20_1DAW
 */
public class Tema4_Ejercicio21 {
    
    //Ampliacion.
    public static double MediaAlumno(double[][] notas, int numAlumno) {
        int fila = numAlumno - 1;
        double suma = 0;
        for (int j = 0; j < notas[fila].length; j++) {
            suma = suma + notas[fila][j];
        }
        return suma / notas[fila].length;
    }
    
    public static void main(String[] args) {
        double[][] notas = {
            {7.0, 8.0, 6.0},
            {4.0, 5.0, 6.0},
            {9.0, 8.5, 10.0},
            {5.0, 6.0, 7.0},
        };
        
        //Mostar todas las notas poniendo alumno y evaulacion.
        System.out.println("Notas de la clase:");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Alumno " + (i+1) + ", Evaluacion " + (j + 1) + ": " + notas[i][j]);
            }
        }
        
        //Calcular la media de cada Alumno.
        System.out.println("\n2. Media poe Alumno:");
        for (int i = 0; i < notas.length; i++) {
             double SumaAlumno = 0;
             for (int j = 0; j < notas[i].length; j++) {
                 SumaAlumno = SumaAlumno + notas[i][j];
             }
             double media = SumaAlumno / notas[i].length;
             System.out.println("Alumno " + (i + 1) + ": " + media);
         }
   // 3. Calcular la media de cada evaluación (recorriendo primero columnas j y luego filas i)
        System.out.println("\n3. Media por evaluación:");
        int numEvaluaciones = notas[0].length;
        for (int j = 0; j < numEvaluaciones; j++) {
            double sumaEval = 0;
            for (int i = 0; i < notas.length; i++) {
                sumaEval = sumaEval + notas[i][j];
            }
            double mediaEval = sumaEval / notas.length;
            System.out.println("Evaluación " + (j + 1) + ": " + mediaEval);
        }

        // 4. Mostrar la nota más alta de toda la matriz
        double maxNota = notas[0][0];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > maxNota) {
                    maxNota = notas[i][j];
                }
            }
        }
        System.out.println("\n4. Nota más alta de la clase: " + maxNota);

        // Prueba de la ampliación
        System.out.println("\n--- Ampliación: Media de un alumno concreto ---");
        int alumnoConsultado = 3;
        System.out.println("Media del alumno " + alumnoConsultado + ": " + MediaAlumno(notas, alumnoConsultado));
    }
}
