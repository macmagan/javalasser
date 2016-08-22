/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9.999: ");
        int num = sc.nextInt();
       
        int ci = (int)Math.log10(num)+1;
        System.out.println("El número de cifras es "+ ci);

    }
    
}
