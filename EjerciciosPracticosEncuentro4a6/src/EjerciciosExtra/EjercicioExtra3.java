/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Ignacio
 */
public class EjercicioExtra3 {

    /*
    Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
    trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
    la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        if (toUpperCase(letra).equals("A") || toUpperCase(letra).equals("E") || toUpperCase(letra).equals("I") || toUpperCase(letra).equals("O") || toUpperCase(letra).equals("U")){
            System.out.println("Su letra es una vocal.");
        }else{
            System.out.println("Su letra no es una vocal.");
        }
    }
    
}
