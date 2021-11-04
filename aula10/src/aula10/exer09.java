
package aula10;

import java.util.Scanner;


public class exer09 {
    public static void main(String[] args) {
        /*Faça um programa que pergunte o preço de três produtos e informe qual
        produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.*/
        
        Scanner scan = new Scanner(System.in);
        double valor1, valor2, valor3;
        
        System.out.println("Informe o valor do primeiro produto: ");
        valor1 = scan.nextDouble();
        System.out.println("Informe o valor do segundo produto: ");
        valor2 = scan.nextDouble();
        System.out.println("Informe o valor do terceiro produto: ");
        valor3 = scan.nextDouble();
        
        if (valor1<valor2 && valor1<valor3){
            System.out.println("O primeiro produto possui o menor valor: " + valor1);
        } else if (valor2<valor1 && valor2<valor3){
            System.out.println("O segundo produto possui o menor valor: " + valor2);
        } else {
            System.out.println("O terceiro produto possui o menor valor: " + valor3);
        }
        
        scan.close();
    }
}
