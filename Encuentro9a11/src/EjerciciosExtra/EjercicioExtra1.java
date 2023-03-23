/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño que quiere para el vector.");
        int n = leer.nextInt();
        int suma = 0;
        int[]vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del vector en la posición ["+i+"]");
            vector [i] = leer.nextInt();
            suma += vector [i];
        }
        
        System.out.println("La suma de todos los valores ingresados es igual a: "+suma);
    }
    
}
