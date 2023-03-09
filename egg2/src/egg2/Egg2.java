/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg2;

import java.util.Scanner;

/**
 *
 * @author ayele
 */
public class Egg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que lea un número entero
por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Escriba un numero");
        num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        System.out.println(" la raiz del numero es " + Math.sqrt(num));
        System.out.println("El doble del numero es " + doble + "El triple del numero es" + triple);
        
        
           
        
        
    }
    
}
