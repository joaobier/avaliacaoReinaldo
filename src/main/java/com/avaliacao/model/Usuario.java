package com.avaliacao.model;
import java.util.Objects;

public class Usuario {
    
    private String nome;
    private String instituição;
    private String cpf;

    private Login login;
    private Instituicao instituicao;

    //Funções basicas, construtor full, construtor vazio, getters e setters, hashcode e equals e toString
    public Usuario() {
    }

    public Usuario(String nome, String instituição, Login login, Instituicao instituicao) {
        this.nome = nome;
        this.instituição = instituição;
        this.login = login;
        this.instituicao = instituicao;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituição() {
        return this.instituição;
    }

    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

    public Login getLogin() {
        return this.login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Instituicao getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public Usuario nome(String nome) {
        setNome(nome);
        return this;
    }

    public Usuario instituição(String instituição) {
        setInstituição(instituição);
        return this;
    }

    public Usuario login(Login login) {
        setLogin(login);
        return this;
    }

    public Usuario instituicao(Instituicao instituicao) {
        setInstituicao(instituicao);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(instituição, usuario.instituição) && Objects.equals(login, usuario.login) && Objects.equals(instituicao, usuario.instituicao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, instituição, login, instituicao);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", instituição='" + getInstituição() + "'" +
            ", login='" + getLogin() + "'" +
            ", instituicao='" + getInstituicao() + "'" +
            "}";
    }
    

}
