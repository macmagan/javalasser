/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número etre 0 e 9.999 para comprobar si é capicua: ");
        int num = sc.nextInt();
        int resto;
        int n_invers = 0;
        int n_aux = num;
        
        while (num != 0) {
        resto = num % 10;
        n_invers = n_invers * 10 + resto;
        num = num / 10;
        }
        
        if (n_invers == n_aux) {
            System.out.println("O número é capicua");
        } else {
            System.out.println("O número non é capicua");
        }
        
    }
}
