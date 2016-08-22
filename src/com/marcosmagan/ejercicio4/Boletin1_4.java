/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número enteiro: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce un número enteiro: ");
        int num2 = sc.nextInt();

        if (num2 == num1) {
            System.out.println("Os valores introducidos son iguais");
        } else {
            System.out.println("Os valores introducidos son distintos");
        }
    }
}
