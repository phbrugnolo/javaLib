package controller;

import java.util.Scanner;

public class Livro extends Pessoa{
    private String autor, titulo;
    private int quantidade, ano;

    Scanner scan = new Scanner(System.in);
    
    public Livro() {
        System.out.println("Digite o nome do autor");
        this.autor = scan.nextLine();
        System.out.println("Digite o título do livro");
        this.titulo = scan.nextLine();
        System.out.println("Digite o ano de publicação");
        this.ano = scan.nextInt();
        System.out.println("Digite a quantidade de exemplares disponíveis");
        this.quantidade = scan.nextInt();

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
}
 
