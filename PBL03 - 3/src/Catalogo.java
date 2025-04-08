import java.util.ArrayList;

public class Catalogo {
    public ArrayList<Jogo> jogosCatalogo;

    public Catalogo(ArrayList<Jogo> catalogo){
        this.jogosCatalogo = catalogo;
    }

    public void comprarJogo(String nome){
        for(Jogo jogo : jogosCatalogo){
            if(jogo.getNome().equals(nome)){
                jogo.vendas(1);
            }
        }
    }

    public void show() {
        for (int i = 0; i < jogosCatalogo.size(); i++) {
            System.out.printf("%s | %d | %s | VP: %d | VN: %d | VnD: %d | $ %.2f%n", jogosCatalogo.get(i).getNome(), jogosCatalogo.get(i).getAnoLancamento(),
                    jogosCatalogo.get(i).getCategoria(), jogosCatalogo.get(i).getVotacaoPositiva(), jogosCatalogo.get(i).getVotacaoNegativa(), jogosCatalogo.get(i).getQuantidadeVendas(),
                    jogosCatalogo.get(i).getPreco());
            System.out.println();
        }
    }

}
