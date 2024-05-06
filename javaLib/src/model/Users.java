package model;

import java.util.List;
import controller.User;

public class Users extends Buscar<User> {

    public Users(List<User> lista) {
        super(lista);
    }

    @Override
    public User buscar(String nome) {
        return lista.stream()
                .filter(u -> u.getNome().toLowerCase().trim().equals(nome.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public void adicionarUser(User user) {

        if (buscar(user.getNome()) == null)
            lista.add(user);

    }

    @Override
    public String toString() {
        return "Users [users=" + lista + "]";
    }

    
}
