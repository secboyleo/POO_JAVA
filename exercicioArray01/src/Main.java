import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Filme> listaFilmes = new ArrayList<>();

        for(int i=0; i<2; i++){
            System.out.print("Nome do " + (i + 1) + " filme: ");
            String nome = sc.nextLine();
            System.out.print("Ano de lancamento: ");
            int anoLancamento = sc.nextInt();
            sc.nextLine();
            System.out.println();
            Filme filme = new Filme(nome, anoLancamento);
            listaFilmes.add(filme);
        }

        for(Filme filme : listaFilmes){
            System.out.println(filme.toString());
        }
    }
}

class Filme{
    public String nome;
    public int anoLancamento;

    public Filme(String nome, int anoLancamento){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String toString(){
        return "Filme: " + nome + " " + " | Ano de lançamento: " +String.format("%d", anoLancamento);
    }
}
