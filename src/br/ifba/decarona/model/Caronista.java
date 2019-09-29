/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.model;

import java.util.Objects;

/**
 *
 * @author airto
 */
public class Caronista {

   private String cpf;
   private String rg;
   private String nome;
   private int idade;

    public Caronista() {
        
    }

    public Caronista(String cpf, String rg, String nome, int idade) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
        final Caronista other = (Caronista) obj;
        if (this.nome.equals(other.getNome())) {
            if(this.cpf.equals(other.getCpf())){
                if(this.rg.equals(other.getRg())){
                    if(Integer.compare(this.idade, other.getIdade()) == 0){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
}
