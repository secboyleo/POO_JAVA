import java.util.ArrayList;

class Banco{
    private String nome;
    private ArrayList<Conta> contas;

    Banco(String nome){
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public void adicionaConta(Conta conta){
        contas.add(conta);
    }

    String getNome(){
        return this.nome;
    }
}

class Conta extends Banco{
    protected String nomeTitular;
    protected String numeroConta;
    protected double saldo;
    protected String dataAbertura;

    Conta(String nome, String nomeTitular, String numeroConta, double saldo, String dataAbertura){
        super(nome);
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    boolean sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

}

class ContaPoupanca extends Conta{
    private double taxaRendimento;

    ContaPoupanca(String nome, String nomeTitular, String numeroConta, double saldo, String dataAbertura, double taxaRendimento){
        super(nome, nomeTitular, numeroConta, saldo, dataAbertura);
        this.taxaRendimento = taxaRendimento;
    }

    boolean debitarRendimento(){
        if(saldo > 0){
            saldo = saldo * taxaRendimento;
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return String.format("Tipo: %s | Titular: %s | Numero: %s | Saldo: %.2f | data abertura: %s ", getNome(), nomeTitular, numeroConta, saldo, dataAbertura);
    }
}

class ContaCorrente extends Conta{
    private double taxaManutencao;

    ContaCorrente(String nome, String nomeTitular, String numeroConta, double saldo, String dataAbertura, double taxaManutencao){
        super(nome, nomeTitular, numeroConta, saldo, dataAbertura);
        this.taxaManutencao = taxaManutencao;
    }

    boolean debitarManutancao(){
        if(saldo > 0){
            saldo = saldo * taxaManutencao;
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return String.format("Tipo: %s | Titular: %s | Numero: %s | Saldo: %.2f | data abertura: %s ", getNome(), nomeTitular, numeroConta, saldo, dataAbertura);
    }
}

public class Main {
    public static void main(String[] args){
        Banco banco = new Banco("Nu-bank");

        ContaPoupanca conta1 = new ContaPoupanca("Poupanca", "Joao", "3030-1", 1000, "16/04/2025", 0.20);
        ContaCorrente conta2 = new ContaCorrente("Corrente", "Leticia", "3232-1", 2000, "15/04/2025", 3.0);

        banco.adicionaConta(conta1);
        banco.adicionaConta(conta2);

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());

        conta1.debitarRendimento();
        conta2.debitarManutancao();

        System.out.println();
        System.out.println("DADOS ATUALIZADOS");
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
}
