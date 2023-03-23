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
public class EjercicioExtra4 {

    /*
    Los profesores del curso de programación de Egg necesitan llevar un
    registro de las notas adquiridas por sus 10 alumnos para luego obtener
    una cantidad de aprobados y desaprobados. Durante el período de
    cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
    evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el
    arreglo. Al final del programa los profesores necesitan obtener por
    pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
    que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
    notas del curso.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] notas = new int[10][4];
        double[] promedios = new double[10];
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < 10; i++) {
               
            System.out.println("Ingrese las notas del alumno N°" + i);
            System.out.println("Primer trabajo práctico evaluativo:");
            notas[i][0] = leer.nextInt();
            System.out.println("Segundo trabajo práctico evaluativo:");
            notas[i][1] = leer.nextInt();
            System.out.println("Primer Integrador:");
            notas[i][2] = leer.nextInt();
            System.out.println("Segundo Integrador:");
            notas[i][3] = leer.nextInt();

            double prom = (notas[i][0] * 0.1) + (notas[i][1] * 0.15) + (notas[i][2] * 0.25) + (notas[i][3] * 0.5);
            promedios[i] = prom;
            
            if(prom >= 7){
                aprobados++;
            }else{
                desaprobados++;
            }
        }
        
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de desaprobados: "+desaprobados);
    }

}
