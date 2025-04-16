class Animal{
    protected String nome;
    protected String raca;

    Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    String caminhar(){
        return "Eu sou " + nome + ", sou um " + raca + ", ";
    }
}

class Cachorro extends Animal{
    Cachorro(String nome, String raca){
        super(nome, raca);
    }

    String late(){ return caminhar() + "AU AU AU!"; }
}

class Gato extends Animal{
    Gato(String nome, String raca){
        super(nome, raca);
    }

    String mia(){ return caminhar() + "Miau Miau!"; }
}

class Main{
    public static void main(String[] args){
        Gato gato = new Gato("Garfo", "Gato Siames");
        System.out.println(gato.mia());

        Cachorro dog = new Cachorro("Pipo", "Hotvailer");
        System.out.println(dog.late());
    }
}