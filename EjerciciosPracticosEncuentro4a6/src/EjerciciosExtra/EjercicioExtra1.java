/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los minutos que desea transfromar en días");
        int min = leer.nextInt();
        int dias = 0;
        int horas = 0;
        
        while (min>0){
            if (min>=1440){
                dias = dias + +1;
                min = min - 1440;
            }else{
                if(min>=60){
                    horas = horas + 1;
                    min = min - 60;
                }
            }
        }
        
        System.out.println("Los minutos ingresados equivalen a: " + dias + " día/s y " + horas + " hora/s.");
    }
    
}
