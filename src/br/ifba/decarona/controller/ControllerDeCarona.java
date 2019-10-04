/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.controller;

import br.ifba.decarona.model.*;
import br.ifba.decarona.util.IIterador;
import br.ifba.decarona.util.ListaEncadeada;


/**
 *
 * @author airto
 */
public class ControllerDeCarona{
    
    ListaEncadeada<Caronista> caronistas = new ListaEncadeada<>();
    ListaEncadeada<Transporte> transportes = new ListaEncadeada<>();
    ListaEncadeada<PontoTuristico> pontos = new ListaEncadeada<>();
    ListaEncadeada<Transporte> TemPonto = new ListaEncadeada<>();
    
    PontoTuristico ponto;
    Transporte transporte;
    Caronista caronista;
    
        PontoTuristico cadastrarPonto(String nome, String local, int abertura, int fechamento){
        IIterador it = pontos.iterador();
        
        ponto = new PontoTuristico(pontos.tamanho(), nome, local, abertura, fechamento);
        while(it.temProximo()){
            PontoTuristico aux = (PontoTuristico) it.proximo();
            if(ponto.equals(aux)){
                return null;
            }
        } 
        pontos.insereFinal(ponto);
        return ponto;
    }
    
    public PontoTuristico obterPonto(Integer id){
        
    return (PontoTuristico) pontos.recupera(id);
    }
    
     
    public Transporte cadastrarTransporte(String placa, String tipo, double valor, int capacidade, int saida, String localSaida, int retorno, String localRetorno, PontoTuristico ponto){
    IIterador it = transportes.iterador();
        
        transporte = new Transporte(transportes.tamanho(), placa, tipo, valor, capacidade, saida, localSaida, retorno, localRetorno, ponto);
        
        while(it.temProximo()){
            Transporte aux = (Transporte) it.proximo();
            if(transporte.equals(aux)){
                return null;
            }
        }
        
        transportes.insereFinal(transporte);
        return transporte;
}
    public Transporte obterTransporte(Integer id){
    return (Transporte) transportes.recupera(id);
    
    }
    
    public Caronista cadastrarCaronista(String cpf, String rg, String nome, int idade){
        caronista = new Caronista(cpf, rg, nome, idade);
        caronistas.insereFinal(caronista);
        return caronista;
    }
    
    public Caronista obterCaronista(String cpf){
        IIterador it = caronistas.iterador();
        
        while(it.temProximo()){
            Caronista aux = (Caronista) it.proximo();
            
            if(aux.getCpf().equals(cpf)){
                return (Caronista) aux;
            }
        }
        
        return null;
    }
    
   public IIterador listarPontos(String local, int abertura, int fechamento){

    IIterador it = pontos.iterador();
        
        while(it.temProximo()){
            PontoTuristico aux = (PontoTuristico) it.proximo();
            
            if(aux.getLocal().equals(local)){
                if(Integer.compare(aux.getAbertura(), abertura) > 0 && Integer.compare(aux.getFechamento(), fechamento) < 0){
                    return it;
                }
            }
        }
        
        return null;
    }
    
   public IIterador listarTransportes(PontoTuristico ponto){
    
        TemPonto = new ListaEncadeada<>();
        IIterador it = transportes.iterador();
        
        while(it.temProximo()){
            Transporte aux = (Transporte) it.proximo();
            
            if(ponto.equals(aux.getBloco())){
                TemPonto.insereFinal(aux);
            }
        }
        return TemPonto.iterador();
    }
    public boolean registrarCaronistaEmTransporte(Caronista caronista, Transporte transporte){
        IIterador it = transporte.ListaPassageiros.iterador();
        Caronista aux;
        
        while(it.temProximo()){
            aux = (Caronista) it.proximo();
            if(caronista.equals(aux)){
                return false;
            }
        }
        transporte.ListaPassageiros.insereFinal(caronista);
        return true;
    }
    
    public IIterador listarCaronistas(Transporte transporte){

    return transporte.ListaPassageiros.iterador();
    }

}