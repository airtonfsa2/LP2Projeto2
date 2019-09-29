/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.model;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;


/**
 * Testes de unidade para a classe {@link Transporte}
 */
public class TransporteTest {
    private Transporte t;
    private PontoTuristico ponto1, ponto2;
    
    /**
     * Este método é executado antes de cada teste de unidade (testes a seguir), 
     * e serve para inicializar objetos que são utilizados nos testes.
     */
    @Before
    public void setUp() throws Exception {
    	ponto1 = new PontoTuristico("Shopping Bela Vista", "Horto Bela Vista", 10, 23);
        ponto2 = new PontoTuristico("Igreja da Luz", "Horto Bela Vista", 10, 23);
        
    	t = new Transporte("JQB0001", "Van", 470, 10, 14, "Reitoria UFBA - Canela", 
    						20, "Salvador-Rodoviaria", ponto1);
    }
   
    /**
     * Teste de unidade que verifica se os atributos de um transporte são 
     * atribuidos e modificados corretamente. Além disso, ele checa se o método 
     * que compara dois transportes foi implementado corretamente.
     */
    @Test
    public void testBasic() {
    	assertEquals("JQB0001", t.getNome());
    	assertEquals("Van", t.getTipo());
        assertEquals(470.00, t.getValor(), 0);   
        assertEquals(10, t.getCapacidade());
        assertEquals(14, t.getSaida());
        assertEquals("Reitoria UFBA - Canela", t.getLocalSaida());
        assertEquals(20, t.getRetorno());
        assertEquals("Salvador-Rodoviaria", t.getLocalRetorno());
        assertTrue(ponto1.equals(t.getBloco()));
        
        t.setNome("OLX8888");
        t.setTipo("Ônibus");
        t.setValor(800);
        t.setCapacidade(40);        
        t.setSaida(11);
        t.setLocalSaida("Aeroporto");
    	t.setRetorno(21);
    	t.setLocalRetorno("Hotel Cabula");
    	t.setBloco(ponto2);

        assertEquals("OLX8888", t.getNome());
        assertEquals("Ônibus", t.getTipo());
        assertEquals(800.0, t.getValor(),0);
        assertEquals(40, t.getCapacidade());
        assertEquals(11, t.getSaida());
        assertEquals("Aeroporto", t.getLocalSaida());
        assertEquals(21, t.getRetorno());
        assertEquals("Hotel Cabula", t.getLocalRetorno());
        assertTrue(ponto2.equals(t.getBloco()));
        
        Transporte temp = new Transporte("OLX8888", "Ônibus", 800, 40, 11, "Aeroporto", 
        								21, "Hotel Cabula", ponto2);
        assertTrue(temp.equals(t));
        
        t.setNome("OLX1111");        
        assertFalse(temp.equals(t));
        
        t.setNome("OLX1111");
        t.setTipo("Carro Utilitário");         
        assertFalse(temp.equals(t));
        
        t.setTipo("Ônibus");
        t.setValor(200);          
        assertFalse(temp.equals(t));
        
        t.setValor(800);
        t.setCapacidade(10);
        assertFalse(temp.equals(t));
          
        t.setCapacidade(40);
        t.setSaida(12);
        assertFalse(temp.equals(t));        
        
        t.setSaida(11);
        t.setRetorno(20);
        assertFalse(temp.equals(t));        


    	t.setRetorno(21);
        t.setLocalSaida("Pelourinho");  
        assertFalse(temp.equals(t));
        
        t.setLocalSaida("Aeroporto");
        t.setLocalRetorno("Pousada Farol");           
        assertFalse(temp.equals(t));
        
        t.setLocalRetorno("Hotel Cabula"); 
        t.setBloco(ponto1);
        assertFalse(temp.getBloco().equals(t.getBloco()));
    }
}

   /*
private void assertEquals(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(String jqB0001, Object nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void assertEquals(int i, int capacidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 }
*/