/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String[] palabra = new String [5];
        char[][] sopa = new char[20][20];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra (que contenga entre 3 y 5 letras)");
            palabra[i] = leer.next().toUpperCase();
            while(palabra[i].length() < 3 || palabra[i].length()> 5){
                System.out.println("Debe ingresa una palabra entre 3 y 5 letras.");
                palabra[i] = leer.next();
            }
        }
        
        for (int i = 0; i < palabra.length; i++) {
            for (int j = 0; j < palabra[i].length(); j++) {
                sopa[i][j] = palabra[i].charAt(j);
                System.out.print(sopa[i][j]);
            }
            System.out.println("");
        }
    }
    
}
