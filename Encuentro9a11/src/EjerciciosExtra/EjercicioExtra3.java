/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

/**
 *
 * @author Ignacio
 */
public class EjercicioExtra3 {

    /*
    Crear una función rellene un vector con números aleatorios, pasándole
    un arreglo por parámetro. Después haremos otra función o
    procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        int[] vector = new int[3];
        
        rellenar(vector);
        imprimir(vector);
    }

    public static void rellenar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9);
        }
    }
    
    public static void imprimir (int[]vector){
        String aux = "";
        for(int elemento: vector){
            aux= aux+" "+elemento;
        }
        System.out.println(aux);
    }

}
