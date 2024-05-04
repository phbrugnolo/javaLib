package controller;

public abstract class Buscar {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public Funcionario buscarFuncionario(String nome) {
        return funcionarios
                .stream()
                .filter(d -> d.getNome().toLowerCase().equals(nome.toLowerCase()))
                .findFirst()
                .orElse(null);
    }
}
