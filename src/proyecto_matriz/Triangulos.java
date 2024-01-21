/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_matriz;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Triangulos {
 
     public void Ingresar(int matriz[][], int fila, int columna) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
             matriz[i][j] = sc.nextInt();
            }
        }

    }
    public  void ImprimirTrianguloA(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     public  void ImprimirTrianguloB(int matriz[][]) {
        for (int i = matriz.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     }
    
}
