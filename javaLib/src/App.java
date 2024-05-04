import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.Livro;
import view.*;

public class App {
    private static List<Livro> listaLivros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {
        exibirMenu();
        
        
    }
    
    public static void exibirMenu() {
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

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    CadastroLivro.cadastrarLivro(listaLivros);
                    System.out.println(listaLivros);
                    break;
                case 2:
                    // pesquisarLivro();
                    break;
                case 3:
                    // cadastrarUsuario();
                    break;
                case 4:
                    // emprestarLivro();
                    break;
                case 5:
                    // devolverLivro();
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
