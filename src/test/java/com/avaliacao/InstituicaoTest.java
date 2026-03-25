package com.avaliacao;

import com.avaliacao.model.Instituicao;
import com.avaliacao.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class InstituicaoTest {

    @Mock
    private Usuario usuarioMock;
    
    private Instituicao instituicao;

    public InstituicaoTest() {
    }

    @BeforeEach
    public void setUp() {
        this.instituicao = new Instituicao();
        this.instituicao.setNome("Faculdade Tech");
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testArmazenarUsuariosNaInstituicao() {
        Usuario user = new Usuario();
        user.setNome("Ana");
        
        List<Usuario> lista = new ArrayList<>();
        lista.add(user);

        this.instituicao.setUsuarios(lista);
        
        int expResult = 1;
        int resultado = this.instituicao.getUsuarios().size();
        
        assertEquals(expResult, resultado, "A instituição deve ter 1 usuário na lista.");
    }

    @Test
    public void testRecuperarNomeDeUsuarioMockado() {
        when(this.usuarioMock.getNome()).thenReturn("Usuario Falso Mockado");

        List<Usuario> lista = new ArrayList<>();
        lista.add(this.usuarioMock);
        this.instituicao.setUsuarios(lista);

        String resultado = this.instituicao.getUsuarios().get(0).getNome();
        String expResult = "Usuario Falso Mockado";
        
        assertEquals(expResult, resultado);
    }
}
