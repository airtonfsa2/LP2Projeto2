/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.controller;

import br.ifba.decarona.model.PontoTuristico;
import br.ifba.decarona.controller.ControllerDeCarona;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import br.ifba.decarona.util.IIterador;

public class ControllerDeCaronaTest {

	private PontoTuristico ponto1, ponto2;	
	private Caronista c1, c2, c3;
	private Transporte t1, t2, t3;
	
	ControllerDeCarona cDC = new ControllerDeCarona();

	@Before
	public void setUp() throws Exception {		
	}

	@Test
	public void testCadastrarPonto() {
		assertEquals(0, cDC.pontos.tamanho());
		ponto1 = cDC.cadastrarPonto("Shopping Paralela", "Paralela", 9, 22);
		assertEquals(1, cDC.pontos.tamanho());
		ponto2 = cDC.cadastrarPonto("Museu do SOL", "Costa Azul", 15, 20);
		ponto3 = cDC.cadastrarPonto("Igreja de Santo Antônio", "Nazaré", 8, 18);
		assertEquals(3, cDC.pontos.tamanho());
	}
	
	@Test
	public void testCadastrarCaronista() {
		assertEquals(0, cDC.caronistas.tamanho());
		c1 = cDC.cadastrarCaronista("012345678-90", "666666 SSP/BA", "José Rubens", 30);  
		assertEquals(1, cDC.caronistas.tamanho());
		c2 = cDC.cadastrarCaronista("000000000-00", "666666 SSP/AC", "Antônio Vieira", 20);  
		c3 = cDC.cadastrarCaronista("111111111-11", "666666 SSP/PE", "Maria Flor", 40);  
		assertEquals(3, cDC.caronistas.tamanho());
	}
		
	@Test
	public void testCadastrarTransporte() {
		ponto1 = cDC.cadastrarPonto("Shopping Paralela", "Paralela", 9, 22);
		ponto2 = cDC.cadastrarPonto("Museu do SOL", "Costa Azul", 15, 20);
		ponto3 = cDC.cadastrarPonto("Igreja de Santo Antônio", "Nazaré", 8, 18);
				
		t1 = cDC.cadastrarTransporte("JQB0001", "Van", 470, 10, 14, "Reitoria UFBA - Canela", 
    						20, "Salvador-Rodoviaria", ponto1);
		
		t2 = cDC.cadastrarTransporte("OLX8888", "Ônibus", 800, 40, 11, "Aeroporto", 
        								21, "Hotel Cabula", ponto2);
		
		t3 = cDC.cadastrarTransporte("OLX1111", "Carro Utilitário", 200, 10, 12, "Pelourinho", 
									20, "Pousada Farol", ponto1);
		
		IIterador iterador = cDC.listarTransportes(ponto1);
		assertTrue(iterador.temProximo());
		Transporte proximoTransporte = (Transporte) iterador.proximo();
                assertSame(t1, proximoTransporte);	
		assertTrue(iterador.temProximo());
		proximoTransporte = (Transporte) iterador.proximo();
		assertSame(t3, proximoTransporte);	
		assertFalse(iterador.temProximo());
		
		iterador = cDC.listarTransportes(ponto2);
		assertTrue(iterador.temProximo());
		proximoTransporte = (Transporte) iterador.proximo();
		assertSame(t2, proximoTransporte);		
		assertFalse(iterador.temProximo());
		
		
		c1 = cDC.cadastrarCaronista("012345678-90", "666666 SSP/BA", "José Rubens", 30);
		c2 = cDC.cadastrarCaronista("000000000-00", "666666 SSP/AC", "Antônio Vieira", 20);
		c3 = cDC.cadastrarCaronista("111111111-11", "666666 SSP/PE", "Maria Flor", 40);
		
		
		assertTrue(cDC.registrarCaronistaEmTransporte(c1, t1));
		assertTrue(cDC.registrarCaronistaEmTransporte(c2, t2));		
		assertTrue(cDC.registrarCaronistaEmTransporte(c3, t2));
		assertFalse(cDC.registrarCaronistaEmTransporte(c3, t2));		
		
		
		iterador = cDC.listarCaronistas(t2);
		assertTrue(iterador.temProximo());
		Caronista proximoCaronista = (Caronista) iterador.proximo();
		assertSame(c2, proximoCaronista);		
		assertTrue(iterador.temProximo());
		proximoCaronista = (Caronista) iterador.proximo();
		assertSame(c3, proximoCaronista);
		assertFalse(iterador.temProximo());
		
		
		iterador = cDC.listarCaronistas(t1);
		assertTrue(iterador.temProximo());
		proximoCaronista = (Caronista) iterador.proximo();
		assertSame(c1, proximoCaronista);		
		assertFalse(iterador.temProximo());
				
	}

}
