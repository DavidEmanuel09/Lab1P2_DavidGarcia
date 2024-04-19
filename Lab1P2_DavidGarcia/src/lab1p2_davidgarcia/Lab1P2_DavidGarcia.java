/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_davidgarcia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Lab1P2_DavidGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fila 3, silla 5
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> medianas = new ArrayList();
        System.out.println("ingrese tamaño de la matriz: ");
        int num = scanner.nextInt();
        //se encierra al usuario hasta que cumpla con los parametros
            while(num % 2 == 0 || num <= 4){
                System.out.println("el numero debe ser impar y mayor a 4: "); 
                num = scanner.nextInt();
        }
            //se llena la matriz con numeros random del 0 al 9
         int[][] matriz = new int[num][num];   
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = random.nextInt(10);
                }
        }
            //se imprime la matriz
            System.out.println("Matriz Generada: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println("");
        }
            System.out.println("");
            //ordenar cada elemento de la matriz
            ordenarRecursivo(matriz,0,0,0);
            System.out.println("matriz ordenada: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println("");
        }
            //este codigo imprime el arreglo de las medianas de cada fila
            System.out.println("");
            System.out.println("Arreglo de medianas: ");
            for (int i = 0; i < matriz.length; i++) {
            int medio = matriz[i][matriz[i].length/2];
                    medianas.add(medio);
        }
            for (int i = 0; i < medianas.size(); i++) {
                System.out.print("["+medianas.get(i)+"]");
        }
          System.out.println("");
          System.out.println("arreglo de medianas ordenado: ");
          for (int i = 0; i < medianas.size()-1; i++) {
              for (int j = 0; j < medianas.size()-1-i; j++) {
                  if (medianas.get(j)>medianas.get(j+1)) {
                      int media = medianas.get(j);
                      medianas.set(j, medianas.get(j+1));
                      medianas.set(j+1,media);
                      
                  }
              }
        }
         
          for (int i = 0; i < medianas.size(); i++) {
                System.out.print("["+medianas.get(i)+"]");
          }
          System.out.println("");
           int num_media = medianas.size()/2;
           System.out.println("mediana de las medianas: "+medianas.get(num_media));
    }
    public static void ordenarRecursivo(int[][] matriz,int i, int j, int k){
        if ( i < matriz.length) {
            if (j < matriz[i].length-1) {
                if (k < matriz.length - j -1) {
                     if (matriz[i][k] > matriz[i][k +1]) {
                            int valor_reserva = matriz[i][k];
                            matriz[i][k] = matriz[i][k+1];
                            matriz[i][k + 1] = valor_reserva;
                        }
                     ordenarRecursivo(matriz,i,j,k+1);
                  k++;  
                }else{
                    ordenarRecursivo(matriz,i,j+1,0);
                }
                j++;
            }else{
                ordenarRecursivo(matriz,i+1,0,0);
            }
            i++;
        }
    }
    
    
}
