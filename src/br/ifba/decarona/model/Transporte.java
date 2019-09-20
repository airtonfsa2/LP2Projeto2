/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.model;

/**
 *
 * @author airto
 */
public class Transporte {
    private String placa;
    private String tipo;
    private double valor;
    private int capacidade;
    private int saida;
    private String localSaida;
    private int retorno;
    private String localRetorno;
    private PontoTuristico ponto;
   

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getSaida() {
        return saida;
    }

    public String getLocalSaida() {
        return localSaida;
    }

    public int getRetorno() {
        return retorno;
    }

    public String getLocalRetorno() {
        return localRetorno;
    }

    public PontoTuristico getPonto() {
        return ponto;
    }

    
}
