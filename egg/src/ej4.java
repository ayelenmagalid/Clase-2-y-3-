
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayele
 */
public class ej4 {
private static class Scan {

        public Scan() {
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    System.out.println("Ingrese una cantidad de grados centigrados");
    int grados;
    Scanner leer = new Scanner(System.in); 
    grados= leer.nextInt();
    int suma = 32+(9 * grados / 5);
         System.out.println("En grados Farenheit seria "+suma);    
       
}
