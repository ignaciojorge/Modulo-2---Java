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
public class EjercicioPractico3 {

    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de
    1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos  
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector.");
        int n = leer.nextInt();

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = (int) (Math.random() * 100000);

            if (num[i] < 10) {
                contador1++;
            } else {
                if (num[i] > 9 && num[i] < 100) {
                    contador2++;
                } else {
                    if (num[i] > 99 && num[i] < 1000) {
                        contador3++;
                    } else {
                        if (num[i] > 999 && num[i] < 10000) {
                            contador4++;
                        } else {
                            if (num[i] > 9999 && num[i] < 100000) {
                                contador5++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Cantidad de números de 1 dígito: " + contador1);
        System.out.println("Cantidad de números de 2 dígito: " + contador2);
        System.out.println("Cantidad de números de 3 dígito: " + contador3);
        System.out.println("Cantidad de números de 4 dígito: " + contador4);
        System.out.println("Cantidad de números de 5 dígito: " + contador5);
    }

}
