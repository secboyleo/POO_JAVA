public class Imovel {
    protected String endereco;
    protected double preco;

    Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
}

class ImovelNovo extends Imovel{
    ImovelNovo(String endereco, double preco){
        super(endereco, preco);
    }

    double getAcrescimo(){
        return preco * 1.10;
    }

    public String toString(){
        return "IMOVEL NOVO \n" + "Endereco: " + endereco + " | $ " + String.format("%.2f", getAcrescimo());
    }
}

class ImovelVelho extends Imovel{
    ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }

    double getDesconto(){
        return preco * 0.90;
    }

    public String toString(){
        return "IMOVEL VELHO \n" + "Endereco: " + endereco + " | $ " + String.format("%.2f", getDesconto());
    }
}

class Main{
    public static void main(String[] args){
        String endereco = "Rua joao florismundo alberti";
        double valor = 1000.00;

        ImovelNovo imovelnovo = new ImovelNovo(endereco, valor);
        ImovelVelho imovelvelho = new ImovelVelho(endereco, valor);

        System.out.println(imovelnovo.toString());
        System.out.println();
        System.out.println(imovelvelho.toString());
    }
}

