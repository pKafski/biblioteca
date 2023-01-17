package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Criando um scanner para ler os dados de entrada
        Instanciando uma nova locacao (locacao 1 2 e 3)
         */
        Scanner scanner = new Scanner(System.in);
        Locacao locacao = new Locacao();
        Locacao locacao2 = new Locacao();
        Locacao locacao3 = new Locacao();
       /*
       Criando uma variavel do tipo byte: opcao
        */
        byte opcao;
        /*
        Criando uma estrutura que irá executar diversos comandos quando a conclusão estiver diferente de 0
        utilizando do while
         */
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
            /*
            Criando switch cases para as diferentes opções desejadas no programa
            Aqui foram utilizados 6 cases sendo que o 5º case tem 5 switch cases dentro dele sendo o 6º case o N0 que dá um break no programa           */
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro do funcionario \n " + "Digite seu nome: ");
                    locacao.getFuncionario().setNome(scanner.nextLine());
                    System.out.println("Digite seu CPF: ");
                    locacao.getFuncionario().setCpf(scanner.nextLong());
                    System.out.println("Digite seu salário");
                    locacao.getFuncionario().setSalario(scanner.nextDouble());
                    System.out.println("Digite seu cargo: ");
                    locacao.getFuncionario().setCargo(scanner.next());
                    scanner.nextLine();
                    System.out.print("Endereço------\n"
                            + "Rua: ");
                    locacao.getFuncionario().getEndereco().setRua(scanner.nextLine());
                    System.out.println("Digite o número");
                    locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite seu CEP: ");
                    locacao.getFuncionario().getEndereco().setCep(scanner.nextInt());
                    scanner.nextLine();
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
                    scanner.nextLine();
                    System.out.print("\nEndereço\n"
                            + "Rua: ");
                    locacao.getUsuario().getEndereco().setRua(scanner.nextLine());
                    System.out.println("Digite o número");
                    locacao.getUsuario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite seu CEP: ");
                    locacao.getUsuario().getEndereco().setCep(scanner.nextInt());
                    System.out.println("Digite seu bairro: \n ");
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
                        opcao = scanner.nextByte();
                        switch (opcao) {
                            case 1:
                                System.out.println(locacao.getFuncionario().toString());
                                break;
                            case 2:
                                System.out.println(locacao.getUsuario().toString());
                                break;
                            case 3:
                                System.out.println(locacao.getLivro().toString());
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("Opção inválida \n Digite novamente");
                        }
                    } while (opcao != 9);
                    break;
                case 5:
                    do {
                        System.out.println("Escolha a opção abaixo \n " +
                                "[1] Locar livro \n" +
                                "[2] Devolver livro \n" +
                                "[3] Mostrar dados do livro locado \n" +
                                "[4] Mostrar dados do livro devolvido \n" +
                                "[5] Sair da locação \n" +
                                "Digite aqui a opção: \n");
                        opcao = scanner.nextByte();
                        switch (opcao) {
                            case 1:
                                System.out.println("Insira os dados do livro: \n" + "Titulo");
                                locacao2.getLivro().setTitulo(scanner.nextLine());
                                System.out.println("Genero");
                                locacao2.getLivro().setGenero(scanner.nextLine());
                                System.out.println("Autor");
                                locacao2.getLivro().setAutor(scanner.nextLine());
                                break;
                            case 2:
                                System.out.println("Insira os dados do livro devolvido: \n" + "Titulo");
                                locacao3.getLivro().setTitulo(scanner.nextLine());
                                System.out.println("Genero");
                                locacao3.getLivro().setGenero(scanner.nextLine());
                                System.out.println("Autor");
                                locacao3.getLivro().setAutor(scanner.nextLine());
                                break;
                            case 3:
                                System.out.println("Dados do livro locado: \n" + locacao2.getLivro().toString());
                                break;
                            case 4:
                                System.out.println("Dados do livro devolvido: \n " + locacao3.getLivro().toString());
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida \n Digite novamente");
                        }

                    } while (opcao != 5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida \n Digite novamente");

            }
        } while (opcao != 0);
    }
}