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
public class EjercicioExtra7 {

    /*
    Realizar un programa que complete un vector con los N primeros
    números de la sucesión de Fibonacci. Recordar que la sucesión de
    Fibonacci es la sucesión de los siguientes números:
    1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    Donde cada uno de los números se calcula sumando los dos anteriores a
    él.
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int N = leer.nextInt();
        int[] fibonacci = new int[N];
        
        fibo(fibonacci,N);

    }

    public static void fibo(int[]vector,int num) {

        int siguiente = 1;
        int actual = 1;
        int temporal = 0;

        for (int i = 0; i < num; i++) {
            if (i < 2) {
                vector[i] = 1;
            } else {
                temporal = actual;
                actual = siguiente;
                siguiente = siguiente + temporal;
                vector[i] = siguiente;
            }
            
            if(i==num-1){
                System.out.print(vector[i]);
            }else{
                System.out.print(vector[i]+", ");
            }

        }
        System.out.println("");
    }

}
