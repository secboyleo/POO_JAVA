public class Usuario {
    private String nome;
    public Biblioteca biblioteca;

    public Usuario(String nome, Biblioteca biblioteca){
        this.nome = nome;
        this.biblioteca = biblioteca;
    }

    public String getNome() {
        return nome;
    }

    public void votar(Jogo jogo, boolean voto){
        jogo.contaVotos(voto);
    }


    public Jogo escolherJogo(String nome, String categoria, int anoLancamento){
        return biblioteca.escolherJogo(nome, categoria, anoLancamento);
    }
}
