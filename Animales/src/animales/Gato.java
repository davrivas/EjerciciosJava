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
public class Gato extends Animal {

    public Gato(double peso, double tamano, String nombre) {
        super(peso, tamano, nombre);
    }

    @Override
    public void rugir() {
        System.out.println("miau");
    }
    
}
