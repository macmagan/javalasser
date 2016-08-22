/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora: ");
        int hora = sc.nextInt();
        System.out.println("Introduce un minuto: ");
        int min = sc.nextInt();
        System.out.println("Introduce un segundo: ");
        int seg = sc.nextInt();

        seg = seg + 1;
        if (seg >= 59) {
            min = min + 1;
            seg = 0;
            if (min >= 60) {
                min = 0;
                hora = hora + 1;
            }
        }
        System.out.println("A hora aumentada en un segundo é:\n" + hora + ":" + min + ":" + seg);
    }
}
