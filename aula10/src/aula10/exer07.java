package aula10;

import java.util.Scanner;

public class exer07 {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre-os em ordem decrescente.
        
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Entre com um número: ");
        num1 = scan.nextInt();
        System.out.println("Entre com outro número: ");
        num2 = scan.nextInt();
        System.out.println("Entre com outro número: ");
        num3 = scan.nextInt();
        
        
       
        
        if (num1>num2 && num1<num3){
            System.out.println("A ordem decrescente dos números é: " + num3 + ", " + num1 + ", "  + num2);
        } else if (num1>num3 && num1<num2){
            System.out.println("A ordem decrescente dos números é: " + num2 + ", " + num1 + ", "  + num3);
        } else if (num2>num1 && num2<num3){
            System.out.println("A ordem decrescente dos números é: " + num3 + ", " + num2 + ", " + num1);
        } else if (num2>num3 && num2<num1){
            System.out.println("A ordem decrescente dos números é: " + num1 + ", " + num2 + ", "  + num3);
        } else if (num3>num2 && num3<num1){
            System.out.println("A ordem decrescente dos números é: " + num1 + ", " + num3 + ", " + num2);
        } else if (num3>num1 && num3<num2){
            System.out.println("A ordem decrescente dos números é: " + num2 + ", " + num3 + ", " + num1);
        }
        
        
        scan.close();
    }
}
