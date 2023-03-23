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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int[][] cuadrado = new int[3][3];
        boolean esMagico = true;
        int sumaMagica = 0;
        
        // Pedir al usuario que ingrese los números del cuadrado
        System.out.println("Ingrese los números del cuadrado mágico:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                cuadrado[i][j] = sc.nextInt();
                
                // Verificar que los números ingresados están entre 1 y 9
                if(cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: debe ingresar números entre 1 y 9.");
                    return;
                }
            }
        }
        
        // Calcular la suma mágica (la suma que deben tener todas las filas, columnas y diagonales)
        sumaMagica = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        
        // Verificar las filas
        for(int i=0; i<3; i++) {
            int sumaFila = 0;
            for(int j=0; j<3; j++) {
                sumaFila += cuadrado[i][j];
            }
            if(sumaFila != sumaMagica) {
                esMagico = false;
                break;
            }
        }
        
        // Verificar las columnas
        for(int j=0; j<3; j++) {
            int sumaColumna = 0;
            for(int i=0; i<3; i++) {
                sumaColumna += cuadrado[i][j];
            }
            if(sumaColumna != sumaMagica) {
                esMagico = false;
                break;
            }
        }
        
        // Verificar la diagonal principal
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        if(sumaDiagonal1 != sumaMagica) {
            esMagico = false;
        }
        
        // Verificar la diagonal secundaria
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if(sumaDiagonal2 != sumaMagica) {
            esMagico = false;
        }
        
        // Mostrar el resultado
        if(esMagico) {
            System.out.println("El cuadrado ingresado es mágico.");
        } else {
            System.out.println("El cuadrado ingresado no es mágico.");
        }
    }
}
    
    

