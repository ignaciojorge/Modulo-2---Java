/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int edad;
        String nombre,respuesta;       
        
        do{
            System.out.println("Ingrese el nombre de la persona.");
            nombre = leer.next();
            System.out.println("Ingrese la edad de la persona.");
            edad = leer.nextInt();
            
            Comprobar(edad,nombre);
            
            System.out.println("¿Desea ingresar otra persona? SI/NO");
            respuesta = leer.next().toUpperCase();
        }while(respuesta.equals("SI"));
    }
    
    public static void Comprobar(int num, String nom){
        if(num>=18){
            System.out.println(nom + " es mayor de edad.");
        }else{
            System.out.println(nom + " es menor de edad.");
        }
    }
}
