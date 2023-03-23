/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class EjercicioPractico2 {

    /*
    Realizar un algoritmo que llene un vector de tamaño N con valores
    aleatorios y le pida al usuario un número a buscar en el vector. El
    programa mostrará dónde se encuentra el numero y si se encuentra
    repetido
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int contador = 0; //contador que sirve para las repeticiones.
        
        int[] num = new int [n];//creo el vector.
        
        for (int i = 0; i < n; i++) {
            num[i]= (int)(Math.random()*10); //asigna valores aleatorios a cada posición del vector.
        }
        
        System.out.println("¿Qué número desea buscar?");
        int n2 = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if(n2 == num[i]){
                
                System.out.println("El número "+n2+" se encuentra en la posición "+i);
                contador++;
            }
            
        }
        System.out.println("El número "+n2+" se repitió "+contador+" veces.");
    }
    
}
