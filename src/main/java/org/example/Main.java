package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locacao locacao = new Locacao();
        Locacao locacao2 = new Locacao();
        Locacao locacao3 = new Locacao();
        byte opcao;
        do {
            System.out.println("Escolha uma opção abaixo: \n " +
                    "[1] - Cadastrar funcionario \n " +
                    "[2] - Cadastrar usuario \n " +
                    "[3] - Cadastrar livro \n " +
                    "[4] - Mostrar todos os dados do cadastro \n " +
                    "[5] - Ir para locação \n " +
                    "[0] - SAIR \n " +
                    "Digite aqui a opção desejada");
            opcao = scanner.nextByte();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro do funcionario \n " + "Digite seu nome: ");
                    locacao.getFuncionario().setNome(scanner.nextLine());
                    System.out.println("Digite seu CPF: ");
                    locacao.getFuncionario().setCpf(scanner.nextLong());
                    System.out.println("Digite seu cargo: ");
                    locacao.getFuncionario().setCargo(scanner.nextLine());
                    System.out.println("Digite seu salário");
                    locacao.getFuncionario().setSalario(scanner.nextDouble());
                    System.out.println("Digite seu endereço \n " + "Digite sua rua: ");
                    locacao.getFuncionario().getEndereco().setRua(scanner.nextLine());
                    System.out.println("Digite o número");
                    locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite seu CEP: ");
                    locacao.getFuncionario().getEndereco().setCep(scanner.nextInt());
                    System.out.println("Digite seu bairro: ");
                    locacao.getFuncionario().getEndereco().setBairro(scanner.nextLine());
                    break;

                case 2:
                    System.out.println("Cadastro do Usuario \n " + "Digite seu nome: ");
                    locacao.getUsuario().setNome(scanner.nextLine());
                    System.out.println("Digite seu número de usuario: ");
                    locacao.getUsuario().setCodigo(scanner.nextInt());
                    System.out.println("Digite seu CPF: ");
                    locacao.getUsuario().setCpf(scanner.nextInt());
                    System.out.println("Digite seu endereço \n " + "Digite sua rua: ");
                    locacao.getUsuario().getEndereco().setRua(scanner.nextLine());
                    System.out.println("Digite o número");
                    locacao.getUsuario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite seu CEP: ");
                    locacao.getUsuario().getEndereco().setCep(scanner.nextInt());
                    System.out.println("Digite seu bairro: ");
                    locacao.getUsuario().getEndereco().setBairro(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Cadastro de Livro \n " + "Digite o Titulo: ");
                    locacao.getLivro().setTitulo(scanner.nextLine());
                    System.out.println("Digite o gênero do livro");
                    locacao.getLivro().setGenero(scanner.nextLine());
                    System.out.println("Digite o Autor do livro");
                    locacao.getLivro().setAutor(scanner.nextLine());
                    break;
                case 4:
                    do {
                        System.out.println("Selecione o cadastro desejado \n " +
                                "[1] para FUNCIONÁRIO \n " +
                                "[2] para USUÁRIO \n " +
                                "[3] para LIVRO \n " +
                                "[9] para VOLTAR AO MENU PRINCIPAL");
                    }

            }


        }
    }