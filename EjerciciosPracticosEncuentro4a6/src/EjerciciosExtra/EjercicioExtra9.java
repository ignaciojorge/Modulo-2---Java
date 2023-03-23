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
public class EjercicioExtra9 {

    /*
    Simular la división usando solamente restas. Dados dos números enteros
    mayores que uno, realizar un algoritmo que calcule el cociente y el
    residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
    obtener un resultado menor que el divisor, este resultado es el residuo, y
    el número de restas realizadas es el cociente.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número entero mayor que 1");
        int dividendo = leer.nextInt();
        System.out.println("Ingrese otro número entero mayor que 1");
        int divisor = leer.nextInt();
        int aux;
        int cociente = 0;
        do{
            aux = dividendo - divisor;
            dividendo = aux;
            cociente++;
        }while(dividendo>divisor);
        
        System.out.println("El residuo de la division es " + dividendo);
        System.out.println("El cociente de la division es: " + cociente);
    }
    
}
