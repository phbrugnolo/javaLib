package controller;

public class Livro {
    private String autor, titulo;
    private int quantidade, ano;


    

    public Livro(String autor, String titulo, int quantidade, int ano) {
        this.autor = autor;
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", titulo=" + titulo + ", quantidade=" + quantidade + ", ano=" + ano + "]";
    }


    
   
}
 
