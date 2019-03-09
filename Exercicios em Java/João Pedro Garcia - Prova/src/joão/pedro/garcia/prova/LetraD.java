package joão.pedro.garcia.prova;

import static lerexibir.Console.*;
//import static lerexibir.Janela.*;

public class LetraD {
    
    
    public static void main(String[] args) {
        int x;
        int soma = 0;
        for (x=1; x<=500; x++){
            if (x%2 == 0){
               soma += x; 
            }        
        } 
        exibir("Soma = " + soma );
    }//main
}//class