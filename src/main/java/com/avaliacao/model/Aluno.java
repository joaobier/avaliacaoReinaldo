package com.avaliacao.model;
import java.util.List;
import java.util.Objects;

public class Aluno extends Usuario {
    
    private String numeroMatricula;
    private String curso;
    private List<Certificado> certificados;

    public void adicionarCertificado(Certificado certificado){
        this.certificados.add(certificado); 
    }

    public int quantidadeCertificados(){
        return this.certificados.size();
    }

    public void apresentarCertificados(){
        System.out.println("Apresentando os certificados do aluno " + this.getNome());
        for (Certificado certificado : certificados) {
            certificado.toString();
        }
    }

    //Funções basicas, construtor full, construtor vazio, getters e setters, hashcode e equals e toString
    public Aluno() {
    }

    public Aluno(String numeroMatricula, String curso) {
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
    }


    public List<Certificado> getCertificados() {
        return this.certificados;
    }

    public void setCertificados(List<Certificado> certificados) {
        this.certificados = certificados;
    }

    public String getNumeroMatricula() {
        return this.numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno numeroMatricula(String numeroMatricula) {
        setNumeroMatricula(numeroMatricula);
        return this;
    }

    public Aluno curso(String curso) {
        setCurso(curso);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroMatricula, aluno.numeroMatricula) && Objects.equals(curso, aluno.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroMatricula, curso);
    }

    @Override
    public String toString() {
        return "{" +
            " numeroMatricula='" + getNumeroMatricula() + "'" +
            ", curso='" + getCurso() + "'" +
            "}";
    }
    

}
