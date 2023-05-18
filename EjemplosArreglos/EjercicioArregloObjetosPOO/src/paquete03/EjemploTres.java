/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class EjemploTres {
    public static void main(String[] args) {
        
        Profesor profesor1 = new Profesor("Alex","Privado");
        Profesor profesor2 = new Profesor("Ama","Privado");
        
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación", profesor1), 
            new Calificacion(9, "Electrónica", profesor2)};
        
//        Profesor profesor1 = new Profesor("Alex","Privado");
//        calificaciones[0].establecerProfesor(profesor1);
//        
//        Profesor profesor2 = new Profesor("Ama","Privado");
//        calificaciones[1].establecerProfesor(profesor1);
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f con progesor %s\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(), 
                    objetoCalificacion.obtenerProfesor().obtenerNombre());
        }
        
    }
}
