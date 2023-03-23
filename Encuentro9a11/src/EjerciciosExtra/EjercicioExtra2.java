/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño que quiere para el vector.");
        int n = leer.nextInt();
        int[]vector_A= new int[n];
        int[]vector_B= new int[n];
        int contador = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del vector_A en la posición ["+i+"]");
            vector_A [i] = leer.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del vector_B en la posición ["+i+"]");
            vector_B [i] = leer.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if(vector_A[i] != vector_B[i]){
                System.out.println("Los vectores no son iguales.");
                break;
            }else{
                contador++;
            }
        }
        
        if(contador==n){
            System.out.println("Los vectores son iguales.");
        }
    }
    
}
