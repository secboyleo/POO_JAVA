import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Jogo> biblioteca;

    public Biblioteca(){
    }

    public Biblioteca(ArrayList<Jogo> biblioteca){
        this.biblioteca = biblioteca;
    }

    public Jogo escolherJogo(String nome, String categoria, int anoLancamento){
        for(Jogo jogo : biblioteca){
            if (jogo.getNome().equals(nome) && jogo.getCategoria().equals(categoria) && jogo.getAnoLancamento() == anoLancamento){
                return jogo;
            }
        }
        return null;
    }
}
