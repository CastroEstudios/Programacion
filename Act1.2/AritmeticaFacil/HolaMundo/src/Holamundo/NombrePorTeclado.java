package Holamundo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1damba*/
import java.util.Scanner;  
public class NombrePorTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola!");
        System.out.println("¿Cómo te llamas?");
        Scanner SiguientePalabra;
        SiguientePalabra = new Scanner(System.in);
        String Nombre = SiguientePalabra.next();
        System.out.println("Hola "+Nombre+"!");
    }
    
}
