/*Hacer un programa que lea un vector de números enteros y luego imprima 
la cantidad de números mayores de 10 que hay en el */

package com.mycompany.vectores;

import java.util.Random;
import java.util.Scanner;

/**
 * @author luistorresco
 */
public class Vectores {

    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        Random rnd=new Random();
        int n, cont=0;
        System.out.print("ingrese cantidad de elementos del vector");
        n=objread.nextInt();
        //declarar el vector
        int[] numeros=new int [n];
        for (int i = 0; i < n-1; i++) {
            numeros[i]=rnd.nextInt(20);
            if (numeros[i]>10) {
               cont++;
            }
        }
            //verificacion
            for (int i = 0; i < n; i++) {
                System.out.println(numeros[i]+ " ");
            }
            System.out.println("\n la cantidad de numeros mayores de 10 es " + cont);
        }
    }
