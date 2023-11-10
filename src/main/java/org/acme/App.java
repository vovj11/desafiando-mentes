package org.acme;

import org.acme.jogo.Jogo;
import org.acme.util.GraphicsUtil;

public class App 
{
    public static void main( String[] args )
    {
        GraphicsUtil menuBemVindo = new GraphicsUtil();
        Jogo jogo = new Jogo();
        menuBemVindo.getBoasVindas();
        jogo.iniciarJogo();


    }

}
