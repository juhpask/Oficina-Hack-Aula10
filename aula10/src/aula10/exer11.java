
package aula10;

import java.util.Scanner;


public class exer11 {
    public static void main(String[] args) {
        /*Faça um Programa que leia um número e exiba o dia correspondente da semana.
        (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.*/
        
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Informe um número de 1 a 7: ");
        num = scan.nextInt();
        
        switch (num){
            case 1:
                System.out.println("O dia 1 da semana representa o Domingo");
                break;
            case 2:
                System.out.println("O dia 2 da semana representa a Segunda-Feira");
                break;
            case 3:
                System.out.println("O dia 3 da semana representa a Terça-Feira");
                break;
            case 4:
                System.out.println("O dia 4 da semana representa a Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia 5 da semana representa a Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia 6 da semana representa a Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia 7 da semana representa o Sábado");
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
                
        scan.close();
    }
}
