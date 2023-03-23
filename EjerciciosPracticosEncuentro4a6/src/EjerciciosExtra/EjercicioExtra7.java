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
public class EjercicioExtra7 {

    /*
     Realice un programa que calcule y visualice el valor máximo, el valor
     mínimo y el promedio de n números (n>0). El valor de n se solicitará al
     principio del programa y los números serán introducidos por el usuario.
     Realice dos versiones del programa, una usando el bucle “while” y otra
     con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("¿Cuánto números desea ingresar?");
        int n = leer.nextInt();
      
        double valor;
        double aux;
        double valor_max = 0;
        double valor_min = 0;
        double valor_total = 0;
        int contador = 0;
        
        do{
            System.out.println("Ingrese un valor");
            valor = leer.nextDouble();
            aux = valor;
            if(valor_min==0 && valor_max==0){
                valor_min=aux;
                valor_max=aux;
            }else{
                if(aux<valor_min){
                    valor_min = aux;
                }else{
                    if(aux>valor_max){
                        valor_max=aux;
                    }
                }
            }
            contador++;
            valor_total = valor_total + valor;
        }while (contador<n);
        
        System.out.println("El valor mínimo ingresado es: " + valor_min);
        System.out.println("El valor máximo ingresado es: " + valor_max);
        System.out.println("El prómedio de los número ingresado es: " + valor_total/n);
    }
    
}
