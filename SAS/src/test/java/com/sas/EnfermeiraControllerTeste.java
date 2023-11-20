package com.sas;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import org.junit.Test;
import com.sas.dao.AtendenteDAO; 

public class EnfermeiraControllerTeste {

    @Test
    public void testCancelarConsulta() {
        // Configuração do Mock para o AtendenteDAO
        AtendenteDAO atendenteDAOMock = mock(AtendenteDAO.class);
        when(atendenteDAOMock.cancelarCon(anyString())).thenReturn(true);

        // Configuração do cenário
        EnfermeiraControllerTeste teste = new EnfermeiraControllerTeste();
        teste.setAtendenteDAO(atendenteDAOMock); // Supondo que você tenha um método setter para injetar a dependência

        // Execução do método
        String resultado = teste.cancelarConsulta("consulta123");

        // Verificação dos resultados
        assertEquals(null, resultado); // Espera-se que o método retorne null se a consulta for cancelada com sucesso

        // Verificação de interações com o mock
        verify(atendenteDAOMock, times(1)).cancelarCon("consulta123");
    }
}