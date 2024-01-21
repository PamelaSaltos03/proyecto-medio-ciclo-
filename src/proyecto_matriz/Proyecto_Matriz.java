/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_matriz;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Proyecto_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int _fila, _columna ;
        Scanner sc = new Scanner(System.in);
        Triangulos mat = new Triangulos();
        System.out.println("Ingrese el numero de filas de la matriz");
        _fila = sc.nextInt();
        System.out.println("Ingrese el numero de columna de la matriz");
        _columna = sc.nextInt();
    
     int matriz[][]= new int [_fila][_columna];
     System.out.println("Triangulo A:");
        mat.ImprimirTrianguloA(matriz);
        System.out.println("Triangulo B:");
        mat.ImprimirTrianguloB(matriz);
    
    }
}
