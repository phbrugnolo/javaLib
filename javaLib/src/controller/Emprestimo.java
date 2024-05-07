package controller;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import model.Livros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Emprestimo {

    private List<Livro> livrosEmprestados;
    private String nome;

    public Emprestimo() {
        this.livrosEmprestados = new ArrayList<>();
        this.nome = "";
    }

    public void emprestarLivro(Livros listaLivros, Scanner scan) {
        System.out.println("Digite o nome do livro: ");
        nome = scan.nextLine();

        Livro livro = listaLivros.buscar(nome);

        if (livro != null && livro.getQuantidade() > 0) {
            livro.emprestar();
            livrosEmprestados.add(livro);
            livro.setQuantidade(livro.getQuantidade() - 1);
            System.out.println("Livro emprestado com sucesso");
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
            System.out.println("Livro devolvido com sucesso");
        } else {
            System.out.println("Livro indisponivel");
        }
    }

    public void gerarRelatorio() {
        Collections.sort(livrosEmprestados, Collections.reverseOrder());

        System.out.println("Relatório de livros mais emprestados:");
        Set<String> livrosExibidos = new HashSet<>();


        for (Livro livro : livrosEmprestados) {
            // Verificar se o livro já foi exibido
            if (!livrosExibidos.contains(livro.getTitulo())) {
                System.out.println("O livro " + livro.getTitulo() + " foi emprestado " + livro.getEmprestimos() + " vezes.");
                // Adicionar o título do livro ao conjunto de livros exibidos
                livrosExibidos.add(livro.getTitulo());
            }
        }
    }

}
