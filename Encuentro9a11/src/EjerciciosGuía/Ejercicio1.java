/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuía;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas que compone su equipo");
        int num = leer.nextInt();
        String[] integrantes = new String[num]; 
        
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre de un integrante.");
            integrantes[i] = leer.next();
        }
        for (int i = 0; i < num; i++) {
            System.out.println(i+1 +"-"+integrantes[i]+".");
        }
    }
    
}
