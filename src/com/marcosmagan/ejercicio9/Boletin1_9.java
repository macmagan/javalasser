/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce outro número: ");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("Ordenados por orde descendente: " + num1 + "," + num2);
        } else if (num1 < num2) {
            System.out.println("Ordenados por orde descendente: " + num2 + "," + num1);
        } else {
            System.out.println("Ordenados por orde descendente: " + num1 + "," + num2);
        }
    }
}
