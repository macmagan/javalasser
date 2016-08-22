/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número enteiro para \nrealizar a sua táboa de multiplicación: ");
        int num = sc.nextInt();
        int i = 0;
        System.out.println("----------Do While-----------");
        do {
            int result = i * num;
            System.out.println(num + " x " + i + " = " + result);
            i++;
        } while (i <= 10);
        System.out.println("---------While------------");
        i = 0;
        while (i <= 10) {
            int result = i * num;
            System.out.println(num + " x " + i + " = " + result);
            i++;

        }
        System.out.println("----------for-----------");
        for (int j = 0; j <= 10; j++) {
            int result = j * num;
            System.out.println(num + " x " + j + " = " + result);
        }
        System.out.println("------------------------------------");

        int[] a;
        a = new int[10];
        for (int k = 0; k < 10; k++) {
            System.out.println("Introduce un número: ");
            int num1 = sc.nextInt();
            a[k] = num1;

        }
        System.out.println("Resultado com +1 e -1 alternativamente: ");

        for (int k = 0; k < 10; k++) {
            if (a[k] % 2 == 0) {
                System.out.println(a[k] + 1);
            } else {
                System.out.println(a[k] - 1);
            } 
        }
    }
}
