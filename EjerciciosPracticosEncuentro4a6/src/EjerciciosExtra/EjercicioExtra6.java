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
public class EjercicioExtra6 {

    /*
     Leer la altura de N personas y determinar el promedio de estaturas que
     se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
     general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas que mediran su estatura.");
        int n = leer.nextInt();
        double estatura, est_general,est_160;
        int contadorGeneral = 0;
        int contador160 = 0;
        est_general = 0;
        est_160 = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura de la persona n°" + n);
            estatura = leer.nextDouble();
            est_general = est_general + estatura;
            contadorGeneral++;
            if(estatura<1.60){
                est_160 = est_160 + estatura;
                contador160++;
            }
        }
        
        System.out.println("Promedio de estatura general: " + est_general/contadorGeneral + "mts");
        System.out.println("Promedio de estatura por debajo de 1.60mts: " + est_160/contador160 + "mts");
    }
    
}
