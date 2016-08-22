/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o día do 1 0 30: ");
        int dia = sc.nextInt();
        System.out.println("Introduce o mes do 1 o 12: ");
        int mes = sc.nextInt();
        System.out.println("Introduce agora o ano: ");
        int ano = sc.nextInt();

        if (dia > 0 && dia < 31) {
            if (mes > 0 && mes < 13) {
                if (ano > 1978 && ano < 2017) {
                    System.out.println("A data introducida " + dia + "/" + mes + "/" + ano + " é correcta.");
                    if (dia == 30) {
                        dia = 1;
                    } else {
                        dia = dia + 1;
                    }
                    System.out.println("A data seguinte é: " + dia + "/" + mes + "/" + ano);
                } else {
                    System.out.println("Introduce un ano válido");
                }
            } else {
                System.out.println("Introduce un mes válido.");
            }
        } else {
            System.out.println("Introduce un día válido.");
        }

    }

}
