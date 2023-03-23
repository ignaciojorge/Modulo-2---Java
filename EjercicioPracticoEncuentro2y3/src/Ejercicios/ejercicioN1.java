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
public class ejercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1,num2,suma;
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        num2 = leer.nextInt();
        suma = num1 + num2;
        
        System.out.println("La suma de los dos números es igual a: " + suma);
        
    }
    
}
