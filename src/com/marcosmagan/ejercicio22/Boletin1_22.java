/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Mac
 */
public class Boletin1_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 0 a 99: ");

        int num = sc.nextInt();

        switch (num) {
            case 11:
                System.out.println("Once");
                break;
            case 12:
                System.out.println("Doce");
                break;
            default:
                int unidades = num % 10;
                int decenas = num / 10;

                if (decenas > 0) {
                    switch (decenas) {
                        case 1:
                            System.out.print("dez");
                            break;
                        case 2:
                            System.out.print("vinte");
                    }
                }

                if (unidades > 0) {
                    if (decenas > 0) {
                        System.out.print(" e ");
                    }
                    switch (unidades) {
                        case 1:
                            System.out.println("un");
                            break;
                        case 2:
                            System.out.println("dous");
                    }
                }

        }

//        
//        
//        
//        
//        
//        
//        
//        String decena = "";
//        String unidad = "";
//        String uni0 = "cero";
//        String uni1 = "un";
//        String uni2 = "dous";
//        String uni3 = "tres";
//        String uni4 = "catro";
//        String uni5 = "cinco";
//        String uni6 = "seis";
//        String uni7 = "sete";
//        String uni8 = "oito";
//        String uni9 = "nove";
//        String dec10 = "deza e ";
//        String dec20 = "vinte";
//        String dec30 = "trinta e ";
//        String dec40 = "corenta e ";
//        String dec50 = "cincuenta e ";
//        String dec60 = "seseta e ";
//        String dec70 = "setenta e ";
//        String dec80 = "oitenta e ";
//        String dec90 = "noventa e ";
//        
//        if (num >= 0 && num < 10) {
//            if (num == 0) {
//                unidad = "cero";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 1) {
//                unidad = "un";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 2) {
//                unidad = "dous";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 3) {
//                unidad = "tres";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 4) {
//                unidad = "catro";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 5) {
//                unidad = "cinco";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 6) {
//                unidad = "seis";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 7) {
//                unidad = "sete";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 8) {
//                unidad = "oito";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 9) {
//                unidad = "nove";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 10) {
//                unidad = "dez";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 20) {
//                unidad = "vinte";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 30) {
//                unidad = "trinta";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 40) {
//                unidad = "corenta";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 50) {
//                unidad = "cincuenta";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 60) {
//                unidad = "sesenta";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 70) {
//                unidad = "setenta";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 80) {
//                unidad = "oitenta";
//                System.out.println("A nota é: " + unidad);
//            } else if (num == 90) {
//                unidad = "noventa";
//                System.out.println("A nota é: " + unidad);
//            } else if (num > 10 && num < 20) {
//                System.out.println(dec10);
//            }
//        }
    }
}
