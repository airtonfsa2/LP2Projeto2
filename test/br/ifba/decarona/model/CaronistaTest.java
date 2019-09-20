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
 * Testes de unidade para a classe {@link Caronista}
 */
public class CaronistaTest {

	private Caronista c;
	
	
	/**
     * Este método é executado antes de cada teste de unidade (testes a seguir), 
     * e serve para inicializar objetos que são utilizados nos testes.
     */
    @Before
    public void setUp() throws Exception {
        c = new Caronista("012345678-90", "666666 SSP/BA", "José Rubens", 30);        
    }

    /**
     * Teste de unidade que verifica se os atributos de um caronista são atribuidos e 
     * modificados corretamente. Além disso, ele checa se o método equals que 
     * compara dois caronistas foi implementado corretamente.
     */
    @Test
    public void testBasic() {
        assertEquals("012345678-90", c.getCpf());
        assertEquals("666666 SSP/BA", c.getRg());
        assertEquals("José Rubens", c.getNome());
        assertEquals(30, c.getIdade());
        
        c.setCpf("000000000-00");
        c.setRg("000000 SSP/AC");
        c.setNome("Ana Cecilia da Cruz");
        c.setIdade(20);
        assertEquals("000000000-00", c.getCpf());
        assertEquals("000000 SSP/AC", c.getRg());  
        assertEquals("Ana Cecilia da Cruz", c.getNome());
        assertEquals(20, c.getIdade());
        
        Caronista temp = new Caronista("000000000-00", "000000 SSP/AC", "Ana Cecilia da Cruz", 20);
        assertTrue(temp.equals(c));
        
        c.setCpf("000000000-01");        
        assertFalse(temp.equals(c));
        
        c.setRg("000001 SSP/PB");         
        c.setCpf("000000000-00");
        assertFalse(temp.equals(c));
        
        c.setNome("Carlos Correia");         
        c.setRg("000000 SSP/AC"); 
        assertFalse(temp.equals(c));
        
        c.setIdade(40);
        c.setNome("Ana Cecilia da Cruz");
        assertFalse(temp.equals(c));
    }
}
