/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia;

import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */

public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        int suma = 0;
        int contador = 1;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        
        do{
           if (num == 0){
               System.out.println("Se capturó el número cero");
               break; 
           }else{
               if (num > 0){
                   suma = suma + num;
                   contador++;
                   System.out.println(" Ingrese otro número");
                   num = leer.nextInt();
               }else{
                   if (num < 0){
                       contador++;
                       System.out.println("Ingrese otro número");
                       num = leer.nextInt();
                   }
               }
           }
              
        }while (contador < 20);
        
        System.out.println("El resultado de la suma de los número ingresados es: " + suma);
    }
    
}
