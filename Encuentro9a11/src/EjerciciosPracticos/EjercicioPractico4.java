/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

/**
 *
 * @author Ignacio
 */
public class EjercicioPractico4 {

    /*
    Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios
    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
    A se denota por B y se obtiene cambiando sus filas por columnas (o
    viceversa).
     */
    
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        System.out.println("Matriz incial:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");

        int aux;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;

            }

        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
