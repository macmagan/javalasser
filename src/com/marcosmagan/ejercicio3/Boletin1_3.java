/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o radio de un círculo: ");
        float r = sc.nextFloat();
        double l = 2 * Math.PI * r;
        System.out.println("A lonxitude da circunferencia é: "+ l);
    }
}
