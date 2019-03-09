package joão.pedro.garcia.prova;

import static lerexibir.Console.*;
//import static lerexibir.Janela.*;

public class LetraH {
    
    public static void main(String[] args) {
        int base = lerInt("Digite a Base: ");
        int exp = lerInt("Digite o Expoente: ");
        int n1;
        int baseNum = 1;

        if(exp == 0){
            exibir(" " + baseNum + " elevado por " + exp + " = 1 \n");
        }  
        else if(exp == 1){
            exibir(" " + baseNum + " elevado por " + exp + " = " + baseNum + "\n");
        }   
        else{
          for(n1=1; n1 <= exp; n1++){
              baseNum *= baseNum;   
          } 
          exibir(" " +" 3 elevado por " + n1 + " = " + baseNum + "\n");
        }
    }//main
}//class