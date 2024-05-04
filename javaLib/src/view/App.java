package view;
import java.util.ArrayList;
import java.util.Scanner;
import model.*;
import controller.*;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Livros Biblioteca = new Livros(new ArrayList<>());
        Users Usuarios = new Users(new ArrayList<>());

   
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
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;
                case 1:
                    Biblioteca.add(new Livro());
                    break;
                case 2:
                    pesquisarLivro();
                    break;
                case 3:
                    cadastrarUsuario();
                    break;
                case 4:
                    emprestarLivro();
                    break;
                case 5:
                    devolverLivro();
                    break;
                case 6:
                    relatorios();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    


    public static void pesquisarLivro() {
        System.out.println("Pesquisar livro...");
    }

    public static void cadastrarUsuario() {
        System.out.println("Cadastrar usuário...");
    }

    public static void emprestarLivro() {
        System.out.println("Emprestar livro...");
    }

    public static void devolverLivro() {
        System.out.println("Devolver livro...");
    }

    public static void relatorios() {
        System.out.println("Gerar relatórios...");
    }
}
