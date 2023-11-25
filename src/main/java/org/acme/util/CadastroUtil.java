package org.acme.util;

import org.acme.exception.ValorInvalidoException;
import org.acme.jogador.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUtil {
    public static int getNumeroDeJogadores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de participantes: ");
        int quantidadeJogadores= scanner.nextInt();

        if(quantidadeJogadores <= 0){
            throw new ValorInvalidoException("Entrada inválida, digite um valor numerico maior que zero!");
        }

        return quantidadeJogadores;
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
