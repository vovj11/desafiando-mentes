package org.acme.jogo;

import org.acme.jogador.Jogador;
import org.acme.questionario.Questionario;
import org.acme.util.CadastroUtil;


import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private List<Jogador> jogadores;
    private List<Questionario> perguntas;

    public Jogo(){
        this.perguntas = Questionario.listaDeQuestoes();
        this.jogadores = CadastroUtil.cadastroJogador();
    }
    public void iniciarJogo(){
        for(Jogador jogador : jogadores){
            System.out.println("Vez do jogador: "+jogador.getNome());

            for(Questionario pergunta : perguntas){
                System.out.println(pergunta.getPergunta());

                for(String alternativa : pergunta.getAlternativas()){
                    System.out.println(alternativa);
                }

                Scanner scanner = new Scanner(System.in);
                int alternativaSelecionada = scanner.nextInt();

                if(alternativaSelecionada == pergunta.getAlternativaCorreta()){
                    System.out.println("Certa resposta!");
                    jogador.setPontuacao(jogador.getPontuacao()+1);
                } else {
                    System.out.println("A resposta está errada!");
                }
            }
        }
        mostrarPosicoes();
    }
    private void mostrarPosicoes(){
        System.out.println("\nPosições dos jogadores:");

        jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());

        int posicao = 1;

        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogadorAtual = jogadores.get(i);
            Jogador proximoJogador = (i < jogadores.size() - 1) ? jogadores.get(i + 1) : null;

            if (proximoJogador != null && proximoJogador.getPontuacao() == jogadorAtual.getPontuacao()) {
                System.out.println(posicao + "º lugar: " + jogadorAtual.getNome() + " | Pontuação: " + jogadorAtual.getPontuacao() + " Empatou!");

                // Tratar todos os jogadores empatados
                int j = i + 1;
                while (j < jogadores.size() && jogadores.get(j).getPontuacao() == jogadorAtual.getPontuacao()) {
                    System.out.println(posicao + "º lugar: " + jogadores.get(j).getNome() + " | Pontuação: " + jogadores.get(j).getPontuacao() + " Empatou!");
                    j++;
                }
                i = j - 1; // Ajustar o índice corretamente
            } else if (posicao == 1) {
                System.out.println(posicao + "º lugar: " + jogadorAtual.getNome() + " | Pontuação: " + jogadorAtual.getPontuacao() + " Parabéns, você venceu!!!");
            } else {
                System.out.println(posicao + "º lugar: " + jogadorAtual.getNome() + " | Pontuação: " + jogadorAtual.getPontuacao());
            }
            posicao++;
        }
    }
}


