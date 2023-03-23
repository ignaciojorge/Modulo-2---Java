/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class ejercicioN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        int num;
        System.out.println("Ingrese un número entero");
        num = numero.nextInt();
        int doble = num*2; 
        int triple = num*3;
        int cuadrado = (int) Math.sqrt(num);
        
        System.out.println("El doble del número ingresado es: " + doble);
        System.out.println("El triple del número ingresado es: " + triple);
        System.out.println("El cuadrado del número ingresado es: " + cuadrado);
        
    }
    
}
