import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Jogo jogo1 = new Jogo("god of war 1", 2000, "rpg", 50, 0, 2, 200);
        Jogo jogo2 = new Jogo("red dead redemption", 2010, "rpg", 50, 0, 2, 200);
        Jogo jogo3 = new Jogo("sekiro", 2020, "japao", 50, 0, 2, 399);

        ArrayList<Jogo> catalogo = new ArrayList<>();
        catalogo.add(jogo1);
        catalogo.add(jogo2);
        catalogo.add(jogo3);

        Catalogo catalogoUSer = new Catalogo(catalogo);
        Biblioteca bibliotecaDisponivel = new Biblioteca(catalogo);

        System.out.println("SISTEMA SEGA-BOXSTATION");
        System.out.println();

        while (true){
            System.out.println("JOGOS DISPONIVEIS: ");
            System.out.println();
            catalogoUSer.show();

            System.out.print("Qual o nome do usuario: ");
            String nome = sc.nextLine();
            Usuario user = new Usuario(nome, bibliotecaDisponivel);
            System.out.println();

            System.out.println("User " + nome + " criado.");
            System.out.println();

            System.out.println("HORA DA COMPRA (escolha um jogo)");
            System.out.print("Nome do jogo: ");
            String nomeJogo = sc.nextLine();
            System.out.print("Categoria: ");
            String categoria = sc.nextLine();
            System.out.print("Ano Lancamento: ");
            int anoLancamento = sc.nextInt();
            System.out.println();

            Jogo escolhaUser = user.escolherJogo(nomeJogo, categoria, anoLancamento);

            if (escolhaUser == null){
                System.out.println("Esse jogo nao esta disponovel");
            } else {
                while (escolhaUser == null){
                    System.out.println("HORA DA COMPRA (escolha um jogo)");
                    System.out.print("Nome do jogo: ");
                    nomeJogo = sc.nextLine();
                    System.out.print("Categoria: ");
                    categoria = sc.nextLine();
                    System.out.print("Ano Lancamento: ");
                    anoLancamento = sc.nextInt();
                    System.out.println();

                    escolhaUser = user.escolherJogo(nomeJogo, categoria, anoLancamento);
                }
            }

            System.out.println("Descontado $" + escolhaUser.getPreco() + " da sua carteira!");
            System.out.println();

            catalogoUSer.comprarJogo(escolhaUser.getNome());

            System.out.println("INFOMACOES ATUALIZADAS: ");
            catalogoUSer.show();

            break;
        }

        System.out.println("Fim do programa");
    }
}
