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
public class EjercicioExtra2 {

    /*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
    diferente a cada una. A continuación, realizar las instrucciones
    necesarias para que: B tome el valor de C, C tome el valor de A, A tome
    el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
    valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4, AUX;
        System.out.println("Valores iniciales");                                                                  
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        System.out.println("Valores finales");
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C = " + C);
        System.out.println("A toma el valor de D -> A = " + A);
        System.out.println("D toma el valor de B -> D = " + D);    
    }
    
}
