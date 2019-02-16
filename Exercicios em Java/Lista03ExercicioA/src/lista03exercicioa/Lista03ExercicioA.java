package lista03exercicioa;

import static lista03exercicioa.LerExibir.*;

public class Lista03ExercicioA {
    
    //static final String NOME_APP = "CONVERTER 5000"; //static final o valor nao pode ser mais alterado
    public static void main(String[] args) {
        int opcao = lerInt(
                "Qual opção abaixo você deseja de conversão?\n"+
                "1 - Celsius para Fahrenheit\n" + 
                "2 - Fahrenheit para Celsius\n"
        );
        
        double graus = lerDouble(
                "Digite temperatura desejada"
        );
        
        double conversao = 0.0;
        
        switch(opcao){
            case 1:
             conversao = (9 * graus + 160)/5;
             break;
             
            case 2:
             conversao = ((graus - 32) * 5) / 9;
             
             default:
             conversao = Double.MAX_VALUE;
        };
        
        exibir(
                "O valor digitado é " + (conversao == Double.MAX_VALUE ? "[ERRO]" : "" + conversao)
        );
        
    }// main
        
    
}//class
