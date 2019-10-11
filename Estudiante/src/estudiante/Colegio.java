/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davrivas
 */
public class Colegio {
    List<Estudiante> estudiantes;
    
    public Colegio() {
        estudiantes = new ArrayList<>();
    }
    
    public void agregarEstudiantes(String nombre, String apellido, int edad, double[] notas) {
        Estudiante estudiante = new Estudiante(nombre, apellido, edad, notas);
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado");
    }
    
    public void listarAlumnos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay alumnos registrados");
        } else {
            double[] notas  = new double[3];
            System.out.println("Estudiantes");
            
            for (int i = 0; i < estudiantes.size(); i++) {
                notas = estudiantes.get(i).getNotas();
                
                System.out.println("Nombre: " + estudiantes.get(i).getNombre());
                System.out.println("Apellido: " + estudiantes.get(i).getApellido());
                System.out.println("Edad: " + estudiantes.get(i).getEdad());
                System.out.println("Promedio: " + estudiantes.get(i).getPromedio(notas));
                
                if(estudiantes.get(i).getPromedio(notas) < 7) {                     
                    System.out.println("El estudiante no aprobó");
                } else {
                    System.out.println("El estudiante aprobó");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
