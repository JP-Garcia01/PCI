package nivel05;
import static lerexibir.Janela.*;
import nivel05.telas.Abertura;
import nivel05.telas.CriarContato;
public class Executavel {
    public static void main(String[] args) {
        Abertura tela1 = new Abertura();
        tela1.setVisible(true);
        
        CriarContato tela2 = new CriarContato();
        
        tela1.proximaJanela = tela2;
        tela2.janelaAnterior = tela1;
        
       
       
      

    }//méto main
    
}//class
