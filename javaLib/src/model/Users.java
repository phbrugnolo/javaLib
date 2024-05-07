package model;

import java.util.List;
import controller.User;

public class Users extends Buscar<User> {

    public Users(List<User> lista) {
        super(lista);
    }

    @Override
    public User buscar(String email) {
        return lista.stream()
                .filter(u -> u.getEmail().toLowerCase().trim().equals(email.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public void adicionarUser(User user) {
        String email = user.getEmail();
        if (email.contains("@") && email.indexOf(".") > email.indexOf("@")) {
            if (buscar(email) == null) {
                lista.add(user);
            } else {
                throw new IllegalArgumentException("Já existe um usuário com o mesmo e-mail na lista.");
            }
        } else {
            throw new IllegalArgumentException("O email inserido não é válido.");
        }
    }
    

    @Override
    public String toString() {
        return "Users [users=" + lista + "]";
    }

}
