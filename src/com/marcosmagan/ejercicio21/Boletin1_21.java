/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce unha nota de 0 a 10: ");
        int nota = sc.nextInt();
        String notan = "";
        if (nota == 0) {
            notan = "cero";
            System.out.println("A nota é: " + notan);
        } else if (nota == 1) {
            notan = "un";
            System.out.println("A nota é: " + notan);
        } else if (nota == 2) {
            notan = "dous";
            System.out.println("A nota é: " + notan);
        } else if (nota == 3) {
            notan = "tres";
            System.out.println("A nota é: " + notan);
        } else if (nota == 4) {
            notan = "catro";
            System.out.println("A nota é: " + notan);
        } else if (nota == 5) {
            notan = "cinco";
            System.out.println("A nota é: " + notan);
        } else if (nota == 6) {
            notan = "seis";
            System.out.println("A nota é: " + notan);
        } else if (nota == 7) {
            notan = "sete";
            System.out.println("A nota é: " + notan);
        } else if (nota == 8) {
            notan = "oito";
            System.out.println("A nota é: " + notan);
        } else if (nota == 9) {
            notan = "nove";
            System.out.println("A nota é: " + notan);
        } else if (nota == 10) {
            notan = "dez";
            System.out.println("A nota é: " + notan);
        } else {
            System.out.println("A nota non é correcta.");
        }

    }
}
