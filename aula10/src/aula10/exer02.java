
package aula10;

import java.util.Scanner;
public class exer02 {
    public static void main(String[] args) {
        //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        Scanner scan = new Scanner(System.in);
        int num;
        
        System.out.println("Entre com um número: ");
        num = scan.nextInt();
        
        if(num>=0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        
        scan.close();
    }
}
