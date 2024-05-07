import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.*;
import model.Livros;
import model.Users;
import view.*;

public class App {
    private static Livros listaLivros = new Livros(new ArrayList<>());
    private static Users listaUsers = new Users(new ArrayList<>());
    private static Emprestimo livEmprestimo = new Emprestimo();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        registrarShutdownHook();

        try {
            exibirMenu(scanner);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }

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
                    livEmprestimo.emprestarLivro(listaLivros, scanner);
                    break;
                case 5:
                    livEmprestimo.devolverLivro(listaLivros, scanner);
                    break;
                case 6:
                    livEmprestimo.gerarRelatorio();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void registrarShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Programa fechado com Ctrl + C");
            }
        });
    }
}
