package model;

import java.util.List;
import controller.User;

public class Users extends Buscar<User> {
    private List<User> users;


    public Users(List<User> lista, List<User> users) {
        super(lista);
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


    @Override
    public User buscar(String nome) {
        return users.stream()
                      .filter(u -> u.getNome().equals(nome))
                      .findFirst()
                      .orElse(null);
    }

    public void adicionarUser(User user) {
        users.add(user);
    }

}
