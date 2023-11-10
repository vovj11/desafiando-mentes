package org.acme.util;

import org.acme.jogador.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUtil {
    public static int getNumeroDeJogadores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de participantes: ");
        return scanner.nextInt();
    }

    public static List<Jogador> cadastroJogador(){
        List<Jogador> jogadores = new ArrayList<>();

        int numeroJogadores = getNumeroDeJogadores();

        for(int i = 1; i <= numeroJogadores; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o seu nome: ");
            String nomeJogador = scanner.nextLine();
            Jogador jogador = new Jogador(nomeJogador);
            jogadores.add(jogador);
        }

        return jogadores;

    }
}
