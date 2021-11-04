
package aula10;

import java.util.Scanner;
public class exer03 {
    public static void main(String[] args) {
        /* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Conforme a letra, escrever: F - Feminino, M - Masculino, Sexo inválido*/
        Scanner scan = new Scanner(System.in);
        String letra;
        
        System.out.println("Entre com uma opção (f ou m):" );
        letra = scan.next();
        
        if (letra.equalsIgnoreCase("f")){
            System.out.println("Feminino");
        } else if (letra.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        } else {
            System.out.println("Opção inválida");
        }
        
        scan.close();
    }
}
