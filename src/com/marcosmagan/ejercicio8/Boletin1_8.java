/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce outro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número introducido " + num1 + " é maior que o segundo número introducido " + num2);
        } else if (num1 < num2) {
            System.out.println("O primeiro número introducido " + num1 + " é menor que o segundo número introducido " + num2);
        } else if (num1 == num2) {
            System.out.println("O primeiro número introducido " + num1 + " ten o mesmo valor que o segundo número introducido " + num2);
        } else {
            System.out.println("Os datos introducidos non son correctos");
        }
    }
}
