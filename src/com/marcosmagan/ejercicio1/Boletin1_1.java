/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcosmagan.ejercicio1;

import com.marcosmagan.ejercicio1.ui.Ventana;
import java.io.Console;
import java.util.Scanner;
import com.marcosmagan.java.utils.Entrada;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;



public class Boletin1_1 {

    public Boletin1_1() {
//        int a = 0, b = 0, c = 0;
//        Scanner s = new Scanner(System.in);
//        if (s != null) {
//            System.out.println("Valor del coeficiente de a ");
//            a = s.nextInt();
//            
//            System.out.println("Valor del coeficiente de b ");
//            b = s.nextInt();
//            
//            System.out.println("Valor del coeficiente de c ");
//            c = s.nextInt();
//            
//            
//            
//            s.close();
//            System.out.println("El valor del coeficiente es: " + a);
//        }
        
        Ventana v = new Ventana();
        v.setVisible(true);

    }

    public static void main(String args[]) {
        /*Suggested Code*/   
         try {

          for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
             UIManager.setLookAndFeel(info.getClassName());
                        System.out.println("CHOSEN THIS");
              break;
         }
         else{
                    UIManager.setLookAndFeel  ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
          }
        }

        } catch (Exception e) {
        // If Nimbus is not available, you can set to another look and feel.
//            Cant get it to compile or work.

}
        
        
        new Boletin1_1();
    }

}
