/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.decarona.util;

/**
 *
 * @author Mãe de JoãoIf
 */
public interface ILista {

    public boolean estaVazia();

    public int tamanho();

    public void insereInicio(Object o);

    public void insereFinal(Object o);

    public Object removeInicio();

    public Object removeUltimo();

    public Object recupera(int index);

    public IIterador iterador();

}
