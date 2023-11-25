package org.acme;
import org.acme.exception.ValorInvalidoException;
import org.acme.util.CadastroUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;



public class CadastroUtilTest {
    private void setInput(String entrada){
        System.setIn(new ByteArrayInputStream(entrada.getBytes()));
    }
    @Test
    @DisplayName("Testando se a variavel de entrada é um número")
    public void testaGetNumeroDeJogadoresComEntradaValida(){
        setInput("3");

        int resultado = CadastroUtil.getNumeroDeJogadores();
        assertEquals(3, resultado);
    }

    @Test
    @DisplayName("Testando se a variavel de entrada é invalida para numeros negativos")
    public void testaGetNumeroDeJogadoresComEntradaInvalidaParaNumeroNegativo(){
        setInput("-1");
        assertThrows(ValorInvalidoException.class, () ->
                CadastroUtil.getNumeroDeJogadores()
        );
    }
}
