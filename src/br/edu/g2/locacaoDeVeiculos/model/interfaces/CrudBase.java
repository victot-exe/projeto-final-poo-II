package br.edu.g2.locacaoDeVeiculos.model.interfaces;

import java.util.List;
//TODO Ainda não pensei como implementar o crud, talvez fazer uma especie de controler??
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
