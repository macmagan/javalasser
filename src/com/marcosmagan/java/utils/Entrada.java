package com.marcosmagan.java.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author lasser216
 */
public class Entrada {

    public static String leeString() {
        String texto = "";
        InputStreamReader fluxo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(fluxo);
        try {
            texto = teclado.readLine();
        } catch (Exception e) {
            System.err.append(e.toString());
        }
        return texto;
    }

    public static int leeInt() {
        return Integer.parseInt(Entrada.leeString());
    }

    public static long leeLong() {
        return Long.parseLong(Entrada.leeString());
    }

    public static float leeFloat() {
        return Float.parseFloat(Entrada.leeString());
    }

    public static double leeDouble() {
        return Double.parseDouble(Entrada.leeString());
    }

    public static boolean leeBoolean() {
        return Boolean.parseBoolean(Entrada.leeString());
    }

    public static char leeChar() {
        return Entrada.leeString().charAt(0);
    }
}
