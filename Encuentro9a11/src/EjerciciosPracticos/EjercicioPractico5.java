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
public class EjercicioPractico5 {

    /*
    Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su
    propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
    A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
    obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        int[][] matriz_A = new int[4][4];
        int[][] matriz_AT = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_A[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matriz_A[i][j] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_AT[j][i] = matriz_A[i][j];
            }
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + Math.negateExact(matriz_AT[i][j]) + "]");
            }
            System.out.println("");
        }
    }

}
