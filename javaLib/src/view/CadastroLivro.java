package view;

import java.util.List;
import java.util.Scanner;

import controller.Livro;

public class CadastroLivro {

    public static void cadastrarLivro(List<Livro> listaLivros) {

        Scanner scan = new Scanner(System.in);
        
        try {

            System.out.println("Digite o nome do autor:");
            String autor = scan.nextLine();
            System.out.println("Digite o título do livro:");
            String titulo = scan.nextLine();
            System.out.println("Digite o ano de publicação:");
            int ano = scan.nextInt();
            System.out.println("Digite a quantidade de exemplares disponíveis:");
            int quantidade = scan.nextInt();

            Livro novoLivro = new Livro(autor, titulo, ano, quantidade);
            listaLivros.add(novoLivro);
            System.out.println("Livro cadastrado com sucesso!");
        } finally {
            scan.close();
        }

    }
}
