/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_davidgarcia;

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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese tamaño de la matriz: ");
        int num = scanner.nextInt();
            while(num % 2 == 0 || num <= 4){
                System.out.println("el numero debe ser impar y mayor a 4: "); 
                num = scanner.nextInt();
        }
         int[][] matriz = new int[num][num];   
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j] = random.nextInt(10);
                }
        }
            System.out.println("Matriz Generada: ");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println("");
        }
            
    }
    
}
