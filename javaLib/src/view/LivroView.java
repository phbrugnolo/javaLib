package view;

import java.util.List;
import java.util.Scanner;

import controller.Livro;
import model.Livros;

public class LivroView {

    public static void cadastrarLivro(List<Livro> listaLivros, Scanner scan) {

        System.out.println("Digite o título do livro:");
        String titulo = scan.nextLine();
        System.out.println("Digite o nome do autor:");
        String autor = scan.nextLine();
        System.out.println("Digite o ano de publicação:");
        int ano = scan.nextInt();
        System.out.println("Digite a quantidade de exemplares disponíveis:");
        int quantidade = scan.nextInt();

        Livro novoLivro = new Livro(autor, titulo, ano, quantidade);
        listaLivros.add(novoLivro);
        System.out.println("Livro cadastrado com sucesso!");

    }

    public static void pesquisarLivro(List<Livro> listaLivros, Scanner scan) {
        System.out.print("Digite o título do livro a ser pesquisado: ");
        String titulo = scan.nextLine();

        Livros livros = new Livros(listaLivros);
        Livro livroEncontrado = livros.buscar(titulo);

        if (livroEncontrado != null) {
            System.out.println("Livro encontrado:");
            System.out.println(livroEncontrado);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

}
