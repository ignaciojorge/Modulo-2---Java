/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
 */
public class EjercicioPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número entero.");
        int num = leer.nextInt();
        boolean aux = Primo(num);
        
        if(aux==true){
            System.out.println("El número es primo.");
        }else{
            System.out.println("El número no es primo.");
        }
    }
    
    public static boolean Primo(int num){
        boolean aux;
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                contador++;
            }
        }
        
        if(contador==2){
            aux = true;
        }else{
            aux = false;
        }
        return aux;
    }
    
}
