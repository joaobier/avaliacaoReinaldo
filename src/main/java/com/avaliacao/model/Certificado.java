package com.avaliacao.model;
import java.util.Objects;

public class Certificado {
    
    private String tipo;
    private int tempoComtabilizado;
    private String momentoEnvio;
    private String urlArquivo;
    private Boolean foiAprovado;

    //Funções basicas, construtor full, construtor vazio, getters e setters, hashcode e equals e toString

    public Certificado() {
    }

    public Certificado(String tipo, int tempoComtabilizado, String momentoEnvio, String urlArquivo) {
        this.tipo = tipo;
        this.tempoComtabilizado = tempoComtabilizado;
        this.momentoEnvio = momentoEnvio;
        this.urlArquivo = urlArquivo;
        this.foiAprovado = false;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTempoComtabilizado() {
        return this.tempoComtabilizado;
    }

    public void setTempoComtabilizado(int tempoComtabilizado) {
        this.tempoComtabilizado = tempoComtabilizado;
    }

    public String getMomentoEnvio() {
        return this.momentoEnvio;
    }

    public void setMomentoEnvio(String momentoEnvio) {
        this.momentoEnvio = momentoEnvio;
    }

    public String getUrlArquivo() {
        return this.urlArquivo;
    }

    public void setUrlArquivo(String urlArquivo) {
        this.urlArquivo = urlArquivo;
    }

    public Boolean isFoiAprovado() {
        return this.foiAprovado;
    }

    public Boolean getFoiAprovado() {
        return this.foiAprovado;
    }

    public void setFoiAprovado(Boolean foiAprovado) {
        this.foiAprovado = foiAprovado;
    }

    public Certificado tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public Certificado tempoComtabilizado(int tempoComtabilizado) {
        setTempoComtabilizado(tempoComtabilizado);
        return this;
    }

    public Certificado momentoEnvio(String momentoEnvio) {
        setMomentoEnvio(momentoEnvio);
        return this;
    }

    public Certificado urlArquivo(String urlArquivo) {
        setUrlArquivo(urlArquivo);
        return this;
    }

    public Certificado foiAprovado(Boolean foiAprovado) {
        setFoiAprovado(foiAprovado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Certificado)) {
            return false;
        }
        Certificado certificado = (Certificado) o;
        return Objects.equals(tipo, certificado.tipo) && tempoComtabilizado == certificado.tempoComtabilizado && Objects.equals(momentoEnvio, certificado.momentoEnvio) && Objects.equals(urlArquivo, certificado.urlArquivo) && Objects.equals(foiAprovado, certificado.foiAprovado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, tempoComtabilizado, momentoEnvio, urlArquivo, foiAprovado);
    }

    @Override
    public String toString() {
        return "{" +
            " tipo='" + getTipo() + "'" +
            ", tempoComtabilizado='" + getTempoComtabilizado() + "'" +
            ", momentoEnvio='" + getMomentoEnvio() + "'" +
            ", urlArquivo='" + getUrlArquivo() + "'" +
            ", foiAprovado='" + isFoiAprovado() + "'" +
            "}";
    }
    

    

}
