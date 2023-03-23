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
public class EjercicioExtra11 {

    /*
     Escribir un programa que lea un número entero y devuelva el número de
     dígitos que componen ese número. Por ejemplo, si introducimos el
     número 12345, el programa deberá devolver 5. Calcular la cantidad de
     dígitos matemáticamente utilizando el operador de división. Nota:
     recordar que las variables de tipo entero truncan los números o
     resultados.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int contador = 0;
        
        do{
           num=num/10;
           contador++;
        }while(num>0);
        
        System.out.println("La cantidad de dígitos del número ingresado es: " + contador);
    }
    
}
