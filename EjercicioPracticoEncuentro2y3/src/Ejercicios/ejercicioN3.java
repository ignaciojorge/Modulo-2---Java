/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Ignacio
 */
public class ejercicioN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner frase = new Scanner (System.in);
        String frase1;
        System.out.println("Ingrese una frase");
        frase1 = frase.next();
        
        System.out.println(toLowerCase (frase1));
        System.out.println(toUpperCase (frase1));
    }
    
}
