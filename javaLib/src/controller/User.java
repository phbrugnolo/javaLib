package controller;

public class User extends Pessoa{
    private String email, endereco, tel;

    public User(String nome, String email, String endereco, String tel) {
        super(nome);
        this.email = email;
        this.endereco = endereco;
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User [nome= " + super.getNome() + ", email=" + email + ", endereco=" + endereco + ", tel=" + tel + "]";
    }

    

    

    
}
