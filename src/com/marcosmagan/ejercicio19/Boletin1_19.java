/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una fecha:\nIntroduce día:");
        int dia1 = sc.nextInt();
        System.out.println("Introduce mes: ");
        int mes1 = sc.nextInt();
        System.out.println("Introduce año: ");
        int ano1 = sc.nextInt();

        System.out.println("Introduce la segunda fecha:\nIntroduce día:");
        int dia2 = sc.nextInt();
        System.out.println("Introduce mes: ");
        int mes2 = sc.nextInt();
        System.out.println("Introduce año: ");
        int ano2 = sc.nextInt();

//        if (dia1 < 31 && dia2 < 31) {
//
//            if (mes1 < 13 && mes2 < 13) {
//
//                if (ano1 < 2017 && ano2 < 2999) {
                    
                    int resultado = (30 - dia1) + (30 * (12 - mes1)) + (360 * (ano2 - ano1-1)) + (30 * (mes2 - 1)) + dia2;
                    System.out.println(resultado + " días.");
//                } else {
//                    System.out.println("Datos incorrectos.");
//                }
//            } else {
//                System.out.println("Datos incorrectos.");
//            }
//
//        } else {
//            System.out.println("Datos incorrectos.");
//        }

    }
}
