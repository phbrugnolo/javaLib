package view;

import java.util.Scanner;

import controller.User;
import model.Users;

public class CadastroUser {
    public static void cadastrarUser(Users listaUsers, Scanner scan) {

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        System.out.println("Digite seu email:");
        String email = scan.nextLine();
        System.out.println("Digite seu telefone:");
        int tel = scan.nextInt();
        System.out.println("Digite seu endereco:");
        String endereco = scan.nextLine();

        User novoUser = new User(nome, endereco, tel, email);
        listaUsers.adicionarUser(novoUser);
        System.out.println("Usuario cadastrado com sucesso!");

    }
}
