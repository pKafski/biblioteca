package org.example;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private long cep;


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }
    @Override
    public String toString() {
        return "\n"
                + "rua: " + rua + "\n"
                + "numero: " + numero + "\n"
                + "bairro: " + bairro + "\n"
                + "CEP: " + cep + "\n";
    }

}
