/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o día do 1 0 30: ");
        int dia = sc.nextInt();
        System.out.println("Introduce o mes do 1 o 12: ");
        int mes = sc.nextInt();
        System.out.println("Introduce agora o ano: ");
        int ano = sc.nextInt();
        if (ano > 1978 && ano < 2017) {
            if (mes > 0 && mes <= 7 && mes != 2 && mes % 10 == 0) {
                if (dia > 0 && dia < 31) {
                } else {
                    System.out.println("El dia no es correcto.");
                }
            } else if (mes > 0 && mes <= 7 && mes != 2 && mes % 10 != 0) {
                if (dia > 0 && dia < 32) {
                } else {
                    System.out.println("El dia no es correcto.");
                }
            } else if (mes == 2) {
                if (dia > 0 && dia < 29) {
                } else {
                    System.out.println("El dia no es correcto.");
                }
            } else if (mes > 7 && mes < 13 && mes % 10 == 0) {
                if (dia > 0 && dia < 32) {
                } else {
                    System.out.println("El día no es correcto.");
                }
            } else if (mes > 7 && mes < 13 && mes % 10 != 0) {
                if (dia > 0 && dia < 31) {
                } else {
                    System.out.println("El día no es correcto.");
                }
            }
        } else {
            System.out.println("El año no es correcto.");
        }
    }
}
