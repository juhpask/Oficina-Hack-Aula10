
package aula10;

import java.util.Scanner;
public class exer04 {
    public static void main(String[] args) {
        // Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
        
        Scanner scan = new Scanner(System.in);
        String letra;
        
        System.out.println("Entre com uma letra:" );
        letra = scan.next();
        
        if (letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u") ){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
        
        scan.close();
    }
}
