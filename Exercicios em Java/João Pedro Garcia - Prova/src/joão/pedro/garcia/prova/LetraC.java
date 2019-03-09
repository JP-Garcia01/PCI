package joão.pedro.garcia.prova;

import static lerexibir.Console.*;
//import static lerexibir.Janela.*;

public class LetraC {
    
    
    public static void main(String[] args) {
        int x;
        int soma = 0;    
        for (x=1; x<=100; x++){
            soma += x;        
        }
        exibir("Soma = " + soma);
    }//main
}//class
