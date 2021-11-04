
package aula10;

import java.util.Scanner;


public class exer08 {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte em que turno você estuda.
        Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/
        
        Scanner scan = new Scanner(System.in);
        String turno;
        
        System.out.println("Informe a letra correspondente ao turno em quevocê estuda.(M-matutino ou V-Vespertino ou N- Noturno): ");
        turno = scan.next();
        
        if (turno.equalsIgnoreCase("m")){
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("v")){
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("n")){
            System.out.println("Boa noite!");
        } else {
            System.out.println("Opção inválida!");
        }
        
        scan.close();
    }
}
