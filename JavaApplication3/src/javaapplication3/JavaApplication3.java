/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
            
        Scanner in = new Scanner(System.in);
        
        String palabra = in.nextLine();
        
        int hasta = palabra.length()/2;
        
        boolean esPalimdromo = true;
        
        for (int i = 0, j = palabra.length()-1; i<hasta;i++, j--) {
        
        if (palabra.charAt(i)!=palabra.charAt(j)) {
            esPalimdromo = false;
            break;
        }
        
    }
         System.out.println("La palabra " + palabra + (esPalimdromo? " es " : " no es ") + " Palimdromo");       
    
}

}