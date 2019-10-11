/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author davrivas
 */
public abstract class Animal {
    protected double peso;
    protected double tamano;
    protected String nombre;
    
    public Animal(double peso, double tamano, String nombre) {
        this.peso = peso;
        this.tamano = tamano;
        this.nombre = nombre;
    }
    
    public abstract void rugir();
    
    public void caminar() {
        System.out.println("El animal camina");
    }
}
