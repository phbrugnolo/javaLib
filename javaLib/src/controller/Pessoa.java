package controller;

public class Pessoa {
    private String nome, endero, tel;

    public Pessoa(String nome, String endero, String tel) {
        this.nome = nome;
        this.endero = endero;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndero() {
        return endero;
    }

    public void setEndero(String endero) {
        this.endero = endero;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
