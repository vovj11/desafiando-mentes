package org.acme;

import org.acme.jogador.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int numeroJogadores = getNumeroDeJogadores();
        //cadastra os jogadores
        List<Jogador> jogadores = new ArrayList<>();
        for(int i = 1; i <= numeroJogadores; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o seu nome: ");
            String nomeJogador = scanner.nextLine();
            Jogador jogador = new Jogador(nomeJogador);
            jogadores.add(jogador);
        }

        for(Jogador jogador : jogadores){
            System.out.println("Olá"+jogador);
        }

    }
    public static int getNumeroDeJogadores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de participantes: ");
        return scanner.nextInt();
    }
}
