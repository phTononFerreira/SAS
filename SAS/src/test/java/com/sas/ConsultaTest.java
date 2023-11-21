package com.sas;
import static org.junit.Assert.*;
import org.junit.Test;
import com.sas.model.Consulta;

public class ConsultaTest {

    @Test
    public void testCriacaoConsulta() {
        
        Consulta consulta = new Consulta();

        
        consulta.setId("123");
        consulta.setData("2023-11-20");
        consulta.setReceita("Prescrição médica...");
        consulta.setStatus(1);
        consulta.setPac_id("paciente123");
        consulta.setMed_id("medico456");
        consulta.setPro_id("procedimento789");
        consulta.setAte_id("atendente101");

        
        assertEquals("123", consulta.getId());
        assertEquals("2023-11-20", consulta.getData());
        assertEquals("Prescrição médica...", consulta.getReceita());
        assertEquals(1, consulta.getStatus());
        assertEquals("paciente123", consulta.getPac_id());
        assertEquals("medico456", consulta.getMed_id());
        assertEquals("procedimento789", consulta.getPro_id());
        assertEquals("atendente101", consulta.getAte_id());
    }

    @Test
    public void testToString() {
        
        Consulta consulta = new Consulta("456", "2023-11-21", "Receita 2", 2, "paciente789", "medico012", "procedimento345", "atendente678");

    
        assertEquals("Consulta{id=456, data=2023-11-21, receita=Receita 2, status=2, pac_id=paciente789, med_id=medico012, pro_id=procedimento345, ate_id=atendente678}", consulta.toString());
    }
}

