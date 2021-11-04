
package aula10;

import java.util.Scanner;
//erro identificado a ser corrigido: sempre que o resultado é decimal, o programa acusa como sendo ímpar.

public class exer16 {
    public static void main(String[] args) {
        /*Faça um Programa que leia 2 números e em seguida pergunte ao usuário
        qual operação ele deseja realizar. O resultado da operação deve ser
        acompanhado de uma frase que diga se o número é:
        ● par ou ímpar;
        ● positivo ou negativo;
        ● inteiro ou decimal;*/
        
        Scanner scan = new Scanner(System.in);
        double num1, num2, resultado;
        String option;
        
        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        num2 = scan.nextDouble();
        System.out.println("Informe a opção desejada: ");
        System.out.println("Para somar, digite 1");
        System.out.println("Para subtrair, digite 2");
        System.out.println("Para multiplicar, digite 3");
        System.out.println("Para dividir, digite 4");
        option = scan.next();
        
        switch(option){
            case "1": //soma
                resultado = num1 + num2;
                //mostrar o resultado
                System.out.println("A soma dos números " + num1 + " e " + num2 + " é igual a " + resultado);
                //mostrar se o resultado é par ou impar
                if (resultado%2 == 0){
                    System.out.println("O resultado da operação é par!");
                } else {
                    System.out.println("O resultado da operação é impar!");
                }
                //mostrar se o resultado é positivo ou negativo
                if(resultado>=0) {
                    System.out.println("O resultado da operação é positivo");
                } else {
                    System.out.println("O resultado da operação é negativo");
                }
                //mostrar se o resultado é inteiro ou decimal
                if (resultado%1 == 0){
                    System.out.println("O resultado da operação é um número inteiro!");
                } else {
                    System.out.println("O resultado da operação é um número decimal!");
                }
                break;
            case "2": //subtração
                resultado = num1 - num2;
                //mostrar o resultado
                System.out.println("A subtração dos números " + num1 + " e " + num2 + " é igual a " + resultado);
                //mostrar se o resultado é par ou impar
                if (resultado%2 == 0){
                    System.out.println("O resultado da operação é par!");
                } else {
                    System.out.println("O resultado da operação é impar!");
                }
                //mostrar se o resultado é positivo ou negativo
                if(resultado>=0) {
                    System.out.println("O resultado da operação é positivo");
                } else {
                    System.out.println("O resultado da operação é negativo");
                }
                //mostrar se o resultado é inteiro ou decimal
                if (resultado%1 == 0){
                    System.out.println("O resultado da operação é um número inteiro!");
                } else {
                    System.out.println("O resultado da operação é um número decimal!");
                }
                break;
            case "3": //multiplicação
                resultado = num1 * num2;
                //mostrar o resultado
                System.out.println("A multiplicação dos números " + num1 + " e " + num2 + " é igual a " + resultado);
                //mostrar se o resultado é par ou impar
                if (resultado%2 == 0){
                    System.out.println("O resultado da operação é par!");
                } else {
                    System.out.println("O resultado da operação é impar!");
                }
                //mostrar se o resultado é positivo ou negativo
                if(resultado>=0) {
                    System.out.println("O resultado da operação é positivo");
                } else {
                    System.out.println("O resultado da operação é negativo");
                }
                //mostrar se o resultado é inteiro ou decimal
                if (resultado%1 == 0){
                    System.out.println("O resultado da operação é um número inteiro!");
                } else {
                    System.out.println("O resultado da operação é um número decimal!");
                }
                break;
            case "4": //divisão
                resultado = num1 / num2;
                //mostrar o resultado
                System.out.println("A divisão do número " + num1 + " pelo número " + num2 + " é igual a " + resultado);
                //mostrar se o resultado é par ou impar
                if (resultado%2 == 0){
                    System.out.println("O resultado da operação é par!");
                } else {
                    System.out.println("O resultado da operação é impar!");
                }
                //mostrar se o resultado é positivo ou negativo
                if(resultado>=0) {
                    System.out.println("O resultado da operação é positivo");
                } else {
                    System.out.println("O resultado da operação é negativo");
                }
                //mostrar se o resultado é inteiro ou decimal
                if (resultado%1 == 0){
                    System.out.println("O resultado da operação é um número inteiro!");
                } else {
                    System.out.println("O resultado da operação é um número decimal!");
                }
                break;
            default:
                System.out.print("Opção inválida, tente novamente.");
                break;
        }
        
        
        scan.close();
    }
}
