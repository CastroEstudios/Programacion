/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arimeticafacil;

/**
 *
 * @author 1damba*/
import java.util.Scanner;
public class OperacionConNumeroPorTeclado {

    /**5
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este codigo hace una operacion simple
      Scanner entradateclado;
        entradateclado = new Scanner(System.in);
      System.out.println("Escriba un número");
      int numero1;
        numero1 = entradateclado.nextInt();
      System.out.println("Escriba otro número");
      int numero2;
        numero2=entradateclado.nextInt();
      int resultado;  
        resultado=numero1+numero2;
      System.out.println(numero1+" + "+numero2+" = "+resultado);
    }
}