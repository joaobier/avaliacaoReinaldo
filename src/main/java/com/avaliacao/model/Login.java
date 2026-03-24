package com.avaliacao.model;

public class Login {
    
    private String email;
    private String senha;

    //Funções basicas, construtor full, construtor vazio, getters e setters, hashcode e equals e toString
    public boolean logar(String email, String senha){
        if(this.email == email && this.senha == senha){
            return true;
        }
        return false;
    }

    public Login() {
    }

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}