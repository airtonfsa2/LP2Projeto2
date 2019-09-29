/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.util;

/**
 *
 * @author airto
 */
public class IIteradorImpl implements IIterador {
    private int posicao;
    private final ListaEncadeada Lista;

    public IIteradorImpl(ListaEncadeada Lista) {
        this.Lista = Lista;
    }

    @Override
    public boolean temProximo(){
        return Lista.tamanho() != 0;
    }

    @Override
    public Object proximo(){
        if(temProximo()){
            return Lista.recupera(posicao++);
        }
        return null;
    }
    
}
