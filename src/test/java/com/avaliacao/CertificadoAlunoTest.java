package com.avaliacao;

import com.avaliacao.model.Aluno;
import com.avaliacao.model.Certificado;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gusta
 */
public class CertificadoAlunoTest {

    private Aluno aluno;

    @Mock
    private Certificado certificado;

    public CertificadoAlunoTest() {
    }

    @BeforeEach
    public void setUp() {
        this.aluno = new Aluno();
        this.aluno.setNome("Gustavo Rezende");
        this.aluno.setCertificados(new ArrayList<Certificado>());

        this.certificado = new Certificado();
        this.certificado.setTipo("Certificado PJ de Qualidade");
        this.certificado.setTempoComtabilizado(20);
        this.certificado.setFoiAprovado(false);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAdicionarCertificadoAoAluno() {
        this.aluno.adicionarCertificado(this.certificado);

        int quantidade = this.aluno.quantidadeCertificados();
        assertEquals(1, quantidade);

        Certificado certificadoSalvo = this.aluno.getCertificados().get(0);

        assertEquals("Certificado PJ de Qualidade", certificadoSalvo.getTipo());
        assertEquals(20, certificadoSalvo.getTempoComtabilizado());
        assertFalse(certificadoSalvo.getFoiAprovado());

        System.out.println("Certificado Aprovado");
    }
}