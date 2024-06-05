package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Joao"};
        System.out.println(" Imprimindo a lista de candidatos informando o índice do elemento");
 
        for ( int indice = 0; indice < candidatos.length; indice ++){
     
    
    System.out.println ("O candidato de n " + (indice+1)  + " é " + candidatos [indice]);
    }
    System.out.println ("Forma abreviada de interação for each");
     for (String candidato : candidatos) {
        System.out.println (" O candidato selecionado foi " + candidato);
     }

} 

    static void selecaoCandidatos (){
String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Joao", "Gustavo", "Monica", " Fabricia", "Marcela", "Luan"};
int candidatosSelecionados= 0 ; 
int candidatosAtual= 0;
double salarioBase = 2000.00;

while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
    String candidato = candidatos [candidatosAtual];
    double salarioPretendido = valorPretendido();

    System.out.println( "O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
    if (salarioBase >= salarioPretendido){
        System.err.println( " O candidato " + candidato + " foi selecionado para a vaga!");
        candidatosSelecionados ++;
}
    candidatosAtual++;
}
}
 static double valorPretendido () {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
 }
    static void analisarCandidato (double salarioPretendido){
    double salarioBase = 2000.00;
    if (salarioPretendido < salarioBase){
        System.out.println ("LIGAR PARA O CANDIDATO");
    }

    else if (salarioPretendido == salarioBase){
        System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    }
    else
    System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
}


       
       
       
       
        
}
