/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class EjercicioExtra4 {

    /*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
    muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int num = leer.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Equivalente a número romano: I");
                break;
            case 2:
                System.out.println("Equivalente a número romano: II");
                break;
            case 3:
                System.out.println("Equivalente a número romano: III");
                break;
            case 4:
                System.out.println("Equivalente a número romano: IV");
                break;
            case 5:
                System.out.println("Equivalente a número romano: V");
                break;
            case 6:
                System.out.println("Equivalente a número romano: VI");
                break;
            case 7:
                System.out.println("Equivalente a número romano: VII");
                break;
            case 8:
                System.out.println("Equivalente a número romano: VIII");
                break;
            case 9:
                System.out.println("Equivalente a número romano: IX");
                break;
            case 10:
                System.out.println("Equivalente a número romano: X");
                break;
            default:
                System.out.println("Su número tiene que ser entre 1 y 10. Vuelva a intentarlo.");
        }
    }
    
}
