/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.model;


import java.util.List;
import java.util.ArrayList;
import br.ifba.decarona.controller.*;
import br.ifba.decarona.util.*;
import java.util.Objects;


/**
 *
 * @author airto
 */
public class PontoTuristico {
    private int id;
    private String nome;
    private String local;
    private int abertura;
    private int fechamento;

    public ArrayList<Transporte> LdeTcadastrados = new ArrayList<>();

    public PontoTuristico() {
    }

    public PontoTuristico(String nome, String local, int abertura, int fechamento) {
        this.nome = nome;
        this.local = local;
        this.abertura = abertura;
        this.fechamento = fechamento;
    }
    

    public PontoTuristico(int id,String nome, String local, int abertura, int fechamento) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.abertura = abertura;
        this.fechamento = fechamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getAbertura() {
        return abertura;
    }

    public void setAbertura(int abertura) {
        this.abertura = abertura;
    }

    public int getFechamento() {
        return fechamento;
    }

    public void setFechamento(int fechamento) {
        this.fechamento = fechamento;
    }
    

   @Override
    public boolean equals(Object obj) {
        /*if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }*/
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PontoTuristico other = (PontoTuristico) obj;
        if (this.nome.equals(other.getNome())) {
            if(this.local.equals(other.getLocal())){
                if(Integer.compare(this.abertura, other.abertura) == 0){
                    if(Integer.compare(this.fechamento, other.getFechamento()) == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        return hash;
    }
}
