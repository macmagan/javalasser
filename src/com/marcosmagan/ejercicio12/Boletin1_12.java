/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9.999: ");
        int num = sc.nextInt();
        int u, d, dec, c, cen, umi, um;
        
        u = num % 10;
        dec = num / 10;      
        d = dec % 10;
        cen = dec / 10;
        c = cen % 10;
        umi = cen / 10;
        um = umi % 10;
        System.out.println(u + "," + d + "," + c + "," + um);
    }
}
