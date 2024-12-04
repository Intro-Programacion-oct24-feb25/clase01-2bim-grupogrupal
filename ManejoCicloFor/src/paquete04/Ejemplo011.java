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
       int num= 1;
       int num2 =1;
       int resultado = 0;
       Scanner entrada = new Scanner(System.in);
       int tabla;
       System.out.println("Hasta que tabla quiere multiplicar");
       tabla = entrada.nextInt();
       System.out.println("Hasta que tabla quiere multiplicar");
       int limite1 = entrada.nextInt();
       while(num <= limite1){
           while(num2<=tabla){
               resultado =  num * num2;
               
               System.out.printf("%s * %s = %s\n",
                       num,
                       num2,
                       resultado);
                      num2 =+ + 1;

       }
                      num2 =1;
                      num = num + 1;
          
       }
       System.out.printf("%s * %s = %s\n",
                       num,
                       num2,
                       resultado);
    }
    
}
    
       


