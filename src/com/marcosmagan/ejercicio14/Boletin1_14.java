/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio14;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_14 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce unha nota de 0 a 10: ");
        int nota = sc.nextInt();
           
        if (nota >= 0 && nota <= 2) {
            System.out.println("Tes un moi deficiente.");
        } else if (nota < 5) {
            System.out.println("Tes un insuficiente, ¡ casi !");

        } else if (nota < 6) {
            System.out.println("Tes un suficente");

        } else if (nota < 7) {
            System.out.println("Tes un ben.");
        } else if (nota < 9) {
            System.out.println("Tes un notable.");
        } else if (nota <= 10) {
            System.out.println("Tes un sobresainte");
        } else {
            System.out.println("A nota introducida non é válida");
        }
    }
}
