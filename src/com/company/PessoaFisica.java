package com.company;

import java.util.Date;

public class PessoaFisica extends Pessoa{
    private String rg;
    private String cpf;
    private String dataNasc;

    public PessoaFisica(String nome, String endereco,int telefone, String rg, String cpf, String dataNasc) {
        super(nome, endereco,telefone);
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public PessoaFisica(String rg, String cpf, String dataNasc) {
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public PessoaFisica() {

    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String dadosPessoaFisica() {
        return super.dadosPessoa()+
                "\nRg: " + rg +
                "\nCPF: " + cpf +
                "\nData Nascimento: " + dataNasc;
    }
}
