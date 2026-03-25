package com.avaliacao;

import static org.mockito.Mockito.*;

import com.avaliacao.model.Certificado;
import com.avaliacao.model.Coordenador;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CoordenadorTest {

    @Mock
    private Certificado certificadoMock; // certificado mocado

    @Test
    void deveAprovarCertificadoQuandoCoordenadorAvaliar() {
        Coordenador coordenador = new Coordenador("12345");

        coordenador.avaliarCertificado(certificadoMock, true);

        //verifica se foi chamado colocando true lá no certificado.
        verify(certificadoMock).setFoiAprovado(true);
    }
}