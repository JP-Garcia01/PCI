package joão.pedro.garcia.prova;

import static lerexibir.Console.*;
//import static lerexibir.Janela.*;

public class LetraG {
    
    public static void main(String[] args) {
        int n1;
        int n2;
        int base = 1;
        for (n1=0; n1<=15; n1++){
            if(n1 == 0){
                exibir(" " +" 3 elevado por " + n1 + " = 1 \n");
            }  
            else if(n1 == 1){
                exibir(" " +" 3 elevado por " + n1 + " = 3 \n");
            }   
            else{
              for(n2=1; n2 <= n1; n2++){
                  base *= 3;   
              }  
              exibir(" " +" 3 elevado por " + n1 + " = " + base + "\n");
            }
            base = 1;   
        }    
    }//main
}//class