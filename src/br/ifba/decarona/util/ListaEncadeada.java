/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.util;

import java.util.Arrays;
/**
 *
 * @author Aluno
 * @param <E>
 */
public class ListaEncadeada<E> implements ILista {
    
    public Object elementos[];  
    public int tamanho = 0;

    public ListaEncadeada() {
        elementos = new Object[0];
    } 
    
    @Override
    public boolean estaVazia(){
        if(tamanho == 0){
            return true;
        }
        return false;
    }

    @Override
    public int tamanho(){
        return tamanho;
    }

    @Override
    public void insereInicio(Object o){
        Object temp[]= new Object[1];
        temp[0] = o;
        
        Object novo[] = new Object[elementos.length+1];
        
        System.arraycopy(temp, 0, novo, 0, 1);
        System.arraycopy(elementos, 0, novo , 1, tamanho);
        elementos = novo;
        
        tamanho++;
    }

    @Override
    public void insereFinal(Object o){
        if(tamanho == elementos.length)
            aumentaTamanho();
        
        E e = (E) o;
        elementos[tamanho++] = (E) e;
    }

    @Override
    public Object removeInicio(){
        Object aux = elementos[0];
        Object novo[] = new Object[tamanho];
        
        System.arraycopy(elementos, 1, novo, 0, tamanho-1);
        
        elementos = novo;
        tamanho--;
        return aux;
    }

    @Override
    public Object removeUltimo(){
        tamanho--;
        Object aux = elementos[tamanho];
        elementos[tamanho] = null;
        Object novo[] = new Object[tamanho];
        
        System.arraycopy(elementos, 0, novo, 0, tamanho);
        elementos = novo;

        return aux;
    }

    @Override
    public Object recupera(int index){
        return (E) elementos[index];
    }

    @Override
    public IIterador iterador(){
        IIterador lista = new IIteradorImpl(this);
        return lista;
    }

    private void aumentaTamanho(){
        int novoTamanho = elementos.length + 1;
        elementos = Arrays.copyOf(elementos, novoTamanho);
    }

    
}

    


