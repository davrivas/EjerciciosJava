/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

import java.util.Scanner;


/**
 *
 * @author davrivas
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Colegio colegio = new Colegio();
        int menu = 0;
        
        System.out.println("Bienvenido al colegio los angeles");
        
        while (true) {
            System.out.println("Digite 1 para ingresar alumno");
            System.out.println("Digite 2 para mostrar alumnos");
            System.out.println("Otro número para salir");
            menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu) {
                case 1:
                    String nombre = "", apellido = "";
                    int edad = 0;
                    double[] notas = new double[3];
                    
                    System.out.println("Digite el nombre del estudiante:");
                    nombre = scanner.nextLine();
                    System.out.println("Digite el apellido del estudiante:");
                    apellido = scanner.nextLine();
                    System.out.println("Digite la edad del estudiante:");
                    edad = scanner.nextInt();
                    
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Digite la nota " + (i+1) + ":");
                        notas[i] = scanner.nextDouble();
                    }
                    
                    colegio.agregarEstudiantes(nombre, apellido, edad, notas);
                    break;
                case 2:
                    colegio.listarAlumnos();
                    break;
                default:
                    System.out.println("Gracias por usar este software");
                    System.exit(0);
            }
        }
    }
}
