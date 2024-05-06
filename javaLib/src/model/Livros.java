package model;

import java.util.List;
import controller.Livro;

public class Livros extends Buscar<Livro> {

    public Livros(List<Livro> lista) {
        super(lista);
    }

    @Override
    public Livro buscar(String nome) {
        return lista.stream()
                .filter(l -> l.getTitulo().toLowerCase().trim().equals(nome.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public void adicionarLivro(Livro livro) {

        if (buscar(livro.getTitulo()) == null)
            lista.add(livro);

    }

    @Override
    public String toString() {
        return "Livros [livros=" + lista + "]";
    }

}
