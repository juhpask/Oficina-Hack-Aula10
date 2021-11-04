
package aula10;

import java.util.Scanner;


public class exer14 {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número correspondente a um determinado
        ano e em seguida informe se este ano é ou não bissexto.*/
        Scanner scan = new Scanner(System.in);
        int ano;
        
        System.out.println("Informe um ano");
        ano = scan.nextInt();
        
        if( (ano%400 == 0) || (ano%4 == 0) && (ano%100 != 0) ){
            System.out.println("O ano é bissexto!");
        } else {
            System.out.println("O ano não é bissexto!");
        }
        
        scan.close();
    }
}
