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
public class EjercicioPractico6 {

    /*
     Realizar un programa que pida dos números enteros positivos por
     teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
     una opción y el programa deberá mostrar el resultado por pantalla y
     luego volver al menú. El programa deberá ejecutarse hasta que se elija la
     opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     vez de salir del programa directamente, se debe mostrar el siguiente
     mensaje de confirmación: ¿Está seguro que desea salir del programa
     (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
     contrario se vuelve a mostrar el menú.
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int suma;
        int resta;
        int mult;
        int div;
        String opcion2 = "N";
        int opcion;
        
        System.out.println("Ingresa un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        
        do{
            
        System.out.println("Menú");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("¿Qué opción desea realizar?");
        opcion = leer.nextInt();
        
            switch(opcion){
                case 1:
                    suma = num1 + num2;
                    System.out.println("El resultado de la suma es : " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("El resultado de la resta es : " + resta);
                    break;
                case 3:
                    mult = num1 * num2;
                    System.out.println("El resultado de la multiplicación es : " + mult);
                    break;
                case 4:
                    div = num1 / num2;
                    System.out.println("El resultado de la división es : " + div);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                    opcion2 = leer.next();
                    break;
            }
        
        }while(opcion2.equals("N"));
    }
    
}
