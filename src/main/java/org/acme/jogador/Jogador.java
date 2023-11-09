package org.acme.jogador;

import lombok.Data;

@Data
public class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome){
        this.nome = nome;
    }
}
