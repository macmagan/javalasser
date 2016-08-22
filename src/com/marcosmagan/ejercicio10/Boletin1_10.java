/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce outro número: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce outro número: ");
        int num3 = sc.nextInt();
        int aMenor, bMenor, cMenor, a, b, c;
        if (num1 > num2) {
            if (num3 > num1) {
                a = num3;
                b = num1;
                c = num2;
            } else if (num2 > num3) {
                a = num1;
                b = num2;
                c = num3;
            } else {
                a = num1;
                b = num3;
                c = num2;
            }
        } else if (num3 > num2) {
            a = num3;
            b = num2;
            c = num1;
        } else if (num3 > num1) {
            a = num2;
            b = num3;
            c = num1;
        } else {
            a = num2;
            b = num1;
            c = num3;
        }
        System.out.println("Números ordenados de mayor a menor " + a + ", "+ b + ", "+ c);
    }
  
}
