package controller;

import java.util.List;
import java.util.Scanner;

import model.Livros;
import java.util.ArrayList;

public class Emprestimo {

    private List<Livro> livrosEmprestados;
    private Livros livrosDisponiveis;
    private String nome;

    public Emprestimo(Livros livrosDisponiveis) {
        this.livrosEmprestados = new ArrayList<>();
        this.livrosDisponiveis = livrosDisponiveis;
    }

    public void emprestarLivro(Livros listaLivros, Scanner scan) {
        System.out.println("Digite o nome do livro: ");
        nome = scan.nextLine();

        if (livrosDisponiveis.buscar(nome) != null) {
            livrosEmprestados.add(livro);
            livro.setQuantidade(livro.getQuantidade() - 1);
        } else {
            System.out.println("Livro indisponivel");
        }
    }

    public void devolverLivro(Livros listaLivros, Scanner scan) {
        System.out.println("Digite o nome do livro: ");
        nome = scan.nextLine();

        if (livrosDisponiveis.buscar(nome) != null) {
            livrosEmprestados.add(listaLivros.get);
            livro.setQuantidade(livro.getQuantidade() - 1);
        } else {
            System.out.println("Livro indisponivel");
        }
    }

}
