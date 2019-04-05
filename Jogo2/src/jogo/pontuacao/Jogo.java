package jogo.pontuacao;

import javax.swing.JOptionPane;
import java.util.concurrent.ThreadLocalRandom;

public class Jogo {
    
    public void iniciaJogo(){
        int tipo = ThreadLocalRandom.current() .nextInt(0,3);
        
        for (;;){
            if (tipo==0){
                QuestaoAdi novaQuestao = new QuestaoAdi();
                novaQuestao.criarPergunta();
                novaQuestao.exibirResultado();
                //pontuacao.verificarQuestao(novaQuestao);
                //pontuacao.exibirPontuacao();
            }
            else if (tipo==1){
                QuestaoSub novaQuestao = new QuestaoSub();
                novaQuestao.criarPergunta();
                novaQuestao.exibirResultado();
                //pontuacao.verificarQuestao(novaQuestao);
                //pontuacao.exibirPontuacao();
            }
            else{
                QuestaoMult novaQuestao = new QuestaoMult();
                novaQuestao.criarPergunta();
                novaQuestao.exibirResultado();
                //pontuacao.verificarQuestao(novaQuestao);
                //pontuacao.exibirPontuacao();
            }            
            
            String continuar = JOptionPane.showInputDialog("Deseja continuar? (S) ou (N)");
            if (continuar.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
