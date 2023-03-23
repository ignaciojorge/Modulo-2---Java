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
public class Ejercicio12 {

    /*
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
    usuario, validando que el primer número múltiplo del segundo e imprima si el
    primer número es múltiplo del segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el valor de dos números:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1,num2);
    }
    
    public static void EsMultiplo(int num1, int num2){
        if((num1%num2)== 0){
            System.out.println("El primer número es múltiplo del segundo.");
        }else{
            System.out.println("Los números no son multiplos entre sí.");
        }
    }
}
