/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a
continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int num;
        int suma = 0;
        do{
            
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma= suma + num;
                    
        }while(suma<=limite);
    }
    
}
