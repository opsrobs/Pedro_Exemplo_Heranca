package com.company;

public class Funcionario extends PessoaFisica {
    private float numeroRegistro;
    private String cargo;
    private String ctps;

    public Funcionario(String nome, String endereco, int telefone, String rg, String cpf, String dataNasc, float numeroRegistro, String cargo, String ctps) {
        super(nome, endereco, telefone, rg, cpf, dataNasc);
        this.numeroRegistro = numeroRegistro;
        this.cargo = cargo;
        this.ctps = ctps;
    }

    public Funcionario( float numeroRegistro, String cargo, String ctps) {
        this.numeroRegistro = numeroRegistro;
        this.cargo = cargo;
        this.ctps = ctps;
    }

    public float getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(float numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        return super.dadosPessoaFisica()+
                "\nNumero Registro: " + numeroRegistro +
                "\nCargo: "+ cargo +
                "\nCTPS: " + ctps;
    }
}
