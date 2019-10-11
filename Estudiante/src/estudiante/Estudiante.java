/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author davrivas
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private double[] notas = new double[3];
    
    public Estudiante( String nombre, String apellido, int edad, double[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notas = notas;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double[] getNotas() {
        return notas;
    }
    
    public double getPromedio(double[] notas) {
        double acumulado = 0;
        for (double nota: notas) { // Cada elemento del arreglo notas se llamará nota
            acumulado += nota; // += es lo mismo que acumulado = acumulado + nota
        }
        return acumulado / 3;
    }
}
