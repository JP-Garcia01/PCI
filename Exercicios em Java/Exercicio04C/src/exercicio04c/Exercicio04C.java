package exercicio04c;

//import static lerexibir.Console.*;
import static lerexibir.Janela.*;

public class Exercicio04C {
    
    static final double NOTA_MIN = 5.0;
    static final String MENSAGEM_APROVA = "APROVADO ;)";
    static final String MENSAGEM_REPROVA = "REPROVADo :(";
    
    public static void main(String[] args) {
        double nota1 = lerDouble("Digite a nota do 1ºBim.: ");
        double nota2 = lerDouble("Digite a nota do 2ºBim.: ");
        double nota3 = lerDouble("Digite a nota do 3ºBim.: ");
        double nota4 = lerDouble("Digite a nota do 4ºBim.: ");
        
        double media  = (nota1 + nota2 + nota3 + nota4) / 4.0;
        
        exibir(
                "Situação Final: " +
                        (media >= NOTA_MIN ? MENSAGEM_APROVA : MENSAGEM_REPROVA) + 
                        "\nMédia Final: " + media
        );
    }//main

}//class
