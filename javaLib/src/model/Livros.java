package model;

import java.util.List;
import controller.Livro;

public class Livros extends Buscar<Livro> {
    private List<Livro> livros;

    public Livros(List<Livro> lista, List<Livro> livros) {
        super(lista);
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public Livro buscar(String nome) {
        return livros.stream()
                .filter(l -> l.getTitulo().equals(nome))
                .findFirst()
                .orElse(null);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public String toString() {
        return "Livros [livros=" + livros + "]";
    }


    
}
