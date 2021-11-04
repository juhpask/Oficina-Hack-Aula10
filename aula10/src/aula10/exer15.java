
package aula10;

import java.util.Scanner;


public class exer15 {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar.
        Dica: utilize o operador módulo (resto da divisão).*/
        
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Informe um número: ");
        num = scan.nextInt();
        
        if (num%2 == 0){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");
        }
        
        scan.close();
    }
}
