/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Ignacio
 */
public class EjercicioExtra5 {

    /*
     Una obra social tiene tres clases de socios:
     ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
     descuento en todos los tipos de tratamientos.
     ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
     descuento para los mismos tratamientos que los socios del tipo A.
     ○ Los socios que menos aportan, los de tipo ‘C’, no reciben
     descuentos sobre dichos tratamientos.
     ○ Solicite una letra (carácter) que representa la clase de un socio, y
     luego un valor real que represente el costo del tratamiento (previo
     al descuento) y determine el importe en efectivo a pagar por dicho
     socio.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese con una letra a qué clase de socio pertenece (A,B o C):");
        String clase = leer.next();
        System.out.println("Ingrese el valor real del tratatiemto que debe llevar a cabo:");
        int trat = leer.nextInt();
        double descuento;
        switch(toUpperCase(clase)){
            case "A":
                descuento = trat*0.5;
                System.out.println("El importe total de su tratamiento con descuento es de: $" + descuento);
                break;
            case "B":
                descuento = trat*0.35;
                System.out.println("El importe total de su tratamiento con descuento es de: $" + descuento);
                break;
            case "C":
                System.out.println("El importe total de su tratamiento es de: $" + trat);
                break;
            default:
                System.out.println("Ingresó una letra invalida. Intentelo de nuevo.");
           
        }
    }
    
}
