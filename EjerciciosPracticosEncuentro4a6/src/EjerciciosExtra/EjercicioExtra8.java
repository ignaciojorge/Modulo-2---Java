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
public class EjercicioExtra8 {

    /*
     Escriba un programa que lea números enteros. Si el número es múltiplo
     de cinco debe detener la lectura y mostrar la cantidad de números
     leídos, la cantidad de números pares y la cantidad de números impares.
     Al igual que en el ejercicio anterior los números negativos no deben
     sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        int contador = 0;
        int cont_par = 0;
        int cont_impar = 0;
        
        do{
            System.out.println("Ingrese un valor.");
            num = leer.nextInt();
            if(num%2==0){
                cont_par++;
            }else{
                cont_impar++;
            }
            contador++;
        }while(num%5!=0);
        
        System.out.println("La cantidad de números ingresados es de: " + contador);
        System.out.println("La cantidad de números impares es de: " + cont_impar);
        System.out.println("La cantidad de números pares es de: " + cont_par);
    }
    
}
