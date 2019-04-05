package jogo.pontuacao;

import javax.swing.JOptionPane;

public class QuestaoAdi extends Questao {
    
    public QuestaoAdi(){
        this.pontos=1;
    }
    
    
    public void criarPergunta(){
        String respostaTextual = JOptionPane.showInputDialog("Quanto é " +
        this.operador1 + " + " + this.operador2 + "?");
        this.resposta = Integer.parseInt(respostaTextual);
    }
    
    @Override 
    public boolean verificarResposta(){
        if (this.operador1 + this.operador2 == this.resposta){
            return true;
        }
        return false;
    }
}