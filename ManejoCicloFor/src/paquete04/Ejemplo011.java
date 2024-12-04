/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete01.*;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
       int num1 = 1;
       int num2 = 1;
       int limite1;
       int limite2;
       
       String cadena = "";
       
        System.out.println("Ingrese el limite de su tabla");
        limite1 = entrada.nextInt();
        System.out.println("Ingrese hasta que tabla desea operar");
        limite2 = entrada.nextInt();
        
        
       while(num1 <= limite1){
           while(num2 <= limite2){
                int resultado = num1 * num2;
                cadena = String.format("%s%d * %d = %d\n",
                   cadena,
                   num1,
                   num2,
                   resultado);
                 num2 = num2 + 1;
       }
           num2 = 1;
           num1 = num1 + 1;
       }
        System.out.printf("%s",
                cadena);
       
        
        
    }
}          





       


