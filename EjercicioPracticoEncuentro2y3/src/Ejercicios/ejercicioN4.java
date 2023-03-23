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
public class ejercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double cent;
        double far;
        System.out.println("Ingrese los grados centigrados");
        cent = leer.nextDouble();
        far = 32 + (9*cent/5);
        
        System.out.println("La conversión de los grados centigrados a farenheit equivalen a :" + far + "°");
    }
    
}
