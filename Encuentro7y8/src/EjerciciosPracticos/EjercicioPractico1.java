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
public class EjercicioPractico1 {

    /*
    Crea una aplicación que le pida dos números al usuario y este pueda
    elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
    una función para cada operación matemática y deben devolver sus
    resultados para imprimirlos en el main 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos números.");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("¿Qué acción desea realizar a continuación?");
        System.out.println("");
        System.out.println("Menú");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("La suma de los dos números es igual a: " + sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta de los dos números es igual a: " + restar(num1,num2));
                break;
            case 3:
                System.out.println("La multuplicación de los dos números es igual a: " + mult(num1,num2));
                break;
            case 4:
                System.out.println("La división de los dos número es igual a: " + div(num1,num2));
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
    
    public static int sumar(int num1, int num2){
        return num1+num2;
    }
    
    public static int restar(int num1, int num2){
        return num1-num2;
    }
    
    public static int mult(int num1, int num2){
        return num1*num2;
    }
    
    public static double div(int num1, int num2){
        return num1/num2;
    }
}
