package br.com.fintech.fiap;
public class Usuario {
    //attributes
    private String nome;
    private String cpf;
    private String email;
    private String login;
    private String senha;
    private char genero;
    
    //methods
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    public void consultarUsuario(String email, String senha) {
        //empty
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
}