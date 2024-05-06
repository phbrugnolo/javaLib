package model;

import java.util.List;

public abstract class Buscar<T> {

    protected List<T> lista;

    public Buscar(List<T> lista) {
        this.lista = lista;
    }

    abstract T buscar(String nome);

    public void adicionar(T objeto) {
        lista.add(objeto);
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}
