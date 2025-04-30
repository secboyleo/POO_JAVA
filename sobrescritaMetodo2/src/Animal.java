public abstract class Animal{
    private float peso;
    private int idade;
    private int membros;

    Animal(float peso, int idade, int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    abstract void locomover();
    abstract void alimentar(String alimento);
    abstract void emitirSom();
}
//------------------------------------------------------------------
abstract class Mamifero extends Animal{
    private String corPelo;

    Mamifero(float peso, int idade, int membros, String corPelo){
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }
}

class Cachorro extends Mamifero{
    Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    void enterrarOsso(){
        System.out.println("Dog enterrou o osso");
    }

    void abanarRabo(){
        System.out.println("Dog abanou rabo");
    }

    @Override
    void locomover() {
        System.out.println("Dog andou e ronrronou");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Dog se alimentou");
    }

    @Override
    void emitirSom() {
        System.out.println("AU AU AU");
    }
}

class Canguro extends Mamifero{
    Canguro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    void usarBolsa(){
        System.out.println("Canguro usou a bolsa");
    }

    @Override
    void locomover() {
        System.out.println("Canguro Saltou");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Canguru se alimentou");
    }

    @Override
    void emitirSom() {
        System.out.println("Coff Coff");
    }

}

class Gato extends Mamifero{
    Gato(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    void miar() {
        System.out.println("Miau Miau");
    }

    @Override
    void locomover() {
        System.out.println("Gato andou e ronrronou");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Gato se alimentou");
    }

    @Override
    void emitirSom() {
        System.out.println("Miau Miau Miau");
    }
}
//------------------------------------------------------------------
abstract class Reptil extends Animal{
    private String corEscama;

    Reptil(float peso, int idade, int membros, String corEscama){
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
}

class Cobra extends Reptil{
    Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    void locomover() {
        System.out.println("Cobra Rasteja");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Cobra se alimentou");
    }

    @Override
    void emitirSom() {
    }
}

class Tartaruga extends Reptil{
    Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    void locomover() {
        System.out.println("Anda devagar");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Tartaruga se alimentou");
    }

    @Override
    void emitirSom() {
    }
}

//------------------------------------------------------------------
abstract class Peixe extends Animal {
    private String corEscama;

    Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    void soltarBolhas () {
        System.out.println("Peixe Soltou Bolhas");
    }
}

class PeixeBolha extends Peixe{
    PeixeBolha(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    void locomover() {
        System.out.println("Nadar");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("PeixeBolha se alimentou");
    }

    @Override
    void emitirSom() {
    }
}


class Kinguyo extends Peixe{
    Kinguyo(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    void locomover() {
        System.out.println("Nadar");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Kiguyo se alimentou");
    }

    @Override
    void emitirSom() {
    }
}
//------------------------------------------------------------------
abstract class Ave extends Animal{
    private String corPena;

    Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    void fazerNinho(){
        System.out.println("Passaro fez ninho");
    }
}

class Galinha extends Ave{

    Galinha(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    void locomover() {
        System.out.println("Voar baixo");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Galinha se alimentou");
    }

    @Override
    void emitirSom() {
        System.out.println("Cocorico!!!");
    }
}

class Arara extends Ave{
    Arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    void locomover() {
        System.out.println("Voar alto");
    }

    @Override
    void alimentar(String alimento) {
        System.out.println("Arara se alimentou");
    }

    @Override
    void emitirSom() {
        System.out.println("Arara Cantou!!!");
    }
}
//------------------------------------------------------------------
class Main {
    public static void main(String[] args){
        Mamifero mamifero = new Gato(10, 10, 1, "preto");
        mamifero.emitirSom();


    }
}
