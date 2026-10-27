package com.wylianedamaso.restaurant.cardapio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LancheTest {

    @Test
    void deveCriarLancheComDadosValidos(){
        Lanche lanche = new Lanche("X-Burger", 16.00);
        assertEquals("X-Burger", lanche.getNome());
        assertEquals(16.00, lanche.getPreco(), 0.001);
    }

    @Test
    void deveLancarErroQuandoPrecoForNegativo(){
        assertThrows(IllegalArgumentException.class, () -> new Lanche("X-Burger", -1.0));

    }

    @Test
    void deveLancarErroQuandoNomeForVazio(){
        assertThrows(IllegalArgumentException.class, () -> new Lanche("", 16.00));
    }

    @Test
    void deveLancarErroQuandoNomeForNull() {
        assertThrows(IllegalArgumentException.class, () -> new Lanche(null, 16.00));
    }


}
