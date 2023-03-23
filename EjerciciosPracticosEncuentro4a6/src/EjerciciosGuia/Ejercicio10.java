/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Ejercicio10 {

    /*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
    el número ingresado seguido de tantos asteriscos como indique su valor.
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingresa un número");
       int num = leer.nextInt();
       int contador = 1;
       
       do{
           for (int i = 1; i < num+1; i++) {
            System.out.println(num + "*");
        }
           contador++;
                   
       }while (contador<5);
        
 
    }
    
}
