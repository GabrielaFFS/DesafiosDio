import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner (System.in);

        System.out.println("Por favor, digite o valor do salário :");
        float valorSalario = leitorDeEntradas.nextFloat();


        System.out.println("Por favor, digite o valor dos benefícios:");
         float valorBeneficios = leitorDeEntradas.nextFloat();



        float valorImposto=0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05f * valorSalario;
        }

        else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10f * valorSalario;

        } else {
            valorImposto = 0.15f * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

        leitorDeEntradas.close();
    }
}      
