package com.company;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String endereco,int telefone, String cnpj, String inscricaoEstadual, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaJuridica() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String dadosPessoaJuridica() {
        return super.dadosPessoa()+
                "cnpj='" + cnpj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", nomeFantasia='" + nomeFantasia;
    }
}
