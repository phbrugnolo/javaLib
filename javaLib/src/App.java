import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Emprestimo;
import controller.Livro;
import controller.User;
import view.*;

public class App {
    private static List<Livro> listaLivros = new ArrayList<>();
    private static List<User> listaUsers = new ArrayList<>();
    private static Emprestimo livEmprestimo = new Emprestimo(listaLivros);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        exibirMenu(scanner);

    }

    public static void exibirMenu(Scanner scan) {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Pesquisar livro");
            System.out.println("3. Cadastrar usuário");
            System.out.println("4. Emprestar livro");
            System.out.println("5. Devolver livro");
            System.out.println("6. Relatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    LivroView.cadastrarLivro(listaLivros, scanner);
                    break;
                case 2:
                    LivroView.pesquisarLivro(listaLivros, scanner);
                    break;
                case 3:
                    CadastroUser.cadastrarUser(listaUsers, scanner);
                    break;
                case 4:
                    livEmprestimo.emprestarLivro(livEmprestimo, scanner);
                    System.out.println(listaLivros);
                    break;
                case 5:
                    livEmprestimo.devolverLivro(livEmprestimo, scanner);
                    System.out.println(listaLivros);
                    break;
                case 6:
                    // relatorios();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
