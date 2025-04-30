public class EsporteRadical {
    public void manobras(){
        System.out.println("Adrenalina a mil...");
    }
}

class Skate extends EsporteRadical{
    @Override
    public void manobras() {
        System.out.println("Ollie, Flip, Nose");
    }
}

class Surf extends EsporteRadical{
    @Override
    public void manobras() {
        System.out.println("DuckDive, Pop-up");
    }
}

class Patinete extends EsporteRadical{
    @Override
    public void manobras() {
        System.out.println("Ollie, Manual, Tailwhip");
    }
}

class Main{
    public static void main(String[] args){
        EsporteRadical esport = new EsporteRadical();
        Skate skate = new Skate();
        Surf surf = new Surf();
        Patinete patinete = new Patinete();

        esport.manobras();
        skate.manobras();
        surf.manobras();
        patinete.manobras();
    }
}
