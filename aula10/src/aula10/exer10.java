
package aula10;

import java.util.Scanner;


public class exer10 {
    public static void main(String[] args) {
        /*Faça um programa para o cálculo de uma folha de pagamento, sabendo que
        os descontos do Imposto de Renda, que depende do salário bruto
        (conforme tabela abaixo) e 3% para o Sindicato, o FGTS corresponde a 11% do Salário Bruto,
        mas não é descontado (é a empresa que deposita).
        O Salário Líquido corresponde ao Salário Bruto menos os descontos.
        O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
        Para o cálculo do desconto do IR:
        ● Salário Bruto até 900 (inclusive) - isento
        ● Salário Bruto até 1500 (inclusive) - desconto de 5%
        ● Salário Bruto até 2500 (inclusive) - desconto de 10%
        ● Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações,
        dispostas conforme o exemplo abaixo.

        Na tabela exemplo o valor da hora é 5 e a quantidade de horas é 220.
        Salário Bruto: (5 * 220) : R$ 1100,00 (-)
        IR (5%) : R$ 55,00 (-)
        INSS (10%) : R$ 110,00
        FGTS (11%) : R$ 121,00
        Total de descontos : R$ 165,00 
        Salário Líquido : R$ 935,00*/
        
        
        //Declarando as variáveis
        Scanner scan = new Scanner(System.in);
        double salarioHora;
        double horasTrab;
        double salarioBruto;
        double IR;
        double INSS;
        double FGTS;
        double descontos;
        double salarioLiq;
        
        
        //Entrada de dados
        System.out.println("Informe o valor do seu salário por hora: ");
        salarioHora = scan.nextDouble();
        System.out.println("Informe a quantidade de horas que foram trabalhadas no mês: ");
        horasTrab = scan.nextDouble();
        
        
        //Cálculos
        salarioBruto = salarioHora * horasTrab;
        if (salarioBruto <= 900){
            IR = 0;
        } else if (salarioBruto>900 && salarioBruto<=1500){
            IR = salarioBruto * 0.05;
        } else if(salarioBruto>1500 && salarioBruto<=2500){
            IR = salarioBruto * 0.1;
        } else {
            IR = salarioBruto * 0.2;
        }
        INSS = salarioBruto * 0.1;
        FGTS = salarioBruto * 0.11;
        descontos = IR+INSS;
        salarioLiq = salarioBruto - descontos;
        
        //Demonstração dos resultados
        System.out.println("Salário Bruto:" + salarioBruto);
        System.out.println("(-) IR: " + IR);
        System.out.println("(-) INSS: " + INSS);
        System.out.println("FGTS: " + FGTS);
        System.out.println("Total de descontos: " + descontos);
        System.out.println("Salário Líquido: " + salarioLiq);
        
        
        
        scan.close();
    }
}
