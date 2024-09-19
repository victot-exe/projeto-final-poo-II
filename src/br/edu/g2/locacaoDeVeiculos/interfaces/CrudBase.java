package br.edu.g2.locacaoDeVeiculos.interfaces;

import java.util.List;

public interface CrudBase<T> {
    //C
    void insert(T t);
    //R
    T findById(int id);
    List<T> findAll();
    //porId?
    //U
    void update(T t);
    //D
    void delete(T t);
}
