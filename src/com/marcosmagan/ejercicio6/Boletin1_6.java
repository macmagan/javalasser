/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resto;
        System.out.println("Introduce un número enteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce un segundo número enteiro: ");
        int num2 = sc.nextInt();
        resto = num1 % num2;
        if (resto == 0) {
            System.out.println("O número" + num1 + " é multiplo de " + num2);
        } else {
            System.out.println("O número" + num1 + " non é multiplo de " + num2);
        }
    }
}
