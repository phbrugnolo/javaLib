package model;

import java.util.List;
import controller.Livro;

public class Livros {
    private List<Livro> livros;

    public Livros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    
}
