package com.avaliacao;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // Habilita o Mockito
public class AppTest {

    @Test
    void testApp() {
        // Teste simples para confirmar que o JUnit 5 está rodando
        assertTrue(true);
    }
}
