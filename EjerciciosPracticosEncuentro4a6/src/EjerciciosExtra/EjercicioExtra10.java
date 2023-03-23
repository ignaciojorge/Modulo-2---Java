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
public class EjercicioExtra10 {

    /*
    Realice un programa para que el usuario adivine el resultado de una
    multiplicación entre dos números generados aleatoriamente entre 0 y 10.
    El programa debe indicar al usuario si su respuesta es o no correcta. En
    caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
    su respuesta nuevamente. Para realizar este ejercicio investigue como
    utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int aleatorio1 =(int) (Math.random()*10);
        int aleatorio2 =(int) (Math.random()*10);
        int resultado = aleatorio1 * aleatorio2;
        
        System.out.println("Adivine el resultado de la multiplicacion entre dos numeros aleatorios entre 1 y 10");
        int respuesta = leer.nextInt();
        
        do{
            System.out.println("Incorrecto. Intente otra vez.");
            respuesta = leer.nextInt();
        }while(respuesta!=resultado);
    }
    
}
