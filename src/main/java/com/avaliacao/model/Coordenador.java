package com.avaliacao.model;
import java.util.Objects;
import java.util.Scanner;

public class Coordenador extends Usuario {
    
    private String numeroFuncionario;

    public void avaliarCertificado(Certificado certificado){

        Scanner scanner = new Scanner(System.in);
        certificado.toString();
        String r;
        System.out.println("Aprovar Certificado? Y/N");
        r = scanner.next();
        if(r.equals('Y')){
            certificado.setFoiAprovado(true);
        } else certificado.setFoiAprovado(false);
        scanner.close();

    }
    

    //Funções basicas, construtor full, construtor vazio, getters e setters, hashcode e equals e toString
    public Coordenador() {
    }

    public Coordenador(String numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public String getNumeroFuncionario() {
        return this.numeroFuncionario;
    }

    public void setNumeroFuncionario(String numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public Coordenador numeroFuncionario(String numeroFuncionario) {
        setNumeroFuncionario(numeroFuncionario);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coordenador)) {
            return false;
        }
        Coordenador coordenador = (Coordenador) o;
        return Objects.equals(numeroFuncionario, coordenador.numeroFuncionario);
    }

    @Override
    public String toString() {
        return "{" +
            " numeroFuncionario='" + getNumeroFuncionario() + "'" +
            "}";
    }
    

}
