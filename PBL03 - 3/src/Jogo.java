public class Jogo {
    private String nome;
    private int anoLancamento;
    private String categoria;
    private int votacaoPositiva;
    private int votacaoNegativa;
    private int quantidadeVendas;
    private double preco;

    public Jogo(String nome, int anoLancamento, String categoria, int votacaoPositiva, int votacaoNegativa, int quantidadeVendas, double preco){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
        this.votacaoPositiva = votacaoPositiva;
        this.votacaoNegativa = votacaoNegativa;
        this.quantidadeVendas = quantidadeVendas;
        this.preco = preco;
    }

    //-----------------------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVotacaoPositiva() {
        return votacaoPositiva;
    }

    public int getVotacaoNegativa() {
        return votacaoNegativa;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public double getPreco() {
        return preco;
    }

    //-----------------------------------------------------------------------------------------------
    public void contaVotos(boolean voto){
        if(voto){
            votacaoPositiva += 1;
        } else {
            votacaoNegativa += 1;
        }
    }

    public void vendas(int copiasVendidas){
        quantidadeVendas += copiasVendidas;
    }

    public void show(){
        System.out.println("GAME: " + nome);
    }
}
