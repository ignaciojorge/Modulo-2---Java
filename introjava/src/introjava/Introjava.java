/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Introjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingresa un número");
        num1 = leer.nextInt();
        System.out.println("Ingresa otro número");
        num2 = leer.nextInt();
        
        if (num1 >= 25 || num2 >= 25){
        System.out.println("Uno o ambos números son igual o mayores a 25");
        }else{
        System.out.println("Ninguno de los números es igual o mayor a 25");
        
        //Hola como estas
        }
    }
    
}
