package joão.pedro.garcia.prova;

import static lerexibir.Console.*;
//import static lerexibir.Janela.*;

public class LetraF {
    
    public static void main(String[] args) {
        int x;
        for(x=1; x<200; x++){
            if(x%4 == 0  && x < 200){
                exibir(" " + x + " é divisível por 4 e menor que 200");
            }
        } 
        
    }//main
}//class