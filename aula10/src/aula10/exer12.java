
package aula10;

import java.util.Scanner;


public class exer12 {
    public static void main(String[] args) {
        /*Faça um programa que leia as duas notas parciais obtidas por um aluno
        numa disciplina ao longo de um semestre, e calcule a sua média.
        A atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento Conceito
        Entre 9.0 e 10.0 A
        Entre 7.5 e 9.0 B
        Entre 6.0 e 7.5 C
        Entre 4.0 e 6.0 D
        Entre 4.0 e zero E*/
        
        Scanner scan = new Scanner(System.in);
        double nota1, nota2;
        double media;
        
        
        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = scan.nextDouble();
        
        media = (nota1 + nota2)/2;
        
        if (media>=9 && media<=10){
            System.out.println("Parabéns, a média do aluno é: " + media);
            System.out.println("Seu conceito é A!");
        } else if(media>=7.5 && media<9){
            System.out.println("A média do aluno é: " + media);
            System.out.println("Seu conceito é B!");
        } else if(media>=6 && media<7.5){
            System.out.println("A média do aluno é: " + media);
            System.out.println("Seu conceito é C!");
        } else if(media>=4 && media<6){
            System.out.println("A média do aluno é: " + media);
            System.out.println("Seu conceito é D!");
        } else {
            System.out.println("A média do aluno é: " + media);
            System.out.println("Seu conceito é F!");
        }
        
        scan.close();
    }
}
