package aula10;

import java.util.Scanner;

public class exer05 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre o maior deles.
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Entre com um número: ");
        num1 = scan.nextInt();
        
        System.out.println("Entre com outro número: ");
        num2 = scan.nextInt();
        
        System.out.println("Entre com outro número: ");
        num3 = scan.nextInt();
        
        if (num1>num2 && num1>num3){
            System.out.println(num1 + " é o maior número");
        } else if (num2>num1 && num2>num3){
            System.out.println(num2 + " é o maior número");
        } else {
            System.out.println(num3 + " é o maior número");
        }
        
        scan.close();
    }
}
