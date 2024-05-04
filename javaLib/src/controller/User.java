package controller;

public class User extends Pessoa{
    private String email;
    private Integer id;
    private static int nextId = 0;

    public User(String nome, String endero, String tel, String email) {
        super(nome, endero, tel);
        this.email = email;
        this.id = nextId++;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + "]";
    }    
}
