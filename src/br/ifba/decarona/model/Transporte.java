/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.model;

import br.ifba.decarona.util.ListaEncadeada;

/**
 *
 * @author airto
 */
public class Transporte {
    public int id;
    public String placa;
    public String tipo;
    public double valor;
    public int capacidade;
    public int saida;
    public String localSaida;
    public int retorno;
    public String localRetorno;
    PontoTuristico Bloco;

    public PontoTuristico getBloco() {
        return Bloco;
    }

    public void setBloco(PontoTuristico Bloco) {
        this.Bloco = Bloco;
    }
    
    private int capacidadeAtual;

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }
    public ListaEncadeada<Caronista> ListaPassageiros = new ListaEncadeada<>();


    public Transporte() {
    }

    public Transporte(int id,String placa, String tipo, double valor, int capacidade, int saida, String localSaida, int retorno, String localRetorno, PontoTuristico Bloco) {
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
        this.capacidade = capacidade;
        this.saida = saida;
        this.localSaida = localSaida;
        this.retorno = retorno;
        this.localRetorno = localRetorno;
        this.Bloco = Bloco;
    }

    public Transporte(String placa, String tipo, double valor, int capacidade, int saida, String localSaida, int retorno, String localRetorno, PontoTuristico Bloco) {
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
        this.capacidade = capacidade;
        this.saida = saida;
        this.localSaida = localSaida;
        this.retorno = retorno;
        this.localRetorno = localRetorno;
        this.Bloco = Bloco;
    }
    
    

    public Transporte(int id, String placa, String tipo, double valor, int capacidade, int saida, String localSaida, int retorno, String localRetorno) {
        this.id = id;
        this.placa = placa;
        this.tipo = tipo;
        this.valor = valor;
        this.capacidade = capacidade;
        this.saida = saida;
        this.localSaida = localSaida;
        this.retorno = retorno;
        this.localRetorno = localRetorno;
        this.capacidadeAtual = capacidade;
    }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getNome(){
        return placa;
    }
    
    public void setNome(String nome){
        this.placa = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public String getLocalSaida() {
        return localSaida;
    }

    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }

    public int getRetorno() {
        return retorno;
    }

    public void setRetorno(int retorno) {
        this.retorno = retorno;
    }

    public String getLocalRetorno() {
        return localRetorno;
    }

    public void setLocalRetorno(String localRetorno) {
        this.localRetorno = localRetorno;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transporte other = (Transporte) obj;
        if (this.placa.equals(other.getPlaca())) {
            if(this.tipo.equals(other.getTipo())){
                if(Double.compare(this.valor, other.getValor()) == 0){
                    if(Integer.compare(this.capacidade, other.getCapacidade()) == 0){
                        if(Integer.compare(this.saida, other.getSaida()) == 0){
                            if(this.localSaida.equals(other.getLocalSaida())){
                                if(Integer.compare(this.retorno, other.getRetorno()) == 0){
                                    if(this.localRetorno.equals(this.getLocalRetorno()))
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
}
