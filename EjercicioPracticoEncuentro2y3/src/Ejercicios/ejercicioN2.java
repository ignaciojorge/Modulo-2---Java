/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class ejercicioN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nom = new Scanner (System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = nom.next();
        System.out.println("Su nombre es: " + nombre);
    }
    
}
