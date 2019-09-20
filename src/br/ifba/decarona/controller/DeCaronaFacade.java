/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.controller;

import br.ifba.decarona.model.*;
import br.ifba.decarona.util.*;

/**
 *
 * @author Mãe de JoãoIf
 */
public class DeCaronaFacade {

    ControllerDeCarona cDC;

    public DeCaronaFacade() {
        this.cDC = new ControllerDeCarona();
    }

    //chamadas do cDC
    
    public PontoTuristico cadastrarPonto(String nome, String local, int abertura, int fechamento) {
        return cDC.cadastrarPonto(nome, local, abertura, fechamento);
    }

    public PontoTuristico obterPonto(int id) {
        return cDC.obterPonto(id);
    }

    public Transporte cadastrarTransporte(String placa, String tipo, double valor, int capacidade,
            int saida, String localSaida, int retorno, String localRetorno, PontoTuristico ponto) {
        return cDC.cadastrarTransporte(placa, tipo, valor, capacidade, saida, localSaida,
                retorno, localRetorno, ponto);
    }

    public Transporte obterTransporte(int id) {
        return cDC.obterTransporte(id);
    }

    public Caronista cadastrarCaronista(String cpf, String rg, String nome, int idade) {
        return cDC.cadastrarCaronista(cpf, rg, nome, idade);
    }

    public Caronista obterCaronista(String cpf) {
        return cDC.obterCaronista(cpf);
    }
    
    public IIterador listarPontos(String local, int abertura, int fechamento) {
        return this.cDC.listarPontos(local, abertura, fechamento);
    }

    public IIterador listarTransportes(PontoTuristico ponto) {
        return this.cDC.listarTransportes(ponto);
    }

    public boolean registrarCaronistaEmTransporte(Caronista caronista, Transporte transporte) {
        return this.cDC.registrarCaronistaEmTransporte(caronista, transporte);
    }

    public IIterador listarCaronistas(Transporte transporte) {
        return this.cDC.listarCaronistas(transporte);
    }

}
