/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Ejercicio11 {

    /*
    Escribir un programa que procese una secuencia de caracteres ingresada por 
    teclado y terminada en punto, y luego codifique la palabra o frase ingresada
    de la siguiente manera: cada vocal se reemplaza por el carácter que se 
    indica en la tabla y el resto de los caracteres (incluyendo a las vocales 
    acentuadas) se mantienen sin cambios.
    
    Realice un subprograma que reciba una secuencia de caracteres y retorne la
    codificación correspondiente. Utilice la estructura “según” para la 
    transformación.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra.");
        String cadena = leer.next();
        String frase = convertir(cadena);
        
        System.out.println(frase);
    }
    
    public static String convertir(String cadena){
        String aux =" ";
        String x;
        for (int i = 0; i < cadena.length(); i++) {
            cadena = cadena.substring(i, i+1);
            switch(cadena){
                case "a":
                    aux += "@";
                    break;
                case "e":
                    aux +="#";
                    break;
                case "i":
                    aux += "$";
                    break;
                case "o":
                    aux += "%";
                    break;
                case "u":
                    aux += "*";
                    break;
                default:
                    aux += cadena;
            }
        }
        aux += ".";
        return aux;
    }
}
