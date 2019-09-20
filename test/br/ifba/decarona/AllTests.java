/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona;

import br.ifba.decarona.controller.ControllerDeCaronaTest;
import br.ifba.decarona.model.*;
import br.ifba.decarona.util.ListaEncadeadaTest;

import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ListaEncadeadaTest.class,
	PontoTuristicoTest.class,
	CaronistaTest.class,
	TransporteTest.class,
	ControllerDeCaronaTest.class,
})
public class AllTests { }