/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.controller;

import br.ifba.decarona.model.*;
import br.ifba.decarona.util.IIterador;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author airto
 */
public class ControllerDeCarona implements IIterador {
    
    PontoTuristico ponto = new PontoTuristico();

    List<PontoTuristico> listaPonto = new ArrayList<>();
    
    protected ControllerDeCarona pontos;
    Object caronistas;
    
    public PontoTuristico cadastrarPonto(String nome, String local, Integer abertura, Integer fechamento){
        
        PontoTuristico p1 = new PontoTuristico();
        listaPonto.add(p1);
        
    return p1;
    }
    
    public PontoTuristico obterPonto(Integer id){
   
    return null;
    }
    
    public Transporte cadastrarTransporte(String placa, String tipo, double valor, Integer capacidade, Integer saida, String localSaida, Integer retorno, String localRetorno,PontoTuristico ponto){
    return null;
}
    public Transporte obterTransporte(Integer id){
    return null;
    
    }
    
    public Caronista cadastrarCaronista(String cpf, String rg, String nome, int idade){
    return null;
    }
    
    public Caronista obterCaronista(String cpf){
    return null;
    }
    
   public IIterador listarPontos(String local, int abertura, int fechamento){

    return null;
    }
    
   public IIterador listarTransportes(PontoTuristico ponto){
    
    return null;
   }
    public boolean registrarCaronistaEmTransporte(Caronista caronista, Transporte transporte){
    return true;
    
    }
    
    public IIterador listarCaronistas(Transporte transporte){

    return null;
    }
    
    public PontoTuristico tamanho(PontoTuristico a){
    return null;
    }

    @Override
    public boolean temProximo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object proximo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object tamanho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}


