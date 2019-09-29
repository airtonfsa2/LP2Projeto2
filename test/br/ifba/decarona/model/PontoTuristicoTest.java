/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.model;


import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

/**
 * Testes de unidade para a classe {@link PontoTuristicoTest}
 */
public class PontoTuristicoTest {

	private PontoTuristico ponto;	
	
	/**
     * Este método é executado antes de cada teste de unidade (testes a seguir), 
     * e serve para inicializar objetos que são utilizados nos testes.
     */
    @Before
    public void setUp() throws Exception {
    	ponto = new PontoTuristico("Teatro ABC", "Barra", 15, 22);
    }

    /**
     * Teste de unidade que verifica se os atributos de um ponto são atribuidos e 
     * modificados corretamente. Além disso, ele checa se o método equals que 
     * compara dois pontos foi implementado corretamente.
     */
    @Test
    public void testBasic() {
        assertEquals("Teatro ABC", ponto.getNome());
        assertEquals("Barra", ponto.getLocal());
        assertEquals(15, ponto.getAbertura());
        assertEquals(22, ponto.getFechamento());
        
        ponto.setNome("Museu da Vida");
        ponto.setLocal("Imbui");        
        ponto.setAbertura(10);
        ponto.setFechamento(17);
        assertEquals("Museu da Vida", ponto.getNome());
        assertEquals("Imbui", ponto.getLocal());
        assertEquals(10, ponto.getAbertura());
        assertEquals(17, ponto.getFechamento());
        
        PontoTuristico temp = new PontoTuristico("Museu da Vida", "Imbui", 10, 17);
        assertTrue(temp.equals(ponto));
        
        ponto.setNome("Shopping Paralela");        
        assertFalse(temp.equals(ponto));
        
        ponto.setLocal("Paralela");
        ponto.setNome("Museu da Vida");        
        assertFalse(temp.equals(ponto));
        
        ponto.setAbertura(10);  
        ponto.setFechamento(18);  
        ponto.setLocal("Imbui");              
        assertFalse(temp.equals(ponto));
    }
    
}

