package TemplateMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BitremTest {

    @Test
    void deveRetonarAprovado() {
        Bitrem bitrem = new Bitrem();
        bitrem.setPesoCaminhao(22);
        bitrem.setPesoCarga(25);
        assertEquals("Peso permitido para viagem", bitrem.verificacao());
    }

    @Test
    void deveRetonarReprovado() {
        Bitrem bitrem = new Bitrem();
        bitrem.setPesoCaminhao(22);
        bitrem.setPesoCarga(41);
        assertEquals("Peso acima do permitido!", bitrem.verificacao());
    }

    @Test
    void deveRetornarInformacoes() {
        Bitrem bitrem = new Bitrem();
        bitrem.setPesoCaminhao(22);
        bitrem.setPesoCarga(33);
        bitrem.setMarca("Iveco");
        assertEquals("Caminhão Bitrem {marca='Iveco', resultado=Peso permitido para viagem}", bitrem.getInformacoes());
    }
}
