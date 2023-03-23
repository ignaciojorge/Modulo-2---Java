/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPracticos;

import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
 */
public class EjercicioPractico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String cadena;
        String letra1;
        String letra2;
        int correcto = 0;
        int incorrecto = 0;
        
        System.out.println("Ingrese una palabra de 5 caracteres de largo");
        cadena = leer.next();
        letra1 = cadena.substring(0,1);
        letra2 = cadena.substring(3,4);
   
        do{
            if (cadena.length() == 5){
                
                if(letra1.equals("X") && letra2.equals("O")){
                    correcto++;
                }else{
                    incorrecto++;
                }
            }else{
                incorrecto++;
            }
            
            System.out.println("Ingrese otra palabra de 5 caracteres");
            cadena = leer.next();
            
        }while(!cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de lecturas correctas es de: " + correcto);
        System.out.println("La cantidad de lectucas incorrectas es de: " + incorrecto);
    }
    
}
