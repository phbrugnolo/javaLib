package controller;

import java.util.List;
import java.util.Scanner;

import model.Livros;
import java.util.ArrayList;

public class Emprestimo extends Livros {

    private List<Livro> livrosEmprestados;
    private String nome;

    public Emprestimo(List<Livro> lista) {
        super(lista);
        this.livrosEmprestados = new ArrayList<>();
        this.nome = "";
    }

    public void emprestarLivro(Livros listaLivros, Scanner scan) {
        System.out.println("Digite o nome do livro: ");
        nome = scan.nextLine();

        Livro livro = listaLivros.buscar(nome);
        
        if (livro != null) {
            livro.emprestar();
            livrosEmprestados.add(livro);
            livro.setQuantidade(livro.getQuantidade() - 1);
        } else {
            System.out.println("Livro indisponivel");
        }
    }

    public void devolverLivro(Livros listaLivros, Scanner scan) {
        System.out.println("Digite o nome do livro: ");
        nome = scan.nextLine();

        Livro livro = listaLivros.buscar(nome);

        if (listaLivros.buscar(nome) != null) {
            livrosEmprestados.remove(livro);
            livro.setQuantidade(livro.getQuantidade() + 1);
        } else {
            System.out.println("Livro indisponivel");
        }
    }

}
