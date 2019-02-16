package lista03exercicioa;

import static javax.swing.JOptionPane.*;

public class LerExibir {
    
    public static String nomeApp = "CONVERTER 5000"; //static final o valor nao pode ser mais alterado
    // ctrl + r na varialvel muda ela no projeto todo
    
    public static String ler(Object mensagem){
        return showInputDialog(null, //janela pai
                mensagem, //mensagem
                nomeApp, //titulo
                PLAIN_MESSAGE  //JOptionPane.PLAIN_MESSAGE como ja importamos o JoptionPane so precisamos apagar
            );
        }//ler
        
        public static double lerDouble(Object mensagem){
            return Double.parseDouble(ler(mensagem));
        }//lerDouble
        
        public static int lerInt(Object mensagem){
            return Integer.parseInt(ler(mensagem));
        }//lerInt
        
       public static void exibir(Object mensagem){
           showMessageDialog(null, //janela pai
                mensagem, //mensagem
                nomeApp, //titulo
                PLAIN_MESSAGE
           );
       }//exibir
}
