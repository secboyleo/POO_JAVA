import java.util.Locale;

class Cliente{
    private String nome;
    private double saldoConta;

    public Cliente(String nome, double saldoConta){
        this.nome = nome;
        this.saldoConta = saldoConta;
    }

    public void deposito(double dinheiro){
        saldoConta += dinheiro;
    }

    public void sacar(double dinheiro){
        if(dinheiro < saldoConta){
            saldoConta -= dinheiro;
        }
    }

    public void show(){
        System.out.printf("Nome: %s | Saldo: %.2f", nome, saldoConta);
        System.out.println();
    }
}

class Banco{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Cliente p1 = new Cliente("Jandira Silva", 2500.0);
        Cliente p2 = new Cliente("Sandra Rodrigues", 1800.0);
        Cliente p3 = new Cliente("Luciana Teixeira", 5000.0);

        p1.show();
        p2.show();
        p3.show();
        System.out.println();

        System.out.println("DADOS JANDIRA");
        p1.sacar(1000.0);
        p1.show();
        System.out.println();

        System.out.println("DADOS SANDRA");
        p2.sacar(2000.0);
        p2.deposito(500);
        p2.show();
        p2.sacar(2000);
        p2.show();
        System.out.println();

        System.out.println("DADOS LUCIANA");
        p3.deposito(1000);
        p3.show();
    }
}