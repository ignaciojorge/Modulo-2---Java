/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 */
public class EjercicioPractico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el tamaño que desea para el cuadrado");
        int n = leer.nextInt();
       
        //Linea superior
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        //Centro del cuadrado
        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            for (int j = 0; j < n-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // Linea inferior  
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }
    
}
