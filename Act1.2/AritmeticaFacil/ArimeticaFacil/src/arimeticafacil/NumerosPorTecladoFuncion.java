package arimeticafacil;

import java.util.Scanner;

public class NumerosPorTecladoFuncion {
    
    public static int sum(int numero1, int numero2)  {
        return numero1+numero2;
    }

    public static void main(String[] args) {
    System.out.println("Escriba un número");
    Scanner TecladoNumero;
    TecladoNumero=new Scanner(System.in);
    int numero1;
        numero1 = TecladoNumero.nextInt();
    System.out.println("Escriba otro número");
    int numero2;
        numero2 = TecladoNumero.nextInt();
    int resultado;
        resultado=sum(numero1, numero2);
    System.out.println(resultado);
    }
}
