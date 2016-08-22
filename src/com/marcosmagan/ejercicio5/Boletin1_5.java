/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número enteiro positivo ou negativo: ");
        int num;
        do {
            num = sc.nextInt();
            if (Math.signum(num) == 1) {
                System.out.println("O número introducido é positivo");
            } else if (Math.signum(num) == 0) {
                System.out.println("O número introducido é 0");
            } else {
                System.out.println("O número introducido é negativo");
            };
        } while(sc.hasNextInt());
    }
}
