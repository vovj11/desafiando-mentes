package org.acme.questionario;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Data
@AllArgsConstructor
public class Questionario {
    private String pergunta;
    private List<String> alternativas;
    private int alternativaCorreta;
    private String dica;

    public static List<Questionario> listaDeQuestoes() {
        List<Questionario> questoes = new ArrayList();

        String pergunta1 = "Digite a alternativa que contém o resultdo da soma entre 2 + 2?";
        List<String> alternativasPergunta1 = Arrays.asList("1) 1", "2) 3", "3) 6", "4) 4");
        questoes.add(new Questionario(pergunta1, alternativasPergunta1, 4, "Dica: É um número par"));

        String pergunta2 = "Digite a alternativa que contém o resultdo da multiplicação entre 3 * 10?";
        List<String> alternativasPergunta2 = Arrays.asList("1) 30", "2) 33", "3) 27", "4) 24");
        questoes.add(new Questionario(pergunta2, alternativasPergunta2, 1, "Dica: Termina com zero"));


        return questoes;
    }
}
