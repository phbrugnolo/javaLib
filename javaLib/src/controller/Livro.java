package controller;

public class Livro implements Comparable<Livro> {
    private String titulo, autor;
    private int ano, quantidade, emprestimos;

    public Livro(String titulo, String autor, int ano, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.quantidade = quantidade;
        this.emprestimos = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
    
    public int getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(int emprestimos) {
        this.emprestimos = emprestimos;
    }
    

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int compareTo(Livro o) {
        return Integer.compare(this.emprestimos, o.emprestimos);
    }

    public void emprestar(){
        this.emprestimos++;
    }


}
