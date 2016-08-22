/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DAme o radio: ");
        float r = sc.nextFloat();
        double a = Math.PI * Math.pow(r, 2);
        System.out.println("O área do circulo con radio " + r + " é " + a);
    }
    
}
