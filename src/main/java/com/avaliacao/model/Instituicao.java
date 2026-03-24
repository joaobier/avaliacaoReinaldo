package com.avaliacao.model;
import java.util.List;
import java.util.Objects;

public class Instituicao {
    
    private String nome;
    private String cnpj;
    private String reitor;
    private List<Usuario> usuarios;

    //Funções basicas, construtor full, construtor vazio, getters e setters, hashcode e equals e toString
    public Instituicao() {
    }

    public Instituicao(String nome, String cnpj, String reitor, List<Usuario> usuarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.reitor = reitor;
        this.usuarios = usuarios;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getReitor() {
        return this.reitor;
    }

    public void setReitor(String reitor) {
        this.reitor = reitor;
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Instituicao nome(String nome) {
        setNome(nome);
        return this;
    }

    public Instituicao cnpj(String cnpj) {
        setCnpj(cnpj);
        return this;
    }

    public Instituicao reitor(String reitor) {
        setReitor(reitor);
        return this;
    }

    public Instituicao usuarios(List<Usuario> usuarios) {
        setUsuarios(usuarios);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Instituicao)) {
            return false;
        }
        Instituicao instituicao = (Instituicao) o;
        return Objects.equals(nome, instituicao.nome) && Objects.equals(cnpj, instituicao.cnpj) && Objects.equals(reitor, instituicao.reitor) && Objects.equals(usuarios, instituicao.usuarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cnpj, reitor, usuarios);
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cnpj='" + getCnpj() + "'" +
            ", reitor='" + getReitor() + "'" +
            ", usuarios='" + getUsuarios().toString() + "'" +
            "}";
    }
    

}
