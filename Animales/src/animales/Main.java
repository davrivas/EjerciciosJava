/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import java.util.Scanner;

/**
 *
 * @author davrivas
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el peso nombre del animal");
        double peso = scanner.nextDouble();
        System.out.println("Digite el tamaño del animal");
        double tamano = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite el nombre del animal");
        String nombre = scanner.nextLine();
        System.out.println("Digite 1 si es gato o 2 si es perro");
        int tipo = scanner.nextInt();
        Animal animal = null;
        switch (tipo) {
            case 1:
                animal = new Gato(peso, tamano, nombre);
                break;
            case 2:
                animal = new Perro(peso, tamano, nombre);
                break;
            default:
                System.out.println("Error");
                break;
        }
        
        animal.caminar();
        animal.rugir();
    }
}
