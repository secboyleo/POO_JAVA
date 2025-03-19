package application;

import Users.Usuario;

import java.util.Scanner;

public class teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Usuario[] vetor = new Usuario[10];
        boolean sistema = true;
        boolean usuario_existente = false;
        int i = 0;

        while (sistema){
            System.out.println();
            System.out.println("Bem-vindo ao Xunil" + "\n[1] Autenticar" + "\n[2] Criar" + "\n[3] Sair");
            System.out.print(">>>");
            int opcao = sc.nextInt();

            if(opcao == 1){
                if(usuario_existente == false){
                    System.out.println();
                    System.out.println("Nao existem usuarios criados");
                } else {
                    System.out.println();
                    System.out.print("LOGIN: ");
                    String login = sc.next();
                    System.out.print("SENHA: ");
                    String senha = sc.next();

                    for(Usuario user : vetor){
                        String nomeUser = user.getNome();

                        if(nomeUser.equals(login) && user.validarSenha(senha)){
                            System.out.println();
                            System.out.println("Logado com sucesso, " + login + " seja bem-vindo!");
                            break;
                        }
                    }
                }

            } else if(opcao == 2){
                System.out.println();
                System.out.print("Nome do Usuario: ");
                String nome = sc.next();
                System.out.print("Digite a senha: ");
                String senha = sc.next();

                if(usuario_existente == false){
                    vetor[i] = new Usuario(nome, senha);
                    i += 1;
                    System.out.println();
                    System.out.println("Usuario " + nome + " criado com sucesso");
                    usuario_existente = true;

                } else {
                    for(Usuario user : vetor){
                        String userNome = user.getNome();

                        if(userNome.equals(nome)){
                            System.out.println();
                            System.out.println("USUARIO " + nome + " JA EXISTE");
                            System.out.println("OPERACAO CANCELADA");
                            break;
                        } else{
                            vetor[i] = new Usuario(nome, senha);
                            i += 1;
                            usuario_existente = true;
                        }
                    }

                }
            } else if(opcao == 3){
                System.out.println();
                System.out.println("Encerrando sistema");
                sistema = false;
            } else {
                System.out.println();
                System.out.println("[Essa opcao nao existe!!]");
            }
        }
    }
}
