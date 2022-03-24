/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arimeticafacil;

/**
 *
 * @author 1damba
 */
public class ArimeticaFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este codigo hace una operacion simple
        int numero1, numero2, resultado;
        numero1=30;
        numero2=15;
        //Suma//
        resultado=numero1+numero2;
        System.out.println(numero1+" + "+numero2+" = "+resultado);
        resultado=numero1-numero2;
        System.out.println(numero1+" - "+numero2+" = "+resultado);
        resultado=numero1*numero2;
        System.out.println(numero1+" * "+numero2+" = "+resultado);
        resultado=numero1/numero2;
        System.out.println(numero1+" / "+numero2+" = "+resultado);
    }
}