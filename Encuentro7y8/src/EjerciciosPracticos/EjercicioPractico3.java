/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros que desea convertir a otra moneda.");
        double valor = leer.nextDouble();
        
        System.out.println("Ingrese el tipo de moneda a la que desea convertir los euros ingresados.");
        System.out.println("A. Dolar");
        System.out.println("B. Libra");
        System.out.println("C. Yen");
        String moneda = leer.next().toUpperCase();
        switch(moneda){
            case "A":
                Cambio(valor,moneda);
                break;
            case "B":
                Cambio(valor,moneda);
                break;
            case "C":
                Cambio(valor,moneda);
                break;
        }
        
    }
    
    public static void Cambio(double valor, String moneda){
        if(moneda.equals("A")){
            valor *= 0.86;
            System.out.println("La cantidad de euros ingresados equivale a $" + valor);
        }else{
            if(moneda.equals("B")){
                valor *= 1.28611;
                System.out.println("La cantidad de euros ingresado equivale a £" + valor);
            }else{
                if(moneda.equals("C"))
                 valor *= 129.852;
                System.out.println("La cantidad de euros ingresados equivale a ¥" + valor);
            }
        }
    }
}
