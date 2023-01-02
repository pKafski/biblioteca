package org.example;

public class Locacao {
    private double valorLocacao;
    private double valorMulta;
    private Funcionario funcionario;
    private Usuario usuario;
    private Livro livro;
    private Data dataLocacao;
    private Data dataDevolucao;
    private Livro livroLocado;

    public Locacao() {
        this.valorLocacao = valorLocacao;
        this.valorMulta = valorMulta;
        this.funcionario = new Funcionario();
        this.usuario = new Usuario() ;
        this.livro = new Livro();
        this.dataLocacao = new Data();
        this.dataDevolucao = new Data();
        this.livroLocado = new Livro();

    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivroLocado() {
        return livroLocado;
    }

    public void setLivroLocado(Livro livroLocado) {
        this.livroLocado = livroLocado;
    }

    @Override
    public String toString() {
        return "\n"
                + "valorLocacao: " + valorLocacao + "\n"
                + "valorMulta: " + valorMulta + "\n"
                + "\n funcionario: " + funcionario+ ", usuario: " +  usuario + ", livro: " + livro + ", data de locação: "+ dataLocacao +", data de devolução: " + dataLocacao;
    }
}
