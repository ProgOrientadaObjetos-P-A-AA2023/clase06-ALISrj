/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;
import paquete01.LibretaCalificacion;
import paquete04.Colegio;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreEstudiante;
        double[] calificacionesEstudiante;
        int numerocalificaciones;

        System.out.println("Ingrese el nombre del Colegio:");
        String nombreC = entrada.nextLine();

        System.out.println("Ingrese la ciudad del Colegio:");
        String ciudad = entrada.nextLine();

        Colegio colegio1 = new Colegio(nombreC, ciudad);

        // Ingreso de valores por teclado
        System.out.println("Ingrese el nombre del estudiante");
        nombreEstudiante = entrada.nextLine();
        System.out.println("Ingrese el número de calificaciones");
        numerocalificaciones = entrada.nextInt();
        // con el numerocalificaciones se crea el objeto arreglo de
        // calificaciones tipo double
        calificacionesEstudiante = new double[numerocalificaciones];

        for (int i = 0; i < numerocalificaciones; i++) {
            System.out.printf("Ingrese calificación %d\n", i + 1);
            calificacionesEstudiante[i] = entrada.nextDouble();
        }

        // con el ingreso del nombre del estudiante y el ingreso del conjunto
        // de calificaciones; se procede a crear el objeto de tipo
        // LibretaCalificacion
        LibretaCalificacion libreta = new LibretaCalificacion(
                nombreEstudiante,
                calificacionesEstudiante, colegio1);
        // Se llama a los métodos que realizan el calculo del
        // promedio y promedio cualitativo
        libreta.establecerPromedio();
        libreta.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", libreta);
    }
}
