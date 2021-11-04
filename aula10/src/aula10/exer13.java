
package aula10;

import java.util.Scanner;


public class exer13 {
    public static void main(String[] args) {
        /*Faça um Programa que peça os 3 lados de um triângulo.
        O programa deverá informar se os valores podem ser um triângulo.
        Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
        Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        Triângulo Equilátero: três lados iguais;
        Triângulo Isósceles: quaisquer dois lados iguais;
        Triângulo Escaleno: três lados diferentes;*/
        
        Scanner scan = new Scanner(System.in);
        int lado1, lado2, lado3;
        
        System.out.println("Entre com o primeiro lado");
        lado1 = scan.nextInt();
        System.out.println("Entre com o segundo lado");
        lado2 = scan.nextInt();
        System.out.println("Entre com o terceiro lado");
        lado3 = scan.nextInt();
        
        if( (lado1+lado2>lado3) ||
            (lado2+lado3>lado1) ||
            (lado1+lado3>lado2) ){
            if(lado1==lado2 && lado1==lado3 && lado2==lado3){
                System.out.println("Esse triângulo é equilátero");
            } else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
                System.out.println("Esse triângulo é isósceles");
            } else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
                System.out.println("Esse triângulo é escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
        
        scan.close();
    }
}
