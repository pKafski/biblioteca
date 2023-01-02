package org.example;

public class Funcionario {
    private String nome;
    private long cpf;
    private String cargo;
    private double salario;
    private Endereco endereco;

    public Funcionario() {
        this.endereco = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n"
                + "nome: " + nome + "\n"
                + "cpf: " + cpf + "\n"
                + "cargo: " + cargo + "\n"
                + "salario: " + salario + "\n"
                + "endereco: " + endereco + "\n";
    }

}
