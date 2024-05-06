package view;

import java.util.List;
import java.util.Scanner;

import controller.User;

public class CadastroUser {
    public static void cadastrarUser(List<User> listaUsers, Scanner scan) {

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();
        System.out.println("Digite seu email:");
        String email = scan.nextLine();
        System.out.println("Digite seu telefone:");
        String tel = scan.nextLine();
        System.out.println("Digite seu endereco:");
        String endereco = scan.nextLine();

        User novoUser = new User(nome, endereco, tel, email);
        listaUsers.add(novoUser);
        System.out.println("Usuario cadastrado com sucesso!");

    }
}
